package com.deca.jelp.domain.client;

public class Name {

    private String firstName;
    private String secondName;
    private String firstSurname;
    private String secondSurname;

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(String firstName, String firstSurname){
        this.firstName = firstName;
        this.firstSurname = firstSurname;
    }

    public Name(String firstName, String secondName, String firstSurname, String secondSurname) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public String getFirstSurname(){
        return firstSurname;
    }

    public String getSecondSurname(){
        return secondSurname;
    }



}

