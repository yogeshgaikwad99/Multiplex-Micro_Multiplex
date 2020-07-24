package com.app.lti.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MultiplexDocument {

	@Id
	private String multiplexId;
	private String name;
	private String location;
	private List<String> screens;
	private int numberOfScreens;
	public String getMultiplexId() {
		return multiplexId;
	}
	public void setMultiplexId(String multiplexId) {
		this.multiplexId = multiplexId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getScreens() {
		return screens;
	}
	public void setScreens(List<String> screens) {
		this.screens = screens;
	}
	public int getNumberOfScreens() {
		return numberOfScreens;
	}
	public void setNumberOfScreens(int numberOfScreens) {
		this.numberOfScreens = numberOfScreens;
	}
	
}
