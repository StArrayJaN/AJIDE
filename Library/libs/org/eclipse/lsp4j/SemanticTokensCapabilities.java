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
import org.eclipse.lsp4j.jsonrpc.messages.ResponseErrorCode;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.lsp4j.util.Preconditions;
import org.eclipse.lsp4j.util.ToStringBuilder;

/**
 * Since 3.16.0
 */
@SuppressWarnings("all")
public class SemanticTokensCapabilities extends DynamicRegistrationCapabilities {
  /**
   * Which requests the client supports and might send to the server.
   */
  @NonNull
  private SemanticTokensClientCapabilitiesRequests requests;

  /**
   * The token types that the client supports.
   * <p>
   * See {@link SemanticTokenTypes} for allowed values.
   */
  @NonNull
  private List<String> tokenTypes;

  /**
   * The token modifiers that the client supports.
   * <p>
   * See {@link SemanticTokenModifiers} for allowed values.
   */
  @NonNull
  private List<String> tokenModifiers;

  /**
   * The formats the client supports.
   * <p>
   * See {@link TokenFormat} for allowed values.
   */
  @NonNull
  private List<String> formats;

  /**
   * Whether the client supports tokens that can overlap each other.
   * <p>
   * Since 3.16.0
   */
  private Boolean overlappingTokenSupport;

  /**
   * Whether the client supports tokens that can span multiple lines.
   * <p>
   * Since 3.16.0
   */
  private Boolean multilineTokenSupport;

  /**
   * Whether the client allows the server to actively cancel a
   * semantic token request, e.g. supports returning
   * {@link ResponseErrorCode#ServerCancelled}.
   * If a server does, the client needs to retrigger the request.
   * <p>
   * Since 3.17.0
   */
  private Boolean serverCancelSupport;

  /**
   * Whether the client uses semantic tokens to augment existing
   * syntax tokens. If set to {@code true} client side created syntax
   * tokens and semantic tokens are both used for colorization. If
   * set to {@code false} the client only uses the returned semantic tokens
   * for colorization.
   * <p>
   * If the value is omitted then the client behavior is not
   * specified.
   * <p>
   * Since 3.17.0
   */
  private Boolean augmentsSyntaxTokens;

  public SemanticTokensCapabilities() {
  }

  public SemanticTokensCapabilities(final Boolean dynamicRegistration) {
    super(dynamicRegistration);
  }

  public SemanticTokensCapabilities(@NonNull final SemanticTokensClientCapabilitiesRequests requests, @NonNull final List<String> tokenTypes, @NonNull final List<String> tokenModifiers, @NonNull final List<String> formats) {
    this.requests = Preconditions.<SemanticTokensClientCapabilitiesRequests>checkNotNull(requests, "requests");
    this.tokenTypes = Preconditions.<List<String>>checkNotNull(tokenTypes, "tokenTypes");
    this.tokenModifiers = Preconditions.<List<String>>checkNotNull(tokenModifiers, "tokenModifiers");
    this.formats = Preconditions.<List<String>>checkNotNull(formats, "formats");
  }

  public SemanticTokensCapabilities(final Boolean dynamicRegistration, @NonNull final SemanticTokensClientCapabilitiesRequests requests, @NonNull final List<String> tokenTypes, @NonNull final List<String> tokenModifiers, @NonNull final List<String> formats) {
    super(dynamicRegistration);
    this.requests = Preconditions.<SemanticTokensClientCapabilitiesRequests>checkNotNull(requests, "requests");
    this.tokenTypes = Preconditions.<List<String>>checkNotNull(tokenTypes, "tokenTypes");
    this.tokenModifiers = Preconditions.<List<String>>checkNotNull(tokenModifiers, "tokenModifiers");
    this.formats = Preconditions.<List<String>>checkNotNull(formats, "formats");
  }

  /**
   * Which requests the client supports and might send to the server.
   */
  @NonNull
  public SemanticTokensClientCapabilitiesRequests getRequests() {
    return this.requests;
  }

  /**
   * Which requests the client supports and might send to the server.
   */
  public void setRequests(@NonNull final SemanticTokensClientCapabilitiesRequests requests) {
    this.requests = Preconditions.checkNotNull(requests, "requests");
  }

  /**
   * The token types that the client supports.
   * <p>
   * See {@link SemanticTokenTypes} for allowed values.
   */
  @NonNull
  public List<String> getTokenTypes() {
    return this.tokenTypes;
  }

  /**
   * The token types that the client supports.
   * <p>
   * See {@link SemanticTokenTypes} for allowed values.
   */
  public void setTokenTypes(@NonNull final List<String> tokenTypes) {
    this.tokenTypes = Preconditions.checkNotNull(tokenTypes, "tokenTypes");
  }

  /**
   * The token modifiers that the client supports.
   * <p>
   * See {@link SemanticTokenModifiers} for allowed values.
   */
  @NonNull
  public List<String> getTokenModifiers() {
    return this.tokenModifiers;
  }

  /**
   * The token modifiers that the client supports.
   * <p>
   * See {@link SemanticTokenModifiers} for allowed values.
   */
  public void setTokenModifiers(@NonNull final List<String> tokenModifiers) {
    this.tokenModifiers = Preconditions.checkNotNull(tokenModifiers, "tokenModifiers");
  }

  /**
   * The formats the client supports.
   * <p>
   * See {@link TokenFormat} for allowed values.
   */
  @NonNull
  public List<String> getFormats() {
    return this.formats;
  }

  /**
   * The formats the client supports.
   * <p>
   * See {@link TokenFormat} for allowed values.
   */
  public void setFormats(@NonNull final List<String> formats) {
    this.formats = Preconditions.checkNotNull(formats, "formats");
  }

