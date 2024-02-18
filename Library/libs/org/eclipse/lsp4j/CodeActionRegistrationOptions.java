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

import java.util.List;
import org.eclipse.lsp4j.util.ToStringBuilder;

/**
 * Code Action registration options.
 */
@SuppressWarnings("all")
public class CodeActionRegistrationOptions extends AbstractTextDocumentRegistrationAndWorkDoneProgressOptions {
  /**
   * CodeActionKinds that this server may return.
   * <p>
   * The list of kinds may be generic, such as {@link CodeActionKind#Refactor}, or the server
   * may list out every specific kind they provide.
   * <p>
   * Since 3.11.0
   */
  private List<String> codeActionKinds;

  /**
   * The server provides support to resolve additional
   * information for a code action.
   * <p>
   * Since 3.16.0
   */
  private Boolean resolveProvider;

  public CodeActionRegistrationOptions() {
  }

  public CodeActionRegistrationOptions(final List<String> codeActionKinds) {
    this.codeActionKinds = codeActionKinds;
  }

  /**
   * CodeActionKinds that this server may return.
   * <p>
   * The list of kinds may be generic, such as {@link CodeActionKind#Refactor}, or the server
   * may list out every specific kind they provide.
   * <p>
   * Since 3.11.0
   */
  public List<String> getCodeActionKinds() {
    return this.codeActionKinds;
  }

  /**
   * CodeActionKinds that this server may return.
   * <p>
   * The list of kinds may be generic, such as {@link CodeActionKind#Refactor}, or the server
   * may list out every specific kind they provide.
   * <p>
   * Since 3.11.0
   */
  public void setCodeActionKinds(final List<String> codeActionKinds) {
    this.codeActionKinds = codeActionKinds;
  }

  /**
   * The server provides support to resolve additional
   * information for a code action.
   * <p>
   * Since 3.16.0
   */
  public Boolean getResolveProvider() {
    return this.resolveProvider;
  }

  /**
   * The server provides support to resolve additional
   * information for a code action.
   * <p>
   * Since 3.16.0
   */
  public void setResolveProvider(final Boolean resolveProvider) {
    this.resolveProvider = resolveProvider;
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("codeActionKinds", this.codeActionKinds);
    b.add("resolveProvider", this.resolveProvider);
    b.add("workDoneProgress", getWorkDoneProgress());
    b.add("documentSelector", getDocumentSelector());
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
    CodeActionRegistrationOptions other = (CodeActionRegistrationOptions) obj;
    if (this.codeActionKinds == null) {
      if (other.codeActionKinds != null)
        return false;
    } else if (!this.codeActionKinds.equals(other.codeActionKinds))
      return false;
    if (this.resolveProvider == null) {
      if (other.resolveProvider != null)
        return false;
    } else if (!this.resolveProvider.equals(other.resolveProvider))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.codeActionKinds== null) ? 0 : this.codeActionKinds.hashCode());
    return prime * result + ((this.resolveProvider== null) ? 0 : this.resolveProvider.hashCode());
  }
}
