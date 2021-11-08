package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.Category;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
    @Query("SELECT COUNT(*) FROM Category c where title =?1")
    public int titleCount(String title);
}
