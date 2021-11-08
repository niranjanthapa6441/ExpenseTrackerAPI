package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.User.Registration.RegistrationToken.email;

public interface EmailSender {
    void send(String to, String email);
}
