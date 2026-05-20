package com.example.restapi.Controller;

import com.example.restapi.Model.Category;
import com.example.restapi.Service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/")
    public Category saveCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @GetMapping("/")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
}