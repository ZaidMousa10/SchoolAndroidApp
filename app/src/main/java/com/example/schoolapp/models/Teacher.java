package com.example.schoolapp.models;

import androidx.annotation.NonNull;

import java.time.LocalDate;

public class Teacher extends User {
    private String speciality;
    private int schedule_id;

    public Teacher() {

    }

    public Teacher(Integer user_id, String firstName, String lastName, LocalDate birthDate, String address, String phone, Role role, String speciality) {
        super(user_id, firstName, lastName, birthDate, address, phone, role);

        this.speciality = speciality;
    }

    public Teacher(Integer user_id, String firstName, String lastName, LocalDate birthDate, String address, String phone, Role role, String speciality, int schedule_id) {
        super(user_id, firstName, lastName, birthDate, address, phone, role);

        this.speciality = speciality;
        this.schedule_id = schedule_id;
    }

    public Teacher(Integer user_id, String firstName, String lastName, LocalDate birthDate, String address, String phone, Role role, String speciality, int schedule_id, String password) {
        super(user_id, firstName, lastName, birthDate, address, phone, role, password);

        this.speciality = speciality;
        this.schedule_id = schedule_id;

    }




    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    @NonNull
    @Override
    public String toString() {
        return "Teacher{" +
                ", user_id=" + super.getUser_id() +
                ", speciality='" + speciality + '\'' +
                ", scheduleId=" + schedule_id +
                '}';
    }
}