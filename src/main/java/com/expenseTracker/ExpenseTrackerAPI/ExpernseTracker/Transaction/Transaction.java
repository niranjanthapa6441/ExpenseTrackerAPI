package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.Transaction;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="ET_TRANSACTIONS")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private int trasnsactionId;
    @Column(name = "user_id",nullable = false)
    private int userId;
    @Column(name = "category_id",nullable = false)
    private int categoriesId;
    @Column(nullable = false)
    private String note;
    @Column(name = "transaction_date",nullable = false)
    private LocalDate transactionDate;

    public Transaction() {
    }

    public int getTrasnsactionId() {
        return trasnsactionId;
    }

    public void setTrasnsactionId(int trasnsactionId) {
        this.trasnsactionId = trasnsactionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(int categoriesId) {
        this.categoriesId = categoriesId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
}
