package org.abcframework.common.logging;

import org.abcframework.common.logging.CommonLogFileTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Log4j2ConfigTest {
  private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2ConfigTest.class);
  private static final Logger LOGGER_EVENT =
      LoggerFactory.getLogger(CommonLogFileTypes.EVENT.code() + Log4j2ConfigTest.class.getName());
  private static final Logger LOGGER_PERF =
      LoggerFactory.getLogger(
          CommonLogFileTypes.PERFORMANCE.code() + Log4j2ConfigTest.class.getName());
  private static final Logger LOGGER_STATS =
      LoggerFactory.getLogger(
          CommonLogFileTypes.STATISTICS.code() + Log4j2ConfigTest.class.getName());
  private static final Logger LOGGER_SQL =
      LoggerFactory.getLogger(CommonLogFileTypes.SQL.code() + Log4j2ConfigTest.class.getName());

  @BeforeEach
  private void setHostNameInMdc() {
    MDC.put("HOSTNAME", "hostname");
  }

  @Test
  public void testLog4j2Exception() {
    LOGGER.error("error_message");
  }

  @Test
  public void testLog4j2CommonLogFileTypes() {
    System.out.println("loggerName:" + LOGGER_EVENT.getName());
    LOGGER_EVENT.info("event-message");
    LOGGER_PERF.info("perf-message");
    LOGGER_STATS.info("stats-message");
    LOGGER_SQL.info("sql-message");
  }
}
