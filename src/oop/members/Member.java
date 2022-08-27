package oop.members;

public class Member {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected int salary;

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setAddress(String address) {this.address = address;}
    public void setSalary(int salary) {this.salary = salary;}

    public void printSalary(){
        System.out.println("Salary: " + salary);
    }
}
