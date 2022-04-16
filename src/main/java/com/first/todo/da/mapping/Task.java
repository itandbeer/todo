package com.first.todo.da.mapping;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long surrogate;

    private String name;

    private Integer priority;

    @ManyToOne
    private Category category;
}
