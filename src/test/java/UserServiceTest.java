import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    public void setUp() {
        userRepository = mock(UserRepository.class);
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    public void testRegisterUser() {
        UserRegistrationDto registrationDto = new UserRegistrationDto("user@example.com", null, "password123", "password123");
        UserResponseDto response = userService.registerUser(registrationDto);

        assertNotNull(response);
        assertEquals("user@example.com", response.email());
        verify(userRepository).save(any(User.class));
    }

    @Test
    public void testGetUserById() {
        User user = new User(1L, "user@example.com", null, "password123");
        when(userRepository.findById(1L)).thenReturn(user);

        UserResponseDto response = userService.getUserById(1L);
        assertEquals("user@example.com", response.email());
    }
}
