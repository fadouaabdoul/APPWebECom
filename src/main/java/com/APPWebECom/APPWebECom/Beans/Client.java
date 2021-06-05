package com.APPWebECom.APPWebECom.Beans;

public class Client {
    public int idClient;
    public String name;
    public boolean gender;
    public String mail;
    public int numTele;
    public String address;

    public Client (){ }

    public Client(int idClient, String name, boolean gender, String mail, int numTele, String address) {
        this.idClient = idClient;
        this.name = name;
        this.gender = gender;
        this.mail = mail;
        this.numTele = numTele;
        this.address = address;
    }


    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getNumTele() {
        return numTele;
    }

    public void setNumTele(int numTele) {
        this.numTele = numTele;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", mail='" + mail + '\'' +
                ", numTele=" + numTele +
                ", address='" + address + '\'' +
                '}';
    }
}
