package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.User;

import org.springframework.security.core.userdetails.UserDetailsService;

import javax.transaction.Transactional;

public interface UserService extends UserDetailsService {
    public User validateUser(User user);

    public String registerUser(User user);

    public Iterable<User> findAllUser();
    public int enableAppUser(String email);
}
