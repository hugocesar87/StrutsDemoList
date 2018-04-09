package com.web.struts2;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private FormDTO formdto;
	
    @Override
    public String execute() {
    	
    	formdto = new FormDTO();
    	fillGenderList(formdto);
    	
		return SUCCESS;
    }

//    public String sayHello(){
//        return "success";
//    }
    
    private void fillGenderList(FormDTO formdto) {
    	
    	List<Gender> genderList = new ArrayList<Gender>();
    	Gender gender = new Gender();
    	gender.setLabel("male");
    	gender.setValue("1");
    	genderList.add(gender);
    	gender = new Gender();
    	gender.setLabel("female");
    	gender.setValue("2");
    	genderList.add(gender);
    	
    	formdto.setGenderList(genderList);
    }
    
    
    @Override
    public void validate() {
        if (name != null && name.equalsIgnoreCase("hugo")){
            addActionMessage("Welcome to my site" + name);
        }else{
            addActionError("You are not recognized");
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public FormDTO getFormdto() {
		return formdto;
	}

	public void setFormdto(FormDTO formdto) {
		this.formdto = formdto;
	}
    
}
