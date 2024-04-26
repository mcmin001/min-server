package com.mcmin.server.dao;

import com.mcmin.server.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoDao extends JpaRepository<Todo, String>, JpaSpecificationExecutor<Todo> {
}
