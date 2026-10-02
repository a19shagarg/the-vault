package com.thevault.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleTest {

    static class TestPuzzle extends Puzzle {

        public TestPuzzle(int id, String question, String answer) {
            super(id, question, answer);
        }
    }

    @Test
    void shouldCreatePuzzleWithCorrectDetails() {

        Puzzle puzzle = new TestPuzzle(
                1,
                "Decode this message",
                "HELLO"
        );

        assertEquals(1, puzzle.getId());
        assertEquals("Decode this message", puzzle.getQuestion());
        assertEquals("HELLO", puzzle.getAnswer());
    }
}