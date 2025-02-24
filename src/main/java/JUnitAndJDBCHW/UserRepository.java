package JUnitAndJDBCHW;

public interface UserRepository {
    void save(User user);
    User findById(Long id);
}
