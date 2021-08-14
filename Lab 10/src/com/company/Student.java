package com.company;

//Creating child class Student
public class Student extends Person{
    //Declaring fields
    int batch;
    int reg_num;

    //Defining the constructor
    Student (String name, String cnic, String email, String contact_no, int batch, int reg_num){
        super(name, cnic, email, contact_no);
        this.batch = batch;
        this.reg_num = reg_num;
    }

    //Batch getter
    public int getBatch() {
        return batch;
    }

    //Batch setter
    public void setBatch(int batch) {
        this.batch = batch;
    }

    //Reg_num getter
    public int getReg_num() {
        return reg_num;
    }

    //Reg_num setter
    public void setReg_num(int reg_num) {
        this.reg_num = reg_num;
    }

    //Modifying the toString method
   public String toString(){
        return "Student Name = " + name + "\n" + "CNIC = " + cnic + "\n" +
                "Email = " + email + "\n" + "Ph. No. = " + contact_no + "\n" +
                "Batch = " + batch + "\n" + "Registration No. = " + reg_num;
    }

}
