package com.first.todo.service.category;

import com.first.todo.da.mapping.Category;
import com.first.todo.da.repository.CategoryRepository;
import com.first.todo.openapi.CreateCategoryIn;
import com.first.todo.openapi.CreateCategoryOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCategoryImpl
{
    @Autowired
    private CategoryRepository categoryRepository;

    public CreateCategoryOut invoke(CreateCategoryIn request) throws Exception
    {
        validateRequest(request);

        Category category = saveCategory(request);

        return createResponse(category);
    }

    private void validateRequest(CreateCategoryIn request) throws Exception
    {
        if (request.getName() == null)
        {
            throw new Exception("name is requered");
        }
    }

    private Category saveCategory(CreateCategoryIn request)
    {
        Category category = new Category();

        category.setName(request.getName());
        category.setDescription(request.getDescription());

        return categoryRepository.save(category);
    }

    private CreateCategoryOut createResponse(Category category)
    {
        CreateCategoryOut response = new CreateCategoryOut();

        response.setName(category.getName());
        response.setDescription(category.getDescription());

        return response;
    }
}
