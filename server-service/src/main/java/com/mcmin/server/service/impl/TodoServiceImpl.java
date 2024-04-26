package com.mcmin.server.service.impl;

import com.mcmin.server.dao.TodoDao;
import com.mcmin.server.dto.TodoDTO;
import com.mcmin.server.model.Todo;
import com.mcmin.server.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Slf4j
@Service("todoService")
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoDao todoDao;

    @Override
    public Page<Todo> getPage(TodoDTO todoDTO) {
        Specification<Todo> spec = Specification.where(null);

        if(StringUtils.isNotBlank(todoDTO.getTodoTitle())){
            spec.and((root, query, criteriaBuilder)-> criteriaBuilder.like(root.get("todoTitle"), "%" + todoDTO.getTodoTitle() + "%"));
        }

        if(StringUtils.isNotBlank(todoDTO.getTodoContent())){
            spec.and((root, query, criteriaBuilder)-> criteriaBuilder.like(root.get("todoContent"), "%" + todoDTO.getTodoContent() + "%"));
        }

        return todoDao.findAll(spec, PageRequest.of(todoDTO.getCurrentPageNo(), todoDTO.getPageSize()));
    }
}
