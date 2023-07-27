import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int contactsCount = phoneBook.add("Vladislav", "1234567890");
        assertEquals(1, contactsCount);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vladislav", "1234567890");
        phoneBook.add("Polina", "9876543210");

        String name = phoneBook.findByNumber("1234567890");
        assertEquals("Vladislav", name);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vladislav", "1234567890");
        phoneBook.add("Polina", "9876543210");

        String number = phoneBook.findByName("Vladislav");
        assertEquals("1234567890", number);
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vladislav", "1234567890");
        phoneBook.add("Polina", "9876543210");

        List<String> names = phoneBook.printAllNames();
        List<String> expectedNames = List.of("Polina", "Vladislav");
        assertEquals(expectedNames, names);
    }
}
