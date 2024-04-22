package com.mcmin.server.model;

import com.mcmin.server.dto.PageDTO;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "T_DOTO")
public class Todo extends PageDTO {
    @Column(name = "ID")
    private String id;

    @Column(name = "TODO_TITLE")
    private String todoTitle;

    @Column(name = "TODO_CONTENT")
    private String todoContent;

    @Column(name = "TODO_STATUS")
    private String todoStatus;

    @Column(name = "CREATE_TIME")
    private String createTime;

    @Column(name = "UPDATE_TIME")
    private String updateTime;

    @Column(name = "TENANT_ID")
    private String tenantId;

    @Column(name = "DEL_FLAG")
    private int delFlag;
}
