package com.mcmin.server.dao;

import com.mcmin.server.model.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoDao extends JpaRepository<Todo, String> {
    Page<Todo> getPage(Specification<Todo> specification, PageRequest pageRequest);
}
