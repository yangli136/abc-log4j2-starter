package org.abcframework.common.logging;

import static org.assertj.core.api.Assertions.*;

import org.abcframework.common.logging.CommonLogFileTypes;
import org.junit.jupiter.api.Test;

public class CommonLogFileTypesTest {

  @Test
  public void testCodeMethod() {
    final CommonLogFileTypes[] values = CommonLogFileTypes.values();
    for (CommonLogFileTypes value : values) {
      assertThat(value.code()).isEqualTo(value.name() + ".");
    }
  }
}
