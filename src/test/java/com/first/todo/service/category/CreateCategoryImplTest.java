package com.first.todo.service.category;

import com.first.todo.openapi.CreateCategoryIn;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CreateCategoryImplTest
{
    @Autowired
    private CreateCategoryImpl createCategoryImpl;

    @Test
    public void createCategory_MissingName()
    {
        // Given
        CreateCategoryIn request = new CreateCategoryIn();


    }
}
