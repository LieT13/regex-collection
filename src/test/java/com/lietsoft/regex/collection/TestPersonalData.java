package com.lietsoft.regex.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPersonalData {

  private static final String VALID_EMAIL = "info@lietsoft.com";
  private static final String EMAIL_WITHOUT_DOMAIN = "info@lietsoft";

  private static final String PHONE_NUMBER = "913078067";
  private static final String PHONE_NUMBER_WITH_PREFIX = "+34913078067";
  private static final String SHORT_PHONE_NUMBER = "9130780";

  @Test
  void testEmail() {
      Assertions.assertTrue(VALID_EMAIL.matches(PersonalData.EMAIL));
      Assertions.assertFalse(EMAIL_WITHOUT_DOMAIN.matches(PersonalData.EMAIL));
  }

  @Test
  void testPhoneNumber() {
    Assertions.assertTrue(PHONE_NUMBER.matches(PersonalData.PHONE_NUMBER));
    Assertions.assertTrue(PHONE_NUMBER_WITH_PREFIX.matches(PersonalData.PHONE_NUMBER));
    Assertions.assertFalse(SHORT_PHONE_NUMBER.matches(PersonalData.PHONE_NUMBER));
  }

}
