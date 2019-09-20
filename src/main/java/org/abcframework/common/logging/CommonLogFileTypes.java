package org.abcframework.common.logging;

public enum CommonLogFileTypes {
  EXCEPTION("EXCEPTION."),
  EVENT("EVENT."),
  PERFORMANCE("PERFORMANCE."),
  SERVER("SERVER."),
  SQL("SQL."),
  STATISTICS("STATISTICS.");

  private final String code;

  private CommonLogFileTypes(final String code) {
    this.code = code;
  }

  public String code() {
    return code;
  }
}
