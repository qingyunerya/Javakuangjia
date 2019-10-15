package com.qingyunerya.spring;

import org.springframework.stereotype.Component;

@Component("e")
//@Resource(name="e")
public class TestTwo {
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
	    private int id;
	    private String name="Test two 1";
}