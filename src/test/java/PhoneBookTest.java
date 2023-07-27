import org.junit.Test;
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
}
