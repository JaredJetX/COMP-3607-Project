package com.filefixer;

public class student implements studentINTERFACE{
    private String participant_ID;
    private String name;
    private String student_ID;
    
    public student(String participant_ID, String name, String student_ID){
        this.participant_ID = participant_ID;
        this.name = name;
        this.student_ID = student_ID;
    }

    @Override
    public String getparticipant_ID() {
        return participant_ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getstudent_ID() {
        return student_ID;
    }
}
