package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.Category;

import com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.Exceptions.EtAuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public Category save(Category category) throws EtAuthException{
        int count= categoryRepository.titleCount(category.getTitle());
        if (count > 0)
            throw new EtAuthException("The title already exists");
        else return categoryRepository.save(category);
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public int titleCount(String title) {
        int result=categoryRepository.titleCount(title);
        return result;
    }

    @Override
    public Category findById(int id) {
        Optional<Category> result= categoryRepository.findById(id);
        if(result.isPresent()){
            return  result.get();
        } else {
            throw new EtAuthException("Category Not Found");
        }
    }
}
