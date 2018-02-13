package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private TreeMap<String, ArrayList> phonebook;

    public PhoneBook() {
        this.phonebook = new TreeMap<String, ArrayList>();
    }

    private Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public void add(String name, String number) {
        ArrayList a;
        if (!hasEntry(name)) {
            a = new ArrayList<String>();
            a.add(number);
            phonebook.put(name, a);
        } else {
            a = phonebook.get(name);
            a.add(number);
            phonebook.put(name, a);
        }
    }

    public String lookup(String name) {
        if (phonebook.get(name) == null) return null;
        return (String) phonebook.get(name).get(0);
    }

    public String reverseLookup(String number) {
        for (Map.Entry<String, ArrayList> entry : phonebook.entrySet()) {
            if (entry.getValue().contains(number))
                return entry.getKey();
        }
        return null;
    }

    public void remove(String name, String number) {
        phonebook.remove(name);
    }

    public String listNamesAndNumbers() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ArrayList> entry : phonebook.entrySet()) {
            sb.append(entry.getKey());
            for (Iterator it = entry.getValue().iterator(); it.hasNext(); ) {
                String e = (String) it.next();
                sb.append(" ");
                sb.append(e);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String listNames() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ArrayList> entry : phonebook.entrySet()) {
            sb.append(entry.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }

    // phase III
    public void add(String name, String... numbers ) {
        for ( String number : numbers)  {
            this.add(name, number);
        }
    }

    public void removeRecord(String name) {
        this.remove(name, "");
    }
}
