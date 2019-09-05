package com.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
@Id
int studid;
String name;
String address;


public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getStudid() {
	return studid;
}
public void setStudid(int studid) {
	this.studid = studid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "\n Student [studid=" + studid + ", name=" + name + ", address=" + address + "]";
}
}
