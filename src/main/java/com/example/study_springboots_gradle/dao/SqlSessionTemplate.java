package com.example.study_springboots_gradle.dao;

public interface SqlSessionTemplate {

    Object selectList(String sqlMapId, Object dataMap);

    Object delete(String sqlMapId, Object dataMap);

    Object insert(String sqlMapId, Object dataMap);

    Object update(String sqlMapId, Object dataMap);

    Object selectOne(String sqlMapId, Object dataMap);

}
