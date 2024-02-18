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

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.lsp4j.util.ToStringBuilder;

/**
 * The hover request is sent from the client to the server to request hover information at a given
 * text document position.
 */
@SuppressWarnings("all")
public class HoverParams extends TextDocumentPositionAndWorkDoneProgressParams {
  public HoverParams() {
  }

  public HoverParams(@NonNull final TextDocumentIdentifier textDocument, @NonNull final Position position) {
    super(textDocument, position);
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("workDoneToken", getWorkDoneToken());
    b.add("textDocument", getTextDocument());
    b.add("position", getPosition());
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
