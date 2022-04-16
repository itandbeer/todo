package com.first.todo.da.repository;

import com.first.todo.da.mapping.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>
{
}
