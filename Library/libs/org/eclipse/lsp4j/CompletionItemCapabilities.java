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
 * The client supports the following {@link CompletionItem} specific capabilities.
 */
@SuppressWarnings("all")
public class CompletionItemCapabilities {
  /**
   * Client supports snippets as insert text.
   * <p>
   * A snippet can define tab stops and placeholders with `$1`, `$2`
   * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
   * the end of the snippet. Placeholders with equal identifiers are linked,
   * that is typing in one will update others too.
   */
  private Boolean snippetSupport;

  /**
   * Client supports commit characters on a completion item.
   * <p>
   * Since 3.2.0
   */
  private Boolean commitCharactersSupport;

  /**
   * Client supports the following content formats for the documentation
   * property. The order describes the preferred format of the client.
   * <p>
   * See {@link MarkupKind} for allowed values.
   * <p>
   * Since 3.3.0
   */
  private List<String> documentationFormat;

  /**
   * Client supports the deprecated property on a completion item.
   * <p>
   * Since 3.8.0
   */
  private Boolean deprecatedSupport;

  /**
   * Client supports the preselect property on a completion item.
   * <p>
   * Since 3.9.0
   */
  private Boolean preselectSupport;

  /**
   * Client supports the tag property on a completion item. Clients supporting
   * tags have to handle unknown tags gracefully. Clients especially need to
   * preserve unknown tags when sending a completion item back to the server in
   * a resolve call.
   * <p>
   * Since 3.15.0
   */
  private CompletionItemTagSupportCapabilities tagSupport;

  /**
   * Client support insert replace edit to control different behavior if a
   * completion item is inserted in the text or should replace text.
   * <p>
   * Since 3.16.0
   */
  private Boolean insertReplaceSupport;

  /**
   * Indicates which properties a client can resolve lazily on a completion
   * item. Before version 3.16.0 only the predefined properties {@link CompletionItem#documentation}
   * and {@link CompletionItem#detail} could be resolved lazily.
   * <p>
   * Since 3.16.0
   */
  private CompletionItemResolveSupportCapabilities resolveSupport;

  /**
   * The client supports the {@link CompletionItem#insertTextMode} property on
   * a completion item to override the whitespace handling mode
   * as defined by the client.
   * <p>
   * Since 3.16.0
   */
  private CompletionItemInsertTextModeSupportCapabilities insertTextModeSupport;

  /**
   * The client has support for completion item label details (see also {@link CompletionItemLabelDetails}).
   * <p>
   * Since 3.17.0
   */
  private Boolean labelDetailsSupport;

  public CompletionItemCapabilities() {
  }

  public CompletionItemCapabilities(final Boolean snippetSupport) {
    this.snippetSupport = snippetSupport;
  }

  /**
   * Client supports snippets as insert text.
   * <p>
   * A snippet can define tab stops and placeholders with `$1`, `$2`
   * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
   * the end of the snippet. Placeholders with equal identifiers are linked,
   * that is typing in one will update others too.
   */
  public Boolean getSnippetSupport() {
    return this.snippetSupport;
  }

  /**
   * Client supports snippets as insert text.
   * <p>
   * A snippet can define tab stops and placeholders with `$1`, `$2`
   * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
   * the end of the snippet. Placeholders with equal identifiers are linked,
   * that is typing in one will update others too.
   */
  public void setSnippetSupport(final Boolean snippetSupport) {
    this.snippetSupport = snippetSupport;
  }

  /**
   * Client supports commit characters on a completion item.
   * <p>
   * Since 3.2.0
   */
  public Boolean getCommitCharactersSupport() {
    return this.commitCharactersSupport;
  }

  /**
   * Client supports commit characters on a completion item.
   * <p>
   * Since 3.2.0
   */
  public void setCommitCharactersSupport(final Boolean commitCharactersSupport) {
    this.commitCharactersSupport = commitCharactersSupport;
  }

  /**
   * Client supports the following content formats for the documentation
   * property. The order describes the preferred format of the client.
   * <p>
   * See {@link MarkupKind} for allowed values.
   * <p>
   * Since 3.3.0
   */
  public List<String> getDocumentationFormat() {
    return this.documentationFormat;
  }

