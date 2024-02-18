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

import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.lsp4j.util.Preconditions;
import org.eclipse.lsp4j.util.ToStringBuilder;

/**
 * A workspace diagnostic document report.
 * <p>
 * Since 3.17.0
 */
@SuppressWarnings("all")
public class WorkspaceDocumentDiagnosticReport extends Either<WorkspaceFullDocumentDiagnosticReport, WorkspaceUnchangedDocumentDiagnosticReport> {
  public WorkspaceDocumentDiagnosticReport(@NonNull final WorkspaceFullDocumentDiagnosticReport workspaceFullDocumentDiagnosticReport) {
    super(Preconditions.<WorkspaceFullDocumentDiagnosticReport>checkNotNull(workspaceFullDocumentDiagnosticReport, "workspaceFullDocumentDiagnosticReport"), null);
  }

  public WorkspaceDocumentDiagnosticReport(@NonNull final WorkspaceUnchangedDocumentDiagnosticReport workspaceUnchangedDocumentDiagnosticReport) {
    super(null, Preconditions.<WorkspaceUnchangedDocumentDiagnosticReport>checkNotNull(workspaceUnchangedDocumentDiagnosticReport, "workspaceUnchangedDocumentDiagnosticReport"));
  }

  public WorkspaceFullDocumentDiagnosticReport getWorkspaceFullDocumentDiagnosticReport() {
    return super.getLeft();
  }

  public boolean isWorkspaceFullDocumentDiagnosticReport() {
    return super.isLeft();
  }

  public WorkspaceUnchangedDocumentDiagnosticReport getWorkspaceUnchangedDocumentDiagnosticReport() {
    return super.getRight();
  }

  public boolean isWorkspaceUnchangedDocumentDiagnosticReport() {
    return super.isRight();
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("left", getLeft());
    b.add("right", getRight());
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
    if (!super.equals(obj))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
