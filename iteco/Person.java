package ru.iteco;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Person {

        String name;
        public String getName(){ return name; }

        public Person(String name){

            this.name=name;
        }

        public abstract void display();
        }



