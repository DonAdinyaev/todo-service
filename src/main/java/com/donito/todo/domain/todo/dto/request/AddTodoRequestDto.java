package com.donito.todo.domain.todo.dto.request;

import jakarta.validation.constraints.NotBlank;

public record AddTodoRequestDto (
        @NotBlank String title
){
}
