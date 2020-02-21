package javaClasses;

//id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.

import lombok.*;

import java.util.Objects;
import java.util.UUID;

@Data
class Student {
    private String id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private int yearOfBirth;
    private String address;
    private int phoneNumber;
    private Department department;
    private Course course;
    private Group group;

    Student() {
        this.id = UUID.randomUUID().toString();
    }

    protected Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    protected Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    protected Student setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    protected Student setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        return this;
    }

    protected Student setAddress(String address) {
        this.address = address;
        return this;
    }

    protected Student setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    protected Student setDepartment(Department department) {
        this.department = department;
        return this;
    }

    protected Student setCourse(Course course) {
        this.course = course;
        return this;
    }

    protected Student setGroup(Group group) {
        this.group = group;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getYearOfBirth() == student.getYearOfBirth() &&
                getDepartment() == student.getDepartment() &&
                getCourse() == student.getCourse() &&
                getGroup() == student.getGroup();
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, department, course, group);
    }

}