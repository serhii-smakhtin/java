package HibernateHW;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Set;

@SpringBootApplication
public class UserRoleApp implements CommandLineRunner {
    private final UserService userService;

    public UserRoleApp(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Hibernate HW");
        SpringApplication.run(UserRoleApp.class, args);
    }

    @Override
    public void run(String... args) {
        Role adminRole = new Role(null, "Admin");
        userService.createUser("John Doe", "john@example.com", Set.of(1L));

        User user = userService.getUserById(1L).orElseThrow();
        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
    }
}
