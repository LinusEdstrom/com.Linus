package com.Linus.entity;

import com.Linus.database.MemberRegistry;
import java.util.ArrayList;
import java.util.List;

public class Member {

    private int id;
    private String name;
    private int statusLevel;

    //konstruktorer

    public Member(){}

    public Member(int id, String name, int statusLevel) {
        this.id = id;
        this.name = name;
        this.statusLevel = statusLevel;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getStatusLevel(){return statusLevel;}
    public void setStatusLevel(int statusLevel) {this.statusLevel = statusLevel;}
    public void history(){}



    }


