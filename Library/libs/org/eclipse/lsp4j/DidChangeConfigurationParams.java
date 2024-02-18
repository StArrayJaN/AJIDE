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

import com.google.gson.annotations.JsonAdapter;
import org.eclipse.lsp4j.jsonrpc.json.adapters.JsonElementTypeAdapter;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.lsp4j.util.Preconditions;
import org.eclipse.lsp4j.util.ToStringBuilder;

/**
 * A notification sent from the client to the server to signal the change of configuration settings.
 */
@SuppressWarnings("all")
public class DidChangeConfigurationParams {
  /**
   * The actual changed settings.
   */
  @NonNull
  @JsonAdapter(JsonElementTypeAdapter.Factory.class)
  private Object settings;

  public DidChangeConfigurationParams() {
  }

  public DidChangeConfigurationParams(@NonNull final Object settings) {
    this.settings = Preconditions.<Object>checkNotNull(settings, "settings");
  }

  /**
   * The actual changed settings.
   */
  @NonNull
  public Object getSettings() {
    return this.settings;
  }

  /**
   * The actual changed settings.
   */
  public void setSettings(@NonNull final Object settings) {
    this.settings = Preconditions.checkNotNull(settings, "settings");
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("settings", this.settings);
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
    DidChangeConfigurationParams other = (DidChangeConfigurationParams) obj;
    if (this.settings == null) {
      if (other.settings != null)
        return false;
    } else if (!this.settings.equals(other.settings))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    return 31 * 1 + ((this.settings== null) ? 0 : this.settings.hashCode());
  }
}