package phonebook;

public class Entry {

    private final String name;
    private final String number;

    public Entry(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}