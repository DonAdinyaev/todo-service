package com.donito.todo.domain.todo.dao.document;

import lombok.Builder;
import lombok.With;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@With()
@Document("todo")
public record TodoDocument (
    String id,
    String title,
    boolean completed,
    boolean removed
    ) {

    public static TodoDocument ofTitle(String title) {
        return new TodoDocument(UUID.randomUUID().toString(), title, false, false);
    }

    @Override
    public String toString() {
        return "TodoDocument: { _id: %s, title: %s, completed: %s, removed: %s}"
                .formatted(id, title, completed, removed);
    }
}
