package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Home {
	private String ownername;
	private int id;
	
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void connect()
	{
		System.out.println("Internet connected Sucessfully");
	}
	
	public Home() {
		System.out.println("Object Created");
	}
}
