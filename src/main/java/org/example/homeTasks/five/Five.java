package org.example.homeTasks.five;

public class Five {
    public static void main(String[] args) {

        String validPhone = "+380637777777";
        String invalidPhone = "380637777777";

        validatePhoneNumber(validPhone);
        validatePhoneNumber(invalidPhone);

    }

    private static void validatePhoneNumber(String validPhone) {
        if (isValidPhoneNumber(validPhone)) {
            System.out.println(validPhone + "- is a valid phone number");
        } else {
            System.out.println(validPhone + "- is not a valid phone number");
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\+[0-9]{12}$";
        return phoneNumber.matches(regex);
    }
}
