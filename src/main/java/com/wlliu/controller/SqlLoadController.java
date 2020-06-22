package com.wlliu.controller;

import com.wlliu.entity.SqlLoad;
import com.wlliu.service.SqlLoadService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SqlLoadController {
    @Autowired
    private SqlLoadService sqlLoadService;

    @GetMapping("initStatus")
    public void initStatus() {
        sqlLoadService.initStatus();
    }

    @GetMapping("getAllSqlLoad")
    public List<SqlLoad> getAllSqlLoad() {
        return sqlLoadService.getAllSqlLoad();
    }

    @GetMapping("deleteTactis")
    public void deleteTactis(String tableName, String piDate) {
        sqlLoadService.deleteTactis(tableName, piDate);
    }

    @GetMapping("updateRunBefore")
    public void updateRunBefore(String tableName) {
        sqlLoadService.updateRunBefore(tableName);
    }

    @GetMapping("updateRunAfter")
    public void updateRunAfter(String tableName, String result) {
        sqlLoadService.updateRunAfter(tableName, result);
    }

    /*forOne*/

    @GetMapping("getSqlLoadByName")
    public List<SqlLoad> getSqlLoadByName(String tableName) {
        return sqlLoadService.getSqlLoadByName(tableName);
    }

    @GetMapping("updateRunBeforeForOne")
    public void updateRunBeforeForOne(String tableName, String piDate, String piNumber) {
        sqlLoadService.updateRunBeforeForOne(tableName, piDate, piNumber);
    }

    @GetMapping("updateRunAfterForOne")
    public void updateRunAfterForOne(String tableName, String result) {
        sqlLoadService.updateRunAfterForOne(tableName, result);
    }

}
