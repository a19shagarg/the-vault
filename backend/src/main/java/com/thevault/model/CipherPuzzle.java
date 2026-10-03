package com.thevault.model;

public class CipherPuzzle extends Puzzle {
    public CipherPuzzle(int id, String question, String answer, Difficulty difficulty) {
        super(id, question, answer, difficulty);
    }
    @Override
    public boolean checkAnswer(String answer){
        return getAnswer().equalsIgnoreCase(answer);
    }
    @Override
    public String getHint(){
        return "Try decoding the message using the appropriate cipher";
    }
}