package com.org;

public abstract class College {
	public void aero(String eng,int count) {
		System.out.println(eng+"-"+count);
	}
	public void medical(String med,int count) {
		System.out.println(med+"-"+count);
	}
	public void Arts(String art,int count) {
		System.out.println(art+"-"+count);
	}
	public abstract void agri(String agri,float per);
	
	public abstract void maths(String art,float per,int count);
}