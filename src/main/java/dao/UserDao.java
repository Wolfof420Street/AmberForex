package dao;

import models.user;

import java.util.List;

public interface UserDao {
    // LIST
    List<user> getAll();

    // CREATE
    void add(user newUser);

    // READ
    user findById(int id);

    // UPDATE
    void update(int id, String content);

    // DELETE
     void deleteById(int id);
    void clearAllTasks();
}
