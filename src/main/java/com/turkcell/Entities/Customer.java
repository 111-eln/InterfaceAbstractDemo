package com.turkcell.Entities;

import com.turkcell.Abstract.IEntity;

import java.util.Date;

public class Customer implements IEntity {
    public int id;
    public  String FirstName;
    public String LastName;
    public Date DateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getDatOfBirth() {
        return DateOfBirth;
    }

    public void setDatOfBirth(Date datOfBirth) {
        DateOfBirth = datOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }

    public String NationalityId;
}
