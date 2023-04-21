package com.dating.dao;

import com.dating.model.UserAccount;

import java.util.*;

public class UserAccountDAOImpl implements UserAccountDAO {

    Map<Integer, UserAccount> userAccounts = new HashMap<>();

    @Override
    public void save(UserAccount userAccount) {
        userAccounts.put(userAccount.getId(), userAccount);
    }

    @Override
    public UserAccount findById(int id) {
        return userAccounts.get(id);
    }

    @Override
    public List<UserAccount> findAll() {
        return new ArrayList<>(userAccounts.values());
    }

    @Override
    public List<UserAccount> findMatches(int age, String city) {
        Collection<UserAccount> accounts = userAccounts.values();
        ArrayList<UserAccount> matches = new ArrayList<>();
        for (UserAccount userAccount : accounts) {
            if (userAccount.getAge() == age && userAccount.getCity().equals(city)){
                matches.add(userAccount);
            }
        }
        return matches;
    }

    @Override
    public void delete(int id) {
        userAccounts.remove(id);
    }
}