  /**
   * Client supports the following content formats for the documentation
   * property. The order describes the preferred format of the client.
   * <p>
   * See {@link MarkupKind} for allowed values.
   * <p>
   * Since 3.3.0
   */
  public void setDocumentationFormat(final List<String> documentationFormat) {
    this.documentationFormat = documentationFormat;
  }

  /**
   * Client supports the deprecated property on a completion item.
   * <p>
   * Since 3.8.0
   */
  public Boolean getDeprecatedSupport() {
    return this.deprecatedSupport;
  }

  /**
   * Client supports the deprecated property on a completion item.
   * <p>
   * Since 3.8.0
   */
  public void setDeprecatedSupport(final Boolean deprecatedSupport) {
    this.deprecatedSupport = deprecatedSupport;
  }

  /**
   * Client supports the preselect property on a completion item.
   * <p>
   * Since 3.9.0
   */
  public Boolean getPreselectSupport() {
    return this.preselectSupport;
  }

  /**
   * Client supports the preselect property on a completion item.
   * <p>
   * Since 3.9.0
   */
  public void setPreselectSupport(final Boolean preselectSupport) {
    this.preselectSupport = preselectSupport;
  }

  /**
   * Client supports the tag property on a completion item. Clients supporting
   * tags have to handle unknown tags gracefully. Clients especially need to
   * preserve unknown tags when sending a completion item back to the server in
   * a resolve call.
   * <p>
   * Since 3.15.0
   */
  public CompletionItemTagSupportCapabilities getTagSupport() {
    return this.tagSupport;
  }

  /**
   * Client supports the tag property on a completion item. Clients supporting
   * tags have to handle unknown tags gracefully. Clients especially need to
   * preserve unknown tags when sending a completion item back to the server in
   * a resolve call.
   * <p>
   * Since 3.15.0
   */
  public void setTagSupport(final CompletionItemTagSupportCapabilities tagSupport) {
    this.tagSupport = tagSupport;
  }

  /**
   * Client support insert replace edit to control different behavior if a
   * completion item is inserted in the text or should replace text.
   * <p>
   * Since 3.16.0
   */
  public Boolean getInsertReplaceSupport() {
    return this.insertReplaceSupport;
  }

  /**
   * Client support insert replace edit to control different behavior if a
   * completion item is inserted in the text or should replace text.
   * <p>
   * Since 3.16.0
   */
  public void setInsertReplaceSupport(final Boolean insertReplaceSupport) {
    this.insertReplaceSupport = insertReplaceSupport;
  }

  /**
   * Indicates which properties a client can resolve lazily on a completion
   * item. Before version 3.16.0 only the predefined properties {@link CompletionItem#documentation}
   * and {@link CompletionItem#detail} could be resolved lazily.
   * <p>
   * Since 3.16.0
   */
  public CompletionItemResolveSupportCapabilities getResolveSupport() {
    return this.resolveSupport;
  }

  /**
   * Indicates which properties a client can resolve lazily on a completion
   * item. Before version 3.16.0 only the predefined properties {@link CompletionItem#documentation}
   * and {@link CompletionItem#detail} could be resolved lazily.
   * <p>
   * Since 3.16.0
   */
  public void setResolveSupport(final CompletionItemResolveSupportCapabilities resolveSupport) {
    this.resolveSupport = resolveSupport;
  }

  /**
   * The client supports the {@link CompletionItem#insertTextMode} property on
   * a completion item to override the whitespace handling mode
   * as defined by the client.
   * <p>
   * Since 3.16.0
   */
  public CompletionItemInsertTextModeSupportCapabilities getInsertTextModeSupport() {
    return this.insertTextModeSupport;
  }

  /**
   * The client supports the {@link CompletionItem#insertTextMode} property on
   * a completion item to override the whitespace handling mode
   * as defined by the client.
   * <p>
   * Since 3.16.0
   */
  public void setInsertTextModeSupport(final CompletionItemInsertTextModeSupportCapabilities insertTextModeSupport) {
    this.insertTextModeSupport = insertTextModeSupport;
  }

