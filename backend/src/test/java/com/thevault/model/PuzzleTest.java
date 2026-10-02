package com.thevault.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PuzzleTest {

    static class TestPuzzle extends Puzzle {

        public TestPuzzle(int id, String question, String answer, Difficulty difficulty) {
            super(id, question, answer, difficulty);
        }
    }

    @Test
    void shouldCreatePuzzleWithCorrectDetails() {

        Puzzle puzzle = new TestPuzzle(
                1,
                "Decode this message",
                "HELLO",
                Difficulty.MEDIUM
        );

        assertEquals(1, puzzle.getId());
        assertEquals("Decode this message", puzzle.getQuestion());
        assertEquals("HELLO", puzzle.getAnswer());
        assertEquals(Difficulty.MEDIUM, puzzle.getDifficulty());
        assertTrue(puzzle.isLocked());
    }
}