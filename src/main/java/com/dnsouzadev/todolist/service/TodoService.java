package com.dnsouzadev.todolist.service;

import com.dnsouzadev.todolist.entity.Todo;
import com.dnsouzadev.todolist.repository.TodoRepository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by(Direction.DESC, "prioridade")
            .and(Sort.by(Direction.ASC, "id"));
    
        return todoRepository.findAll(sort);
      }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
    
}
