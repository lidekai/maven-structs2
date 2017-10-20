package com.person.controller;
import com.opensymphony.xwork2.ActionSupport;
public class UserController extends ActionSupport{
    private static final long serialVersionUID = 1L; 
    public String showUser() {
        System.out.println("111111111");
        return SUCCESS;  
    }
}