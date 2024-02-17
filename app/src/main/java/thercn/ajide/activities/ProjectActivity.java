package thercn.ajide.activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import thercn.ajide.R;
import thercn.ajide.adapter.ProjectItemViewAdapter;
import thercn.ajide.adapter.ProjectViewAdapter;
import thercn.ajide.project.Project;
import thercn.ajide.utils.APPUtils;
import thercn.ajide.utils.Permission;
import thercn.ajide.utils.TLog;
import thercn.ajide.views.CreateProjectView;
import thercn.ajide.views.DisableScrollViewPager;

public class ProjectActivity extends AppCompatActivity {

	public static String SDCARD = Environment.getExternalStorageDirectory().toString();
	public static File appDir = new File(SDCARD + "/AJIDE");
	
	DisableScrollViewPager pager;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project);
		Permission.checkPermission(this);
		if (!Permission.isPermissionGranted(this)) {
			throw new IllegalAccessError("请同意权限申请！");
		}
		initAppDir();
		
		Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setTitle(R.string.app_name);
		
		View main = getLayoutInflater().inflate(R.layout.project_items,null);
		RecyclerView projectView = main.findViewById(R.id.projectList);
		projectView.setAdapter(new ProjectItemViewAdapter<String>(this,getProjects()));
		projectView.setLayoutManager(new GridLayoutManager(this,2));
		
		View settings = getLayoutInflater().inflate(R.layout.project_setting,null);
		pager = findViewById(R.id.project_viewpager);
		
		ProjectViewAdapter adapter = new ProjectViewAdapter();
		pager.setAdapter(adapter);
		adapter.addView(main);
		adapter.addView(settings);
		pager.setCurrentItem(0);
		
		initBottomView();
	}
    
	private void initAppDir() {
		final File classPath = new File(SDCARD + "/AJIDE/ClassPath");
		if (!appDir.exists() || !classPath.exists()) {
			appDir.mkdir();
			classPath.mkdirs();
		}
		String[] exportFiles = new String[]{"android.jar","core-lambda-stubs.jar"};
		for (String i : exportFiles) {
			if (!new File(classPath.getAbsolutePath() + "/" + i).exists()) {
				APPUtils.exportAssets(this, i, classPath.getAbsolutePath());
			}
		}
		try {
			Runtime.getRuntime().exec("logcat >" + SDCARD + "/AJIDE/IDE.log");
		} catch (IOException e) {
			TLog.e( e);
		}
	}
	
	private long firstBackTime;
	@Override
	public void onBackPressed() {
		if (System.currentTimeMillis() - firstBackTime > 1000) {
			Toast.makeText(this, "再按一次返回键退出程序", Toast.LENGTH_SHORT).show();
			firstBackTime = System.currentTimeMillis();
			return;
		}

		super.onBackPressed();
	}
	
	private List<String> getProjects() {
		File[] files = APPUtils.getFiles(appDir.getAbsolutePath());
		List<String> projects = new ArrayList<>();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory() && Project.isGradleProject(files[i])) {
				projects.add(files[i].getAbsolutePath());
			}
		}
		return projects;
	}
    
	private void initBottomView() {
		BottomNavigationView bnv = findViewById(R.id.bnv);
		bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
				public boolean onNavigationItemSelected(MenuItem item) {
					if (item.getItemId() == R.id.main) {
						pager.setCurrentItem(0);
					} else if (item.getItemId() == R.id.setting) {
						pager.setCurrentItem(1);
					} else {
						return false;
					}
					return true;
				}
			});
		bnv.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
			public void onNavigationItemReselected(MenuItem item) {
				if (item.getItemId() == R.id.main) {
					pager.setCurrentItem(0);
				} else if (item.getItemId() == R.id.setting) {
					pager.setCurrentItem(1);
				} else {
					return;
				}
			}
		});
		
		FloatingActionButton createProject = findViewById(R.id.fab);
		createProject.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
					showCreateProjectDialog();
				}
			});
	}
    
	private void showCreateProjectDialog() {
		final View createProjectView = new CreateProjectView(this).getView();
		AlertDialog dialog = new MaterialAlertDialogBuilder(this)
			.setTitle("创建项目")
			.setView(createProjectView)
			.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface dia, int which) {
				}
			})
			.setNegativeButton(android.R.string.cancel, null)
			.create();
		dialog.show();
	}
}