  /**
   * The client has support for completion item label details (see also {@link CompletionItemLabelDetails}).
   * <p>
   * Since 3.17.0
   */
  public Boolean getLabelDetailsSupport() {
    return this.labelDetailsSupport;
  }

  /**
   * The client has support for completion item label details (see also {@link CompletionItemLabelDetails}).
   * <p>
   * Since 3.17.0
   */
  public void setLabelDetailsSupport(final Boolean labelDetailsSupport) {
    this.labelDetailsSupport = labelDetailsSupport;
  }

  @Override
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("snippetSupport", this.snippetSupport);
    b.add("commitCharactersSupport", this.commitCharactersSupport);
    b.add("documentationFormat", this.documentationFormat);
    b.add("deprecatedSupport", this.deprecatedSupport);
    b.add("preselectSupport", this.preselectSupport);
    b.add("tagSupport", this.tagSupport);
    b.add("insertReplaceSupport", this.insertReplaceSupport);
    b.add("resolveSupport", this.resolveSupport);
    b.add("insertTextModeSupport", this.insertTextModeSupport);
    b.add("labelDetailsSupport", this.labelDetailsSupport);
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
    CompletionItemCapabilities other = (CompletionItemCapabilities) obj;
    if (this.snippetSupport == null) {
      if (other.snippetSupport != null)
        return false;
    } else if (!this.snippetSupport.equals(other.snippetSupport))
      return false;
    if (this.commitCharactersSupport == null) {
      if (other.commitCharactersSupport != null)
        return false;
    } else if (!this.commitCharactersSupport.equals(other.commitCharactersSupport))
      return false;
    if (this.documentationFormat == null) {
      if (other.documentationFormat != null)
        return false;
    } else if (!this.documentationFormat.equals(other.documentationFormat))
      return false;
    if (this.deprecatedSupport == null) {
      if (other.deprecatedSupport != null)
        return false;
    } else if (!this.deprecatedSupport.equals(other.deprecatedSupport))
      return false;
    if (this.preselectSupport == null) {
      if (other.preselectSupport != null)
        return false;
    } else if (!this.preselectSupport.equals(other.preselectSupport))
      return false;
    if (this.tagSupport == null) {
      if (other.tagSupport != null)
        return false;
    } else if (!this.tagSupport.equals(other.tagSupport))
      return false;
    if (this.insertReplaceSupport == null) {
      if (other.insertReplaceSupport != null)
        return false;
    } else if (!this.insertReplaceSupport.equals(other.insertReplaceSupport))
      return false;
    if (this.resolveSupport == null) {
      if (other.resolveSupport != null)
        return false;
    } else if (!this.resolveSupport.equals(other.resolveSupport))
      return false;
    if (this.insertTextModeSupport == null) {
      if (other.insertTextModeSupport != null)
        return false;
    } else if (!this.insertTextModeSupport.equals(other.insertTextModeSupport))
      return false;
    if (this.labelDetailsSupport == null) {
      if (other.labelDetailsSupport != null)
        return false;
    } else if (!this.labelDetailsSupport.equals(other.labelDetailsSupport))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.snippetSupport== null) ? 0 : this.snippetSupport.hashCode());
    result = prime * result + ((this.commitCharactersSupport== null) ? 0 : this.commitCharactersSupport.hashCode());
    result = prime * result + ((this.documentationFormat== null) ? 0 : this.documentationFormat.hashCode());
    result = prime * result + ((this.deprecatedSupport== null) ? 0 : this.deprecatedSupport.hashCode());
    result = prime * result + ((this.preselectSupport== null) ? 0 : this.preselectSupport.hashCode());
    result = prime * result + ((this.tagSupport== null) ? 0 : this.tagSupport.hashCode());
    result = prime * result + ((this.insertReplaceSupport== null) ? 0 : this.insertReplaceSupport.hashCode());
    result = prime * result + ((this.resolveSupport== null) ? 0 : this.resolveSupport.hashCode());
    result = prime * result + ((this.insertTextModeSupport== null) ? 0 : this.insertTextModeSupport.hashCode());
    return prime * result + ((this.labelDetailsSupport== null) ? 0 : this.labelDetailsSupport.hashCode());
  }
}
