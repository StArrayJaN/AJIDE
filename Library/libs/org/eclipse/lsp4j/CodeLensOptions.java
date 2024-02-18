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
 * Code Lens options.
 */
@SuppressWarnings("all")
public class CodeLensOptions extends AbstractWorkDoneProgressOptions {
  /**
   * Code lens has a resolve provider as well.
   */
  private Boolean resolveProvider;

  public CodeLensOptions() {
  }

  public CodeLensOptions(final Boolean resolveProvider) {
    this.resolveProvider = resolveProvider;
  }

  /**
   * Code lens has a resolve provider as well.
   */
  public Boolean getResolveProvider() {
    return this.resolveProvider;
  }

  /**
   * Code lens has a resolve provider as well.
   */
  public void setResolveProvider(final Boolean resolveProvider) {
    this.resolveProvider = resolveProvider;
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("resolveProvider", this.resolveProvider);
    b.add("workDoneProgress", getWorkDoneProgress());
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
    CodeLensOptions other = (CodeLensOptions) obj;
    if (this.resolveProvider == null) {
      if (other.resolveProvider != null)
        return false;
    } else if (!this.resolveProvider.equals(other.resolveProvider))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    return 31 * super.hashCode() + ((this.resolveProvider== null) ? 0 : this.resolveProvider.hashCode());
  }
}
