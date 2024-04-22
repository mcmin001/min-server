package com.mcmin.server.web.controller;

import com.mcmin.server.common.ApiResult;
import com.mcmin.server.dto.TodoDTO;
import com.mcmin.server.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping("/page")
    public ApiResult<Page> getPage(@RequestBody TodoDTO dto){
        try{
            return ApiResult.success(todoService.getPage(dto));
        }catch (Exception e){
            log.error(e.getMessage(), e);
            return ApiResult.failed(e.getMessage());
        }
    }
}