  /**
   * Whether the client supports tokens that can overlap each other.
   * <p>
   * Since 3.16.0
   */
  public Boolean getOverlappingTokenSupport() {
    return this.overlappingTokenSupport;
  }

  /**
   * Whether the client supports tokens that can overlap each other.
   * <p>
   * Since 3.16.0
   */
  public void setOverlappingTokenSupport(final Boolean overlappingTokenSupport) {
    this.overlappingTokenSupport = overlappingTokenSupport;
  }

  /**
   * Whether the client supports tokens that can span multiple lines.
   * <p>
   * Since 3.16.0
   */
  public Boolean getMultilineTokenSupport() {
    return this.multilineTokenSupport;
  }

  /**
   * Whether the client supports tokens that can span multiple lines.
   * <p>
   * Since 3.16.0
   */
  public void setMultilineTokenSupport(final Boolean multilineTokenSupport) {
    this.multilineTokenSupport = multilineTokenSupport;
  }

  /**
   * Whether the client allows the server to actively cancel a
   * semantic token request, e.g. supports returning
   * {@link ResponseErrorCode#ServerCancelled}.
   * If a server does, the client needs to retrigger the request.
   * <p>
   * Since 3.17.0
   */
  public Boolean getServerCancelSupport() {
    return this.serverCancelSupport;
  }

  /**
   * Whether the client allows the server to actively cancel a
   * semantic token request, e.g. supports returning
   * {@link ResponseErrorCode#ServerCancelled}.
   * If a server does, the client needs to retrigger the request.
   * <p>
   * Since 3.17.0
   */
  public void setServerCancelSupport(final Boolean serverCancelSupport) {
    this.serverCancelSupport = serverCancelSupport;
  }

  /**
   * Whether the client uses semantic tokens to augment existing
   * syntax tokens. If set to {@code true} client side created syntax
   * tokens and semantic tokens are both used for colorization. If
   * set to {@code false} the client only uses the returned semantic tokens
   * for colorization.
   * <p>
   * If the value is omitted then the client behavior is not
   * specified.
   * <p>
   * Since 3.17.0
   */
  public Boolean getAugmentsSyntaxTokens() {
    return this.augmentsSyntaxTokens;
  }

  /**
   * Whether the client uses semantic tokens to augment existing
   * syntax tokens. If set to {@code true} client side created syntax
   * tokens and semantic tokens are both used for colorization. If
   * set to {@code false} the client only uses the returned semantic tokens
   * for colorization.
   * <p>
   * If the value is omitted then the client behavior is not
   * specified.
   * <p>
   * Since 3.17.0
   */
  public void setAugmentsSyntaxTokens(final Boolean augmentsSyntaxTokens) {
    this.augmentsSyntaxTokens = augmentsSyntaxTokens;
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("requests", this.requests);
    b.add("tokenTypes", this.tokenTypes);
    b.add("tokenModifiers", this.tokenModifiers);
    b.add("formats", this.formats);
    b.add("overlappingTokenSupport", this.overlappingTokenSupport);
    b.add("multilineTokenSupport", this.multilineTokenSupport);
    b.add("serverCancelSupport", this.serverCancelSupport);
    b.add("augmentsSyntaxTokens", this.augmentsSyntaxTokens);
    b.add("dynamicRegistration", getDynamicRegistration());
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
    SemanticTokensCapabilities other = (SemanticTokensCapabilities) obj;
    if (this.requests == null) {
      if (other.requests != null)
        return false;
    } else if (!this.requests.equals(other.requests))
      return false;
    if (this.tokenTypes == null) {
      if (other.tokenTypes != null)
        return false;
    } else if (!this.tokenTypes.equals(other.tokenTypes))
      return false;
    if (this.tokenModifiers == null) {
      if (other.tokenModifiers != null)
        return false;
    } else if (!this.tokenModifiers.equals(other.tokenModifiers))
      return false;
    if (this.formats == null) {
      if (other.formats != null)
        return false;
    } else if (!this.formats.equals(other.formats))
      return false;
    if (this.overlappingTokenSupport == null) {
      if (other.overlappingTokenSupport != null)
        return false;
    } else if (!this.overlappingTokenSupport.equals(other.overlappingTokenSupport))
      return false;
    if (this.multilineTokenSupport == null) {
      if (other.multilineTokenSupport != null)
        return false;
    } else if (!this.multilineTokenSupport.equals(other.multilineTokenSupport))
      return false;
    if (this.serverCancelSupport == null) {
      if (other.serverCancelSupport != null)
        return false;
    } else if (!this.serverCancelSupport.equals(other.serverCancelSupport))
      return false;
    if (this.augmentsSyntaxTokens == null) {
      if (other.augmentsSyntaxTokens != null)
        return false;
    } else if (!this.augmentsSyntaxTokens.equals(other.augmentsSyntaxTokens))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.requests== null) ? 0 : this.requests.hashCode());
    result = prime * result + ((this.tokenTypes== null) ? 0 : this.tokenTypes.hashCode());
    result = prime * result + ((this.tokenModifiers== null) ? 0 : this.tokenModifiers.hashCode());
    result = prime * result + ((this.formats== null) ? 0 : this.formats.hashCode());
    result = prime * result + ((this.overlappingTokenSupport== null) ? 0 : this.overlappingTokenSupport.hashCode());
    result = prime * result + ((this.multilineTokenSupport== null) ? 0 : this.multilineTokenSupport.hashCode());
    result = prime * result + ((this.serverCancelSupport== null) ? 0 : this.serverCancelSupport.hashCode());
    return prime * result + ((this.augmentsSyntaxTokens== null) ? 0 : this.augmentsSyntaxTokens.hashCode());
  }
}
