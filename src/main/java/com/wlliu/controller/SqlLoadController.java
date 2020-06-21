package com.wlliu.controller;

import com.wlliu.entity.SqlLoad;
import com.wlliu.service.SqlLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SqlLoadController {
    @Autowired
    private SqlLoadService sqlLoadService;

    @GetMapping("getAllSqlLoad")
    public List<SqlLoad> getAllSqlLoad() {
        return sqlLoadService.getAllSqlLoad();
    }

}
