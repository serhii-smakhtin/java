package HibernateHW;

import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public User createUser(String name, String email, Set<Long> roleIds) {
        Set<Role> roles = roleRepository.findAllById(roleIds).stream().collect(Collectors.toSet());
        User user = new User(null, name, email, roles);
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUser(Long id, String name, String email) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(name);
        user.setEmail(email);
        return userRepository.save(user);
    }
}
