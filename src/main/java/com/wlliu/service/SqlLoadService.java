package com.wlliu.service;

import com.wlliu.dao.SqlLoadDao;
import com.wlliu.entity.SqlLoad;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SqlLoadService {

    @Autowired
    SqlLoadDao sqlLoadDao;

    public void initStatus(){
        sqlLoadDao.initStatus();
    }

    public List<SqlLoad> getAllSqlLoad() {
        return sqlLoadDao.getAllSqlLoad();
    }

    public List<SqlLoad> getSqlLoadByName(@Param("tableName") String tableName) {
        return sqlLoadDao.getSqlLoadByName(tableName);
    }

    public void deleteTactis(@Param("tableName") String tableName, @Param("piDate") String piDate) {
        sqlLoadDao.deleteTactis(tableName, piDate);
    }

    public void deleteTactisByPiNumber(@Param("tableName") String tableName,
                                       @Param("piDate") String piDate,
                                       @Param("piNumber") String piNumber) {
        sqlLoadDao.deleteTactisByPiNumber(tableName, piDate, piNumber);
    }

    public void updateRunBefore(@Param("tableName") String tableName) {
        sqlLoadDao.updateRunBefore(tableName);
    }

    public void updateRunAfter(@Param("tableName") String tableName, @Param("result") String result) {
        sqlLoadDao.updateRunAfter(tableName, result);
    }

}
