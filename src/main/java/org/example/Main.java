package org.example;

public class Main {
    public static void main(String[] args) {

       Person mom = new PersonBuilder()
               .setName("Dina")
               .setSurname("Vladi")
               .setAge(38)
               .setCity("TSK")
               .build();

        System.out.println(mom);

        Person son = mom.newChildBuilder()
                .setName("Jim")
                .setAge(12)
                .build();

        System.out.println(son);

    }
}