package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.Category;

import javax.persistence.*;
@Entity
@Table(name = "ET_CATEGORIES")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "user_id")
    private String userId;
    @Column(name="title",nullable = false,unique = true)
    private String title;
    @Column(name = "description",nullable = false)
    private String description;

    public Category() {

    }

    public Category(int categoryId, String userId, String title, String description) {
        this.categoryId = categoryId;
        this.userId = userId;
        this.title = title;
        this.description = description;
    }

    public Category(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Category(String userId, String title, String description) {
        this.userId = userId;
        this.title = title;
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
