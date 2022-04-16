package com.first.todo.controller;

import com.first.todo.openapi.CreateCategoryIn;
import com.first.todo.openapi.CreateCategoryOut;
import com.first.todo.service.category.CreateCategoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController
{
    @Autowired
    private CreateCategoryImpl createCategoryImpl;

    @PostMapping
    public CreateCategoryOut createCategory(@RequestBody CreateCategoryIn request) throws Exception
    {
        CreateCategoryOut response = createCategoryImpl.invoke(request);

        return response;
    }

}
