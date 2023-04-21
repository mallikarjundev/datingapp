package com.dating.controllers;

import com.dating.dao.UserAccountDAO;
import com.dating.dao.UserAccountDAOImpl;
import com.dating.model.Interest;
import com.dating.model.UserAccount;

public class UserAccountController {
    public static void main(String[] args) {
        UserAccountController controller = new UserAccountController();
        controller.findAllUsers();
        controller.findMatchingUsers();
    }

    public void registerUser() {
        UserAccountDAO dao = new UserAccountDAOImpl();
        UserAccount userAccount = new UserAccount();
        userAccount.setId(1);
        userAccount.setAge(25);
        userAccount.setCity("Hyd");
        userAccount.setCountry("IND");
        userAccount.setEmail("a@b.com");
        userAccount.setGender("M");
        userAccount.setPassword("pass");
        userAccount.setPhoneNumber("12345");
        Interest interest = new Interest();
        interest.setId(1);
        interest.setLikes("movies");
        interest.setHobbies("chess");
        userAccount.setInterest(interest);
        dao.save(userAccount);
        System.out.println(dao.findById(1));
    }

    public void findAllUsers() {
        UserAccountDAO dao = new UserAccountDAOImpl();
        createUsers(dao);

        dao.delete(1);
        System.out.println(dao.findAll());
    }

    public void findMatchingUsers() {
        UserAccountDAO dao = new UserAccountDAOImpl();
        createUsers(dao);


        System.out.println(dao.findMatches(25, "Hyd"));
    }

    private void createUsers(UserAccountDAO dao) {
        UserAccount userAccount = new UserAccount();
        userAccount.setId(1);
        userAccount.setUserName("arjun");
        userAccount.setAge(25);
        userAccount.setCity("Hyd");
        userAccount.setCountry("IND");
        userAccount.setEmail("a@b.com");
        userAccount.setGender("M");
        userAccount.setPassword("pass");
        userAccount.setPhoneNumber("12345");
        Interest interest = new Interest();
        interest.setId(1);
        interest.setLikes("movies");
        interest.setHobbies("chess");
        userAccount.setInterest(interest);
        dao.save(userAccount);

        UserAccount userAccount2 = new UserAccount();
        userAccount2.setId(2);
        userAccount2.setUserName("rad");
        userAccount2.setAge(25);
        userAccount2.setCity("Hyd");
        userAccount2.setCountry("IND");
        userAccount2.setEmail("a@b.com");
        userAccount2.setGender("M");
        userAccount2.setPassword("pass");
        userAccount2.setPhoneNumber("12345");
        dao.save(userAccount2);
    }
}
