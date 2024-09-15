package com.donito.todo.domain.todo.dao;

import com.donito.todo.domain.todo.dao.document.TodoDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<TodoDocument, String> {
}
