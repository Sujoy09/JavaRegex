package com.bridgelabz.JavaRegex;

import static org.junit.Assert.*;

public class EmailValidationTest {

    @org.junit.Test
    public void isEmailValid() {
        EmailValidation mail = new EmailValidation();

        assertTrue(mail.isEmailValid("abc.xyz@bridgelabz.co"));
        assertTrue(mail.isEmailValid("abc.100@yahoo.com"));
        assertTrue(mail.isEmailValid("abc112@gmail.net"));
        assertTrue(mail.isEmailValid("abc@1.com.au"));
        assertFalse(mail.isEmailValid("abc()*@bridgelabz.co"));
        assertFalse(mail.isEmailValid("abc@abc@gmail.co"));
        assertFalse(mail.isEmailValid("#abcd.def92@3452.abcd"));
        assertFalse(mail.isEmailValid("ab$c92@.yahoo.com.ina"));
        assertFalse(mail.isEmailValid("abc*xyz@bridgelabz.co.in"));
    }
}