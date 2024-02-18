/**
 * Copyright (c) 2016-2018 TypeFox and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lsp4j;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.lsp4j.util.Preconditions;
import org.eclipse.lsp4j.util.ToStringBuilder;

/**
 * Registration options specific to a notebook.
 * <p>
 * Since 3.17.0
 */
@SuppressWarnings("all")
public class NotebookDocumentSyncRegistrationOptions {
  /**
   * The id used to register the request. The id can be used to deregister
   * the request again. See also {@link Registration#id}.
   */
  private String id;

  /**
   * The notebooks to be synced
   */
  @NonNull
  private List<NotebookSelector> notebookSelector;

  /**
   * Whether save notification should be forwarded to
   * the server. Will only be honored if mode === `notebook`.
   */
  private Boolean save;

  public NotebookDocumentSyncRegistrationOptions() {
    ArrayList<NotebookSelector> _arrayList = new ArrayList<NotebookSelector>();
    this.notebookSelector = _arrayList;
  }

  public NotebookDocumentSyncRegistrationOptions(@NonNull final List<NotebookSelector> notebookSelector) {
    this.notebookSelector = Preconditions.<List<NotebookSelector>>checkNotNull(notebookSelector, "notebookSelector");
  }

  public NotebookDocumentSyncRegistrationOptions(@NonNull final List<NotebookSelector> notebookSelector, final Boolean save) {
    this(notebookSelector);
    this.save = save;
  }

  /**
   * The id used to register the request. The id can be used to deregister
   * the request again. See also {@link Registration#id}.
   */
  public String getId() {
    return this.id;
  }

  /**
   * The id used to register the request. The id can be used to deregister
   * the request again. See also {@link Registration#id}.
   */
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * The notebooks to be synced
   */
  @NonNull
  public List<NotebookSelector> getNotebookSelector() {
    return this.notebookSelector;
  }

  /**
   * The notebooks to be synced
   */
  public void setNotebookSelector(@NonNull final List<NotebookSelector> notebookSelector) {
    this.notebookSelector = Preconditions.checkNotNull(notebookSelector, "notebookSelector");
  }

  /**
   * Whether save notification should be forwarded to
   * the server. Will only be honored if mode === `notebook`.
   */
  public Boolean getSave() {
    return this.save;
  }

  /**
   * Whether save notification should be forwarded to
   * the server. Will only be honored if mode === `notebook`.
   */
  public void setSave(final Boolean save) {
    this.save = save;
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("id", this.id);
    b.add("notebookSelector", this.notebookSelector);
    b.add("save", this.save);
    return b.toString();
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    NotebookDocumentSyncRegistrationOptions other = (NotebookDocumentSyncRegistrationOptions) obj;
    if (this.id == null) {
      if (other.id != null)
        return false;
    } else if (!this.id.equals(other.id))
      return false;
    if (this.notebookSelector == null) {
      if (other.notebookSelector != null)
        return false;
    } else if (!this.notebookSelector.equals(other.notebookSelector))
      return false;
    if (this.save == null) {
      if (other.save != null)
        return false;
    } else if (!this.save.equals(other.save))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.id== null) ? 0 : this.id.hashCode());
    result = prime * result + ((this.notebookSelector== null) ? 0 : this.notebookSelector.hashCode());
    return prime * result + ((this.save== null) ? 0 : this.save.hashCode());
  }
}
