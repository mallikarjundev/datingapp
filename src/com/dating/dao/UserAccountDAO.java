package com.dating.dao;

import com.dating.model.UserAccount;

import java.util.List;

public interface UserAccountDAO {

    void save(UserAccount userAccount);

    UserAccount findById(int id);

    List<UserAccount> findAll();
    List<UserAccount> findMatches(int age, String city);

    void delete(int id);
}
