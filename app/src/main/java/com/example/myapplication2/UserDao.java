package com.example.myapplication2;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM  user")
    List<User> getAll();
    @Query ("SELECT * FROM user WHERE name LIKE :name1")
    User findname(String name1);
    @Query("DELETE FROM user WHERE name LIKE :name2")
    void deletename(String name2);

    @Insert
    void insert(User user);

    @Delete
    void delete(User user);


}
