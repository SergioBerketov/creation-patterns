package org.example;

public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder() {
    }

    public PersonBuilder(String surname, String city) {
        this.surname = surname;
        this.city = city;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Вы ввели некорректный возраст");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (surname != null) {
            return new Person(name, surname, age, city);

        } else {
            throw new IllegalStateException("Вы ввели не достаточно информации! " +
                    "Обязательно должна быть указана фамилия");
        }
    }
}
