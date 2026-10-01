package com.thevault.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeamTest {

    @Test
    void shouldCreateTeamCorrectly() {
        Team team = new Team(101, "Code Breakers");

        assertEquals(101, team.getId()); // check team id
        assertEquals("Code Breakers", team.getName());// checks teams name
        assertTrue(team.getMembers().isEmpty());// checks if list is empty initially
    }
    @Test
void shouldAddAndRemoveMembers() {
    Team team = new Team(101, "Code Breakers");

    Person p1 = new Person(1, "Aman");
    Person p2 = new Person(2, "Rahul");

    team.addMember(p1);
    team.addMember(p2);

    assertEquals(2, team.getMembers().size());
    assertTrue(team.getMembers().contains(p1));
    assertTrue(team.getMembers().contains(p2));

    team.removeMember(p1);

    assertEquals(1, team.getMembers().size());
    assertFalse(team.getMembers().contains(p1));
    assertTrue(team.getMembers().contains(p2));
}
}