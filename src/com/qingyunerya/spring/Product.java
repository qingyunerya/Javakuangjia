package com.qingyunerya.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	 
    private int id;
    private String name;
    @Autowired
  //@Resource(name="c")
    private Category category;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}