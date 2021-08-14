package com.company;

//Creating parent class Person
public class Person {
    //Declaring fields
    String name;
    String cnic;
    String email;
    String contact_no;

    //Defining the constructor
    Person (String name, String cnic, String email, String contact_no){
        this.name = name;
        this.cnic = cnic;
        this.email = email;
        this.contact_no = contact_no;
    }

    public void setName(String name){this.name = name;}     //Name setter
    public void setCnic(String cnic){this.cnic = cnic;}     //Cnic setter
    public void setEmail(String email){this.email = email;}     //Email setter
    public void setContact_no(String contact_no){this.contact_no = contact_no;}     //Number setter
    public String getName(){return name;}       //Name getter
    public String getCnic(){return cnic;}       //Cnic getter
    public String getEmail(){return email;}     //Email getter
    public String getContact_no(){return contact_no;}   //Number getter

    //Modifying the toString method
    public String toString(){
        return "Person's Name = " + name + "\n" + "CNIC = " + cnic + "\n" +
                "Email Adress = " + email + "\n" + "Ph. No. = " + contact_no;
    }

}
