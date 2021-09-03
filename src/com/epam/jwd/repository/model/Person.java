package com.epam.jwd.repository.model;

import java.time.LocalDate;
import java.util.Objects;

// Класс Person наследник Entity  который принемает id типа Long;
public class Person extends Entity<Long> {
    private String name;
    private String surname;
    private int age;
    private int height;
    private LocalDate dateOfBirth;
    private boolean showDateOfBirth;
    private boolean married;
    private String gender;

    private Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isShowDateOfBirth() {
        return showDateOfBirth;
    }

    public void setShowDateOfBirth(boolean showDateOfBirth) {
        this.showDateOfBirth = showDateOfBirth;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && showDateOfBirth == person.showDateOfBirth && married == person.married && name.equals(person.name) && surname.equals(person.surname) && dateOfBirth.equals(person.dateOfBirth) && gender.equals(person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, height, dateOfBirth, showDateOfBirth, married, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", dateOfBirth=" + dateOfBirth +
                ", showDateOfBirth=" + showDateOfBirth +
                ", married=" + married +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class Builder {
        private Long id;
        private String name;
        private String surname;
        private int age;
        private int height;
        private LocalDate dateOfBirth;
        private boolean showDateOfBirth;
        private boolean married;
        private String gender;

        public Builder() {

        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder withDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder withShowDateOfBirth(boolean showDateOfBirth) {
            this.showDateOfBirth = showDateOfBirth;
            return this;
        }

        public Builder withMarried(boolean married) {
            this.married = married;
            return this;
        }

        public Builder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.id = this.id;
            person.name = this.name;
            person.surname = this.surname;
            person.age = this.age;
            person.height = this.height;
            person.dateOfBirth = this.dateOfBirth;
            person.showDateOfBirth = this.showDateOfBirth;
            person.married = this.married;
            person.gender = this.gender;

            return person;

        }
    }
}
