package com.czxy.dao;

import com.czxy.domain.student;

import java.util.List;

public interface StudentDao  {


    /**
     * 查询所有
     * @return
     */
    List<student> findAll();
}
