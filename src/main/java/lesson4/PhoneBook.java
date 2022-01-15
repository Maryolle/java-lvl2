package lesson4;

import java.util.ArrayList;
import java.util.HashMap;

    public class PhoneBook {
        private final HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        public void add(String lastName, String phoneNumber) {
            ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
            phonesForLastName.add(phoneNumber);
            phoneBook.put(lastName, phonesForLastName);
        }

        public ArrayList<String> get(String lastName) {
            return phoneBook.get(lastName);
        }

        public static void main(String[] args) {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Pupkin", "234234243");
            phoneBook.add("Pupkin1", "12345");
            phoneBook.add("Pupkin2", "25347254");
            phoneBook.add("Pupkin", "8888888");

            System.out.println(phoneBook.get("Pupkin5"));
        }
    }
