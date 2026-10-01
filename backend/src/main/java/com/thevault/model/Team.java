// team => group of participants
package com.thevault.model;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private int id;
    private String name;
    private List<Person> members; //contain multiple Person objects

    public Team(int id,String name){
        this.id=id;
        this.name=name;
        this.members= new ArrayList<>();
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public List<Person> getMembers(){
        return members;
    }
    // these methods expects Person objects
    public void addMember(Person person){ 
        members.add(person);
    }
    public void removeMember(Person person){
        members.remove(person);
    }

    
}