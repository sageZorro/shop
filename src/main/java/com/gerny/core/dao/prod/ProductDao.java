package com.gerny.core.dao.prod;

import com.gerny.core.entity.prod.Product;

public interface ProductDao {
    int deleteByPrimaryKey(Integer productid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}