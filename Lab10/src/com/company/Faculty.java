package com.company;

//Creating the child class Faculty
public class Faculty extends Person {
    String office_num;
    JobDescription job;
    HiringDate date;

    //Defining the constructor
    Faculty(String name, String cnic, String email, String contact_no, String office_num, JobDescription job, HiringDate date){
        super(name, cnic, email, contact_no);
        this.office_num = office_num;
        this.job = job;
        this.date = date;
    }

    //office_num getter
    public String getOffice_num() {
        return office_num;
    }
    //Office_num setter
    public void setOffice_num(String office_num) {
        this.office_num = office_num;
    }
    //Job getter
    public JobDescription getJob() {
        return job;
    }
    //Job setter
    public void setJob(JobDescription job) {
        this.job = job;
    }
    //date getter
    public HiringDate getDate() {
        return date;
    }
    //date setter
    public void setDate(HiringDate date) {
        this.date = date;
    }

    //Modifying the toString method
    public String toString(){
        return "Member Name = " + name + "\n" + "CNIC = " + cnic + "\n" +
                "Email = " + email + "\n" + "Ph. No. = " + contact_no + "\n" +
                "Office No. = " + office_num + "\n" + job + "\n" + date;
    }


}
