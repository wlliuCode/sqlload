package com.wlliu.dao;

import com.wlliu.entity.SqlLoad;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SqlLoadDao {

    void initStatus();

    List<SqlLoad> getAllSqlLoad();

    List<SqlLoad> getSqlLoadByName(String tableName);

    void deleteTactis(String tableName,String piDate);

    void deleteTactisByPiNumber(String tableName,String piDate,String piNumber);

    void updateRunBefore(String tableName);

    void updateRunAfter(String tableName,String result);
}
