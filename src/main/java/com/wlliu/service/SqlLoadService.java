package com.wlliu.service;

import com.wlliu.dao.SqlLoadDao;
import com.wlliu.entity.SqlLoad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SqlLoadService {

    @Autowired
    SqlLoadDao sqlLoadDao;




    public List<SqlLoad> getAllSqlLoad() {
        return sqlLoadDao.getAllSqlLoad();
    }

}
