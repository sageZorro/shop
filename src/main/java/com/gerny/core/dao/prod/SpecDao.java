package com.gerny.core.dao.prod;

import com.gerny.core.entity.prod.Spec;

public interface SpecDao {
    int deleteByPrimaryKey(Integer specid);

    int insert(Spec record);

    int insertSelective(Spec record);

    Spec selectByPrimaryKey(Integer specid);

    int updateByPrimaryKeySelective(Spec record);

    int updateByPrimaryKey(Spec record);
}