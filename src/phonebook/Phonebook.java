package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    public static void main(String[] args) {
        List<Entry> phonebook = new ArrayList<>();

        Entry contact1 = new Entry("Janna Bobko", "050_244_12_25");
        Entry contact2 = new Entry("Helen Bochon", "097_212_95_80");
        Entry contact3 = new Entry("Ruslan Drobit", "093_306_59_10");
        Entry contact4 = new Entry("Alex Merejinsky", "050_377_54_09");
        Entry contact5 = new Entry("Ihor Harchenko", "096_400_88_33");
        Entry contact6 = new Entry("Iryna Volkova", "095_241_37_90");
        Entry contact7 = new Entry("Helen Bochon", "050_244_95_17");

        phonebook.add(contact1);
        phonebook.add(contact2);
        phonebook.add(contact3);
        phonebook.add(contact4);
        phonebook.add(contact5);
        phonebook.add(contact6);
        phonebook.add(contact7);

        find(phonebook, "Helen Bochon");
        findAll(phonebook, "Helen Bochon");
    }

    public static void find(List<Entry> phonebook, String name) {
        String result = null;
        for (Entry contact : phonebook) {
            if (contact.getName().equals(name)) {
                result = contact.getName() + ": " + contact.getNumber();
                break;
            }
        }
        System.out.println(result);
    }

    public static void findAll(List<Entry> phonebook, String name) {
        List<String> result = new ArrayList<>();
        for (Entry contact : phonebook) {
            if (contact.getName().equals(name)) {
                result.add(contact.getName() + ": " + contact.getNumber());
            }
        }
        if (result.isEmpty()) {
            result = null;
        }
        System.out.println(result);
    }
}
