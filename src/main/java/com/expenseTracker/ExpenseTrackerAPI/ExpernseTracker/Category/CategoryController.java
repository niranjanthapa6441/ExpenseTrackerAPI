package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.Category;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("api/v1/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryService;
    @PostMapping("/add")
    public ResponseEntity<Map<String,String>> addCategory(@RequestBody Map<String,Object> userMap){
        String userid= userMap.get("userId").toString();
        String description= userMap.get("description").toString();
        String title=userMap.get("title").toString();
        Category category=new Category(userid,title,description);
        Category saveCategory=categoryService.save(category);
        int categoryId= saveCategory.getCategoryId();
        log.info("message","Category added Successfully");
        log.info("Status","200");
        String id=String.valueOf(categoryId);
        Map<String,String> map = new HashMap<>();
        map.put("category_Id",id);
        map.put("user_id",saveCategory.getUserId());
        map.put("title",saveCategory.getTitle());
        map.put("description",saveCategory.getDescription());
        return new ResponseEntity<>(map,HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Category> findAll(){
        return categoryService.findAll();
    }
    @GetMapping("/{id}")
    public Category findById(@PathVariable int id){
        return categoryService.findById(id);
    }

}
