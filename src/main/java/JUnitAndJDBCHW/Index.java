package JUnitAndJDBCHW;

public class Index {
    public static void init() {
        System.out.println("");
        System.out.println("JUnit and JDBC HW");

        // Init repo and service
        UserRepository userRepository = new UserRepositoryImpl();
        UserService userService = new UserServiceImpl(userRepository);

        // Register user
        UserRegistrationDto userRegistrationDto = new UserRegistrationDto(
                "user@example.com",
                "1234567890",
                "password123",
                "password123"
        );

        try {
            // Data validation
            UserValidator.validate(userRegistrationDto);

            // Register user
            UserResponseDto userResponse = userService.registerUser(userRegistrationDto);
            System.out.println("User registered: " + userResponse);

            // Get user by id
            UserResponseDto fetchedUser = userService.getUserById(userResponse.id());
            System.out.println("Fetched User: " + fetchedUser);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
