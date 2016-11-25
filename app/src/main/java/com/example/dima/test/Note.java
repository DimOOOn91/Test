package com.example.dima.test;

public class Note {
    private String name;
    private String nikName;
    private String phone;
    private String email;
    private String ICQ;

    public Note(String name, String nikName, String phone, String email, String ICQ) {
        this.name = name;
        this.nikName = nikName;
        this.phone = phone;
        this.email = email;
        this.ICQ = ICQ;
    }

    public String getName() {
        return name;
    }

    public String getNikName() {
        return nikName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getICQ() {
        return ICQ;
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", nikName='" + nikName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", ICQ='" + ICQ + '\'' +
                '}';
    }
}
