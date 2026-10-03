package com.thevault.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CipherPuzzleTest {

    @Test
    void shouldCreateCipherPuzzleCorrectly() {

        CipherPuzzle puzzle = new CipherPuzzle(
                1,
                "Decode KHOOR",
                "HELLO",
                Difficulty.MEDIUM
        );

        assertEquals(1, puzzle.getId());
        assertEquals("Decode KHOOR", puzzle.getQuestion());
        assertEquals("HELLO", puzzle.getAnswer());
        assertEquals(Difficulty.MEDIUM, puzzle.getDifficulty());
        assertTrue(puzzle.isLocked());
    }
}