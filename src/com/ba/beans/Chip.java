package com.ba.beans;

public class Chip {
private int id;
private int type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
@Override
public String toString() {
	return "Chip [id=" + id + ", type=" + type + "]";
}
}
