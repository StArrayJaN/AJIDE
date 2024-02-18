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

@SuppressWarnings("all")
public class SignatureHelpRegistrationOptions extends AbstractTextDocumentRegistrationAndWorkDoneProgressOptions {
  /**
   * The characters that trigger signature help automatically.
   */
  private List<String> triggerCharacters;

  /**
   * List of characters that re-trigger signature help.
   * <p>
   * These trigger characters are only active when signature help is already showing. All trigger characters
   * are also counted as re-trigger characters.
   * <p>
   * Since 3.15.0
   */
  private List<String> retriggerCharacters;

  public SignatureHelpRegistrationOptions() {
  }

  public SignatureHelpRegistrationOptions(final List<String> triggerCharacters) {
    this.triggerCharacters = triggerCharacters;
  }

  public SignatureHelpRegistrationOptions(final List<String> triggerCharacters, final List<String> retriggerCharacters) {
    this(triggerCharacters);
    this.retriggerCharacters = retriggerCharacters;
  }

  /**
   * The characters that trigger signature help automatically.
   */
  public List<String> getTriggerCharacters() {
    return this.triggerCharacters;
  }

  /**
   * The characters that trigger signature help automatically.
   */
  public void setTriggerCharacters(final List<String> triggerCharacters) {
    this.triggerCharacters = triggerCharacters;
  }

  /**
   * List of characters that re-trigger signature help.
   * <p>
   * These trigger characters are only active when signature help is already showing. All trigger characters
   * are also counted as re-trigger characters.
   * <p>
   * Since 3.15.0
   */
  public List<String> getRetriggerCharacters() {
    return this.retriggerCharacters;
  }

  /**
   * List of characters that re-trigger signature help.
   * <p>
   * These trigger characters are only active when signature help is already showing. All trigger characters
   * are also counted as re-trigger characters.
   * <p>
   * Since 3.15.0
   */
  public void setRetriggerCharacters(final List<String> retriggerCharacters) {
    this.retriggerCharacters = retriggerCharacters;
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("triggerCharacters", this.triggerCharacters);
    b.add("retriggerCharacters", this.retriggerCharacters);
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
    SignatureHelpRegistrationOptions other = (SignatureHelpRegistrationOptions) obj;
    if (this.triggerCharacters == null) {
      if (other.triggerCharacters != null)
        return false;
    } else if (!this.triggerCharacters.equals(other.triggerCharacters))
      return false;
    if (this.retriggerCharacters == null) {
      if (other.retriggerCharacters != null)
        return false;
    } else if (!this.retriggerCharacters.equals(other.retriggerCharacters))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.triggerCharacters== null) ? 0 : this.triggerCharacters.hashCode());
    return prime * result + ((this.retriggerCharacters== null) ? 0 : this.retriggerCharacters.hashCode());
  }
}
