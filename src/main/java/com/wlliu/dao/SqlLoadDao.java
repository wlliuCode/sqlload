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
}
