package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("Hobbies:" + person.getHobbies() );


        System.out.println("----------------------------------");
        Person person1 = new Person("hasan", "şimşek", 27,35000,Boolean.FALSE, new String[] {"swimming", "running"});
        System.out.println("Firstname: " + person1.getFirstName());

        System.out.println("LastName: " + person1.getLastName());

        System.out.println("Age: " + person1.getAge());

        System.out.println("Hobbies:" + person1.getHobbies() );

        System.out.println("---------------------------------");

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}
