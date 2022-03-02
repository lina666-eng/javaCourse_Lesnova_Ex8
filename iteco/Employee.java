package ru.iteco;

public class Employee extends Person implements Printable{
    String company;

    public Employee(String name, String company) {

        super(name);
        this.company = company;
    }


    @Override
    public void display() {

        System.out.printf("Name: %s \n", getName());
        System.out.printf("Works in %s \n", company);
    }

    @Override
    public void print() {
        System.out.printf("Name: %s \n", getName());
        System.out.printf("Works in %s \n", company);
    }
}
