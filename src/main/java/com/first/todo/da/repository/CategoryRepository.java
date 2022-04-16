package com.first.todo.da.repository;

import com.first.todo.da.mapping.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>
{
}
