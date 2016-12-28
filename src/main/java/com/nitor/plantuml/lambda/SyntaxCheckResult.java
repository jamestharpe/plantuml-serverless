package com.nitor.plantuml.lambda;

import java.util.List;

public class SyntaxCheckResult {

  private final boolean isError;
  private final List<String> errors;
  private final String diagramType;
  private final String errorLocation;
  private final List<String> suggestions;

  public SyntaxCheckResult(boolean isError, String diagramType, String errorLocation, List<String> errors, List<String> suggestions) {
    this.isError = isError;
    this.diagramType = diagramType;
    this.errorLocation = errorLocation;
    this.suggestions = suggestions;
    this.errors = errors;
  }

  public boolean isError() {
    return isError;
  }

  public List<String> getErrors() {
    return errors;
  }

  public String getDiagramType() {
    return diagramType;
  }

  public String getErrorLocation() {
    return errorLocation;
  }

  public List<String> getSuggestions() {
    return suggestions;
  }
}
