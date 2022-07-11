package com.lietsoft.regex.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPersonalData {

    @Test
    void testEmail() {
        String validEmail = "info@lietsoft.com";
        String emailWithoutDomain = "info@lietsoft";

        Assertions.assertTrue(validEmail.matches(PersonalData.EMAIL));
        Assertions.assertFalse(emailWithoutDomain.matches(PersonalData.EMAIL));
    }

}
