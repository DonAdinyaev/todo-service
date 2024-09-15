package com.donito.todo.domain.todo.controller;

import com.donito.todo.domain.todo.dao.document.TodoDocument;
import com.donito.todo.domain.todo.dto.request.AddTodoRequestDto;
import com.donito.todo.domain.todo.service.TodoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("todo")
public class TodoController {
    private final TodoService todoService;

    @PostMapping
    public TodoDocument addTodo(@RequestBody @Valid AddTodoRequestDto dto) {
        return todoService.addTodo(dto.title());
    }
}
