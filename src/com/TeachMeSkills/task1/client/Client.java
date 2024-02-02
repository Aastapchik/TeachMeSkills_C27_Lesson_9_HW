package com.TeachMeSkills.task1.client;

import java.util.Date;
/*
The class contains a template for creating a client
 */
public class Client {

    private String name;
    private String surname;
    private String numPass;
   // private Date date;
    private int postInd;
    private String country;
    private String city;
    private String streetName;
    private String buildNum;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumPass() {
        return numPass;
    }

    //public Date getDate() {
   //     return date;
    //}

    public int getPostInd() {
        return postInd;
    }

    public String getCountry() {
        return "Страна - " + country;
    }

    public String getCity() {
        return "Город - " + city;
    }

    public String getStreetName() {
        return "Ул. " + streetName;
    }

    public String getBuildNum() {
        return "д. " + buildNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumPass(String numPass) {
        this.numPass = numPass;
    }

    //public void setDate(Date date) {
  //      this.date = date;
   // }

    public void setPostInd(int postInd) {
        this.postInd = postInd;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setBuildNum(String buildNum) {
        this.buildNum = buildNum;
    }

    public Client(String name,
                  String surname,
                  String numPass,
                  //Date date,
                  int postInd,
                  String country,
                  String city,
                  String streetName,
                  String buildNum) {
        this.name = name;
        this.surname = surname;
        this.numPass = numPass;
        //this.date = date;
        this.postInd = postInd;
        this.country = country;
        this.city = city;
        this.streetName = streetName;
        this.buildNum = buildNum;
    }
}
