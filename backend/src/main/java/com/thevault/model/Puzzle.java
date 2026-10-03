package com.thevault.model;
import com.thevault.interfaces.Solvable;
public abstract class Puzzle implements Solvable{
private int id;
private String question;
private String answer;
private Difficulty difficulty;
private boolean locked;

public Puzzle(int id,String question,String answer,Difficulty difficulty){
    this.id=id;
    this.question = question;
    this.answer = answer;
    this.difficulty = difficulty;
    this.locked = true;
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
public boolean isLocked(){
    return locked;
}

}