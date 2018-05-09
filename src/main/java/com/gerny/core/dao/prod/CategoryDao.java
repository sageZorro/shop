package com.gerny.core.dao.prod;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gerny.core.entity.prod.Category;

@Mapper
public interface CategoryDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
    
    List<Category> queryList(Category record);
}