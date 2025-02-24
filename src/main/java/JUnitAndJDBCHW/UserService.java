package JUnitAndJDBCHW;

public interface UserService {
    UserResponseDto registerUser(UserRegistrationDto userRegistrationDto);
    UserResponseDto getUserById(Long userId);
}
