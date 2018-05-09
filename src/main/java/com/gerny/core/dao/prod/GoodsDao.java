package com.gerny.core.dao.prod;

import com.gerny.core.entity.prod.Goods;

public interface GoodsDao {
    int deleteByPrimaryKey(Integer productid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer productid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}