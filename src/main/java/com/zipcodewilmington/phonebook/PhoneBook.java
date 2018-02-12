package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String, String> phonebook;

    public PhoneBook() {
        this.phonebook = new HashMap<String, String>();
    }

    public void add(String name, String number) {
        phonebook.put(name,number);
    }

    public String lookup(String name) {
        return phonebook.get(name);
    }

    public void remove(String name, String number) {
        phonebook.remove(name);
    }

    public String listNamesAndNumbers() {
        Map<String, String> sortedPhoneBook = new TreeMap<String, String>(phonebook);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : sortedPhoneBook.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" ");
            sb.append(entry.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String listNames() {
        Map<String, String> sortedPhoneBook = new TreeMap<String, String>(phonebook);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : sortedPhoneBook.entrySet()) {
            sb.append(entry.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }

}
