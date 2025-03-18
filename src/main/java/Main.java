import CollectionsHW.ReverseLinkedList;
import CollectionsHW.StringIsValid;
import CollectionsHW.MoveZeroes;
import StreamAPIHW.Primary;
import JUnitAndJDBCHW.Index;
import HibernateHW.UserRoleApp;

public class Main {
    public static void main(String[] args) {
        // Collections HW
        ReverseLinkedList.init();
        StringIsValid.init();
        MoveZeroes.init();

        // Stream API HW
        Primary.init();

        // JUnit and JDBC HW
        Index.init();

        // Hibernate HW
        UserRoleApp.main(args);
    }
}
