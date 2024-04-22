package com.mcmin.server.service;

import com.mcmin.server.dto.TodoDTO;
import com.mcmin.server.model.Todo;
import org.springframework.data.domain.Page;

public interface TodoService {
    Page<Todo> getPage(TodoDTO todoDTO);
}
