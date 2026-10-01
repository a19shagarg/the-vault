package com.thevault.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    void shouldCreatePersonWithCorrectDetails() {

        Person person = new Person(1, "Khushal");

        assertEquals(1, person.getId());
        assertEquals("Khushal", person.getName());
    }
}