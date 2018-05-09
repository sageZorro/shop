package com.gerny.core.dao.prod;

import com.gerny.core.entity.prod.PropertyOption;

public interface PropertyOptionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PropertyOption record);

    int insertSelective(PropertyOption record);

    PropertyOption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PropertyOption record);

    int updateByPrimaryKey(PropertyOption record);
}