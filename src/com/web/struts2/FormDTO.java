package com.web.struts2;

import java.util.List;

public class FormDTO {
	
	private String gender;
	private List genderList;

	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List getGenderList() {
		return genderList;
	}

	public void setGenderList(List genderList) {
		this.genderList = genderList;
	}
}
