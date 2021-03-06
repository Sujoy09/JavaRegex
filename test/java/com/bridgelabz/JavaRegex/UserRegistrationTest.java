package com.bridgelabz.JavaRegex;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhileProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.firstName("Sujoy");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.lastName("Roy");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.emailId("roysujoy@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.phoneNumber("91 9999999999");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.password("Sujoy@1234");
        Assertions.assertTrue(result);
    }


    @Test
    public void givenFirstName_WhileNotProper_ThrowsException() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.firstName("sujoy");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastname_WhenNotProper_ThrowsException() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.lastName("roy");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ThrowsException() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.emailId("sujoy@roy@gmail.com");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ThrowsException1() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.emailId("sujoy.@roy@gmail.co.in");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ThrowsException() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.phoneNumber("9923154919");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ThrowsException1() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.phoneNumber("99 231919");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenNotProper_ThrowsException1()  {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.password("sujoy@12234");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}