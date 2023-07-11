package com.bedmil.todolist.repository;

import com.bedmil.todolist.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}