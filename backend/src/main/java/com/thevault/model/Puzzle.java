package com.thevault.model;

public abstract class Puzzle {
private int id;
private String question;
private String answer;
private Difficulty difficulty;
public Puzzle(int id,String question,String answer,Difficulty difficulty){
    this.id=id;
    this.question = question;
    this.answer = answer;
    this.difficulty = difficulty;
}
public int getId(){
    return id;
}
public String getQuestion(){
    return question;
}
public String getAnswer(){
    return answer;
}
public Difficulty getDifficulty(){
    return difficulty;
}
}