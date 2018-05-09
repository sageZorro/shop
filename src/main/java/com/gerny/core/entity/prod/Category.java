package com.gerny.core.entity.prod;

import org.apache.ibatis.type.Alias;

@Alias(value="Category")
public class Category {
    private Integer id;

    private Byte level;

    private Integer parentId;

    private String zh;

    private String ru;

    private String pt;

    private String en;

    private Integer sort;

    private Integer catid;

    private Byte catidUse;

    private String query;

    private Byte queryUse;

    private Float weight;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public Byte getCatidUse() {
        return catidUse;
    }

    public void setCatidUse(Byte catidUse) {
        this.catidUse = catidUse;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Byte getQueryUse() {
        return queryUse;
    }

    public void setQueryUse(Byte queryUse) {
        this.queryUse = queryUse;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}