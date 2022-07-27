package com.lietsoft.regex.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMisc {

  private static final String ONLY_NUMBERS_STR = "123123";
  private static final String ONLY_LETTERS_STR = "ABCabc";
  private static final String NUMBERS_AND_LETTERS_STR = "123asd123";
  private static final String NUMBERS_AND_SYMBOLS = "123%&123";
  private static final String LETTERS_AND_SYMBOLS = "ABC%&abc";

  @Test
  void testOnlyNumbers() {
    Assertions.assertTrue(ONLY_NUMBERS_STR.matches(Misc.ONLY_NUMBERS));
    Assertions.assertFalse(ONLY_LETTERS_STR.matches(Misc.ONLY_NUMBERS));
    Assertions.assertFalse(NUMBERS_AND_LETTERS_STR.matches(Misc.ONLY_NUMBERS));
    Assertions.assertFalse(NUMBERS_AND_SYMBOLS.matches(Misc.ONLY_NUMBERS));
    Assertions.assertFalse(LETTERS_AND_SYMBOLS.matches(Misc.ONLY_NUMBERS));
  }

  @Test
  void testOnlyLetters() {
    Assertions.assertTrue(ONLY_LETTERS_STR.matches(Misc.ONLY_LETTERS));
    Assertions.assertFalse(ONLY_NUMBERS_STR.matches(Misc.ONLY_LETTERS));
    Assertions.assertFalse(NUMBERS_AND_LETTERS_STR.matches(Misc.ONLY_LETTERS));
    Assertions.assertFalse(NUMBERS_AND_SYMBOLS.matches(Misc.ONLY_LETTERS));
    Assertions.assertFalse(LETTERS_AND_SYMBOLS.matches(Misc.ONLY_LETTERS));
  }

}
