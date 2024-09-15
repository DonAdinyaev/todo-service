package com.donito.todo.domain.todo.service;

import com.donito.todo.domain.todo.dao.TodoRepository;
import com.donito.todo.domain.todo.dao.document.TodoDocument;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoDocument addTodo(String title) {
        return todoRepository.save(TodoDocument.ofTitle(title));
    }

}
