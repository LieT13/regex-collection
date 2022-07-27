package com.lietsoft.regex.collection;

public class PersonalData {

    public static final String EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

    public static final String PHONE_NUMBER = "^[\\+]?([0-9]{2})?[0-9]{9}$";

    private PersonalData() {}

}
