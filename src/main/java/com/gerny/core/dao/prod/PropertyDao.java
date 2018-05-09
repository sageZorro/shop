package com.gerny.core.dao.prod;

import com.gerny.core.entity.prod.Property;

public interface PropertyDao {
    int deleteByPrimaryKey(Integer propertyid);

    int insert(Property record);

    int insertSelective(Property record);

    Property selectByPrimaryKey(Integer propertyid);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);
}