package com.dnsouzadev.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnsouzadev.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
