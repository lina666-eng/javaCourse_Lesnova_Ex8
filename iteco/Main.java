package ru.iteco;

public class Main {
    public static void main(String[] args){
        Employee e = new Employee("Имя", "АйТеко");
        Client c = new Client("Имя", "АйТеко");
        e.print();
        c.getSeason();
    }

}
