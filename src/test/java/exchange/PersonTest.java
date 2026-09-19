package exchange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testPersonToString() {
        Person person = new Person("Bob", "Johnson");
        assertEquals("Bob Johnson", person.toString());
    }

    @Test
    public void testPersonNotEquals() {
        Person person1 = new Person("Greg", "Jennings");
        Person person2 = new Person("Donald", "Driver");
        assertEquals(false, person1.equals(person2));
    }

    @Test
    public void testPersonNotEqualsSameFirstName() {
        Person person1 = new Person("Donald", "Jennings");
        Person person2 = new Person("Donald", "Driver");
        assertEquals(false, person1.equals(person2));
    }

    @Test
    public void testPersonNotEqualsSameLastName() {
        Person person1 = new Person("Greg", "Driver");
        Person person2 = new Person("Donald", "Driver");
        assertEquals(false, person1.equals(person2));
    }

    @Test
    public void testPersonEquals() {
        Person person1 = new Person("Bob", "Johnson");
        Person person2 = new Person("Bob", "Johnson");
        assertEquals(true, person1.equals(person2));
    }
}
