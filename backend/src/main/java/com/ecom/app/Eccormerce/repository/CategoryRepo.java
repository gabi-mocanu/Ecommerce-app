package com.ecom.app.Eccormerce.repository;

import com.ecom.app.Eccormerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
