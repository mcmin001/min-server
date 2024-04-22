package com.mcmin.server.dto;

import lombok.Data;

import javax.persistence.Transient;

@Data
public class PageDTO {
    @Transient
    private int currentPageNo = 1;

    @Transient
    private int pageSize = 10;

    public PageDTO(){
        this.currentPageNo = 1;
        this.pageSize = 10;
    }

    public PageDTO(int currentPageNo, int pageSize){
        this.currentPageNo = (currentPageNo >10000 || currentPageNo <0) ? 1 : currentPageNo;
        this.pageSize = (pageSize > 1000 || pageSize < 1) ? 10 : pageSize;
    }
}
