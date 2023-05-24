package com.company;

public class Main {

    public static void main(String[] args) {
        sayHello("Sanja");
        sayGoodbye("Bojana");


    }
    public static void sayHello(String name){
        System.out.println("Hello " +name);
    }
    public static void sayGoodbye(String name){
        //TODO:Add support for multiple users
        System.out.println("Good bye " +name);
        //komentar edna linija
        /*
        komentar
        poveke
        linii

         */

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age = 7;

}
