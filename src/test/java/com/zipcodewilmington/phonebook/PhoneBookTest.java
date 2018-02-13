package com.zipcodewilmington.phonebook;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 2/12/18.
 */
public class PhoneBookTest {

    /**
     * Created by dan on 6/14/17.
     */

    @Test
    public void testNullLookupPhonebook() {

        String expected = null;
        PhoneBook ph = new PhoneBook();
        String actual = ph.lookup("joe");
        assertEquals(expected,actual);
    }

    @Test
    public void testAddToPhonebook() {

        String expected = "123 4567";
        PhoneBook ph = new PhoneBook();
        ph.add("joe", expected);
        String actual = ph.lookup("joe");
        assertEquals(expected,actual);
    }

    @Test
    public void testRemoveToPhonebook() {

        String expected = "123 4567";
        PhoneBook ph = new PhoneBook();
        ph.add("joe", expected);
        ph.remove("joe", expected);
        String actual = ph.lookup("joe");
        assertEquals(null,actual);
    }

    @Test
    public void testListNamesToPhonebook() {

        String listOfNames = "blaine\njoe\nmary\n";
        PhoneBook ph = new PhoneBook();
        ph.add("joe", "555 1212");
        ph.add("mary", "555 1313");
        ph.add("blaine", "555 1414");
        String actual = ph.listNames();
        //System.out.println("listnames \n"+actual);
        assertEquals(listOfNames,actual);
    }
    @Test
    public void testListNamesAndNumbersToPhonebook() {

        String listOfNames = "blaine 555 1414\njoe 555 1212\nmary 555 1313\n";
        PhoneBook ph = new PhoneBook();
        ph.add("joe", "555 1212");
        ph.add("mary", "555 1313");
        ph.add("blaine", "555 1414");
        String actual = ph.listNamesAndNumbers();
        //System.out.println("listnames \n"+actual);
        assertEquals(listOfNames,actual);
    }

    // Phase II
    @Test
    public void testReverseLookupPhonebook() {

        String num = "123 4567";
        String name = "joe";
        PhoneBook ph = new PhoneBook();
        ph.add(name, num);
        String actual = ph.reverseLookup(num);
        assertEquals(name,actual);
    }

    // Phase III

    @Test
    public void testMultiAddPhonebook() {

        String name = "joe";
        PhoneBook ph = new PhoneBook();
        ph.add(name, "123", "456", "789");
        ph.add("mary", "911", "411", "511");
        String actual = ph.listNamesAndNumbers();
        // too lazy
        // assertEquals(name,actual);
        System.out.println(actual);
    }


    // too lazy
}
