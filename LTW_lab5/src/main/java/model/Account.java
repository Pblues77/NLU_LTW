package model;

import java.util.Date;

public class Account {
    private String email;
    private String sdt;
    private String password;
    private String name;
    private Date dob;
    private String nationality;

    public Account(String email, String sdt, String password, String name, Date dob, String nationality) {
        this.email = email;
        this.sdt = sdt;
        this.password = password;
        this.name = name;
        this.dob = dob;
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
