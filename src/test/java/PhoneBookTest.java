import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int contactsCount = phoneBook.add("Vlad", "1234567890");
        assertEquals(1, contactsCount);
    }
}
