package com.filefixer;

public class student_info implements student {
    private String name;
    private String ID;
    private String email;
    
    public student_info(String name, String ID, String email){
        this.name = name;
        this.ID = ID;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
