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

@SuppressWarnings("all")
public class InitializeError {
  /**
   * Indicates whether the client executes the following retry logic:
   * <ol>
   * <li>Show the message provided by the ResponseError to the user.
   * <li>User selects retry or cancel.
   * <li>If user selected retry the initialize method is sent again.
   * </ol>
   */
  private boolean retry;

  public InitializeError() {
  }

  public InitializeError(final boolean retry) {
    this.retry = retry;
  }

  /**
   * Indicates whether the client executes the following retry logic:
   * <ol>
   * <li>Show the message provided by the ResponseError to the user.
   * <li>User selects retry or cancel.
   * <li>If user selected retry the initialize method is sent again.
   * </ol>
   */
  public boolean isRetry() {
    return this.retry;
  }

  /**
   * Indicates whether the client executes the following retry logic:
   * <ol>
   * <li>Show the message provided by the ResponseError to the user.
   * <li>User selects retry or cancel.
   * <li>If user selected retry the initialize method is sent again.
   * </ol>
   */
  public void setRetry(final boolean retry) {
    this.retry = retry;
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("retry", this.retry);
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
    InitializeError other = (InitializeError) obj;
    if (other.retry != this.retry)
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    return 31 * 1 + (this.retry ? 1231 : 1237);
  }
}
