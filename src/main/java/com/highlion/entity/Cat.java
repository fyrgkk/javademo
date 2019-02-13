package com.highlion.entity;

public class Cat {
private int id;
private int name;
public Cat() {
	// TODO Auto-generated constructor stub
}

public Cat(int id, int name) {
	super();
	this.id = id;
	this.name = name;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getName() {
	return name;
}
public void setName(int name) {
	this.name = name;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
	System.out.println("----------");
		return super.toString();
	}

}
