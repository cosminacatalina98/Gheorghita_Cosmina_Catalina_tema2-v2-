package com.example.myapplication2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name="Name")
    public String name;
    @ColumnInfo(name="Mark")
    public int mark;

    public User(String name, int mark)
    {
        this.name=name;
        this.mark=mark;
    }

    public  String getName(){
        return name;
    }

    public int getMark(){
        return mark;
    }
    public int getId(){
        return id;
    }
}
