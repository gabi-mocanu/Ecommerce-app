package com.ecom.app.Eccormerce.service.interf;

import com.ecom.app.Eccormerce.dto.CategoryDto;
import com.ecom.app.Eccormerce.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
