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

import org.eclipse.lsp4j.util.ToStringBuilder;

/**
 * Rename options.
 * <p>
 * Referred to as {@code RenameRegistrationOptions} in the LSP spec.
 */
@SuppressWarnings("all")
public class RenameOptions extends AbstractTextDocumentRegistrationAndWorkDoneProgressOptions {
  /**
   * Renames should be checked and tested before being executed.
   */
  private Boolean prepareProvider;

  public RenameOptions() {
  }

  public RenameOptions(final Boolean prepareProvider) {
    this.prepareProvider = prepareProvider;
  }

  /**
   * Renames should be checked and tested before being executed.
   */
  public Boolean getPrepareProvider() {
    return this.prepareProvider;
  }

  /**
   * Renames should be checked and tested before being executed.
   */
  public void setPrepareProvider(final Boolean prepareProvider) {
    this.prepareProvider = prepareProvider;
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("prepareProvider", this.prepareProvider);
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
    RenameOptions other = (RenameOptions) obj;
    if (this.prepareProvider == null) {
      if (other.prepareProvider != null)
        return false;
    } else if (!this.prepareProvider.equals(other.prepareProvider))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    return 31 * super.hashCode() + ((this.prepareProvider== null) ? 0 : this.prepareProvider.hashCode());
  }
}
