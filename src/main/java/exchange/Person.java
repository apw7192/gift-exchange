package exchange;

public class Person {
    private String name;

    private String familyName;

    public Person(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    @Override
    public String toString() {
        return name + " " + familyName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.familyName.equals(p.familyName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
