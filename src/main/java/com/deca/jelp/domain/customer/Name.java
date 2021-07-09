package com.deca.jelp.domain.customer;

public class Name {

    private String firstName;
    private String secondName;
    private String firstSurname;
    private String secondSurname;

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(String secondName, String firstSurname, String secondSurname){
        this.secondName = secondName;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
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

    /*public String isEqualTo (String firstName) throws CustomException {

       if(this.firstName == firstName){
           return this.firstName;
       } else{
           throw new CustomException("The names is not the same ");
       }
    }*/



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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
}

