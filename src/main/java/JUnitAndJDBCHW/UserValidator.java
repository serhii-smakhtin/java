package JUnitAndJDBCHW;

public class UserValidator {
    public static void validate(UserRegistrationDto userRegistrationDto) {
        if (!userRegistrationDto.getPassword().equals(userRegistrationDto.getRepeatPassword())) {
            throw new IllegalArgumentException("Passwords do not match!");
        }

        if (!userRegistrationDto.getEmail().contains("@")) {
            throw new IllegalArgumentException("Invalid email format!");
        }

        if (userRegistrationDto.getPhoneNumber() != null && !userRegistrationDto.getPhoneNumber().matches("\\d+")) {
            throw new IllegalArgumentException("Invalid phone number format!");
        }
    }
}
