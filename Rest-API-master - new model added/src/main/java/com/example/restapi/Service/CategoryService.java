package com.example.restapi.Service;

import com.example.restapi.Model.Category;

import java.util.List;

public interface CategoryService {

    Category saveCategory(Category category);

    List<Category> getAllCategories();
}