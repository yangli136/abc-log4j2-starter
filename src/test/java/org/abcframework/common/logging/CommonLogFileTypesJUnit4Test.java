package org.abcframework.common.logging;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommonLogFileTypesJUnit4Test {

  @Test
  public void testCodeMethod() {
    final CommonLogFileTypes[] values = CommonLogFileTypes.values();
    for (CommonLogFileTypes value : values) {
      assertEquals(value.code(), value.name() + ".");
    }
  }
}
