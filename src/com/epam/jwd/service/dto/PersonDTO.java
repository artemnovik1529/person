package com.epam.jwd.service.dto;

import java.time.LocalDate;
import java.util.Objects;
// уровень серверов, не хотим показывать пользователю пароль; Нужно сдеалть Builder тоже
public class PersonDTO extends AbstractDTO<Long>{
    private Long id;
    private String name;
    private String surname;
    private int age;
    private int height;
    private boolean showDateOfBirth;
    private LocalDate dateOfBirth;
    private boolean married;
    private String gender;

    public PersonDTO(Long id,String name, String surname, int age, int height, LocalDate dateOfBirth,boolean showDateOfBirth, boolean married, String gender) {
        super(id);
        this.showDateOfBirth = showDateOfBirth;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
        this.married = married;
        this.gender = gender;
    }

    public PersonDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isShowDateOfBirth() {
        return showDateOfBirth;
    }

    public void setShowDateOfBirth(boolean showDateOfBirth) {
        this.showDateOfBirth = showDateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
        PersonDTO personDTO = (PersonDTO) o;
        return age == personDTO.age && height == personDTO.height && married == personDTO.married && Objects.equals(id, personDTO.id) && Objects.equals(name, personDTO.name) && Objects.equals(surname, personDTO.surname) && Objects.equals(dateOfBirth, personDTO.dateOfBirth) && Objects.equals(gender, personDTO.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, height, dateOfBirth, married, gender);
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", dateOfBirth=" + dateOfBirth +
                ", married=" + married +
                ", gender='" + gender + '\'' +
                '}';
    }
}
