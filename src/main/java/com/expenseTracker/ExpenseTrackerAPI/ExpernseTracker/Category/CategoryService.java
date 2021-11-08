package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.Category;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public Category save(Category category);
    public Iterable<Category> findAll();
    public int titleCount(String title);
    public Category findById(int id);
}
