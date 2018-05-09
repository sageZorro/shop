package com.gerny.core.dao.prod;

import com.gerny.core.entity.prod.SpecOption;

public interface SpecOptionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SpecOption record);

    int insertSelective(SpecOption record);

    SpecOption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpecOption record);

    int updateByPrimaryKey(SpecOption record);
}