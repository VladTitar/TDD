import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int contactsCount = phoneBook.add("Vlad", "1234567890");
        assertEquals(1, contactsCount);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vlad", "1234567890");
        phoneBook.add("Dima", "9876543210");

        String name = phoneBook.findByNumber("1234567890");
        assertEquals("Vlad", name);
    }
}
