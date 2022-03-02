package ru.iteco;

public class Client extends Person implements SeasonHandler{
    String company;

    public Client(String name, String company) {

        super(name);
        this.company = company;
    }

    @Override
    public void display() {

        System.out.printf("Name: %s \n", getName());
        System.out.printf("Representative of %s \n", company);
    }


    @Override
    public void getSeason() {
        System.out.printf("Сейчас %s.%s", Season.SUMMER.name(), Season.SUMMER.getCode());
    }
}
