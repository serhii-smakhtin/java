package JUnitAndJDBCHW;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private long idCounter = 1;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto registerUser(UserRegistrationDto userRegistrationDto) {
        if (!userRegistrationDto.getPassword().equals(userRegistrationDto.getRepeatPassword())) {
            throw new IllegalArgumentException("Passwords do not match!");
        }

        // Validate email and phone number (for simplicity, skipping complex validation)
        if (!userRegistrationDto.getEmail().contains("@")) {
            throw new IllegalArgumentException("Invalid email format!");
        }

        // Create a new user and save it
        User user = new User(idCounter++, userRegistrationDto.getEmail(), userRegistrationDto.getPhoneNumber(), userRegistrationDto.getPassword());
        userRepository.save(user);

        // Return UserResponseDto
        return new UserResponseDto(user.getId(), user.getEmail(), user.getPhoneNumber());
    }

    @Override
    public UserResponseDto getUserById(Long userId) {
        User user = userRepository.findById(userId);
        if (user == null) {
            throw new IllegalArgumentException("User not found!");
        }
        return new UserResponseDto(user.getId(), user.getEmail(), user.getPhoneNumber());
    }
}
