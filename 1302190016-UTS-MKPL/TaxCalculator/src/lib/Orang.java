package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

import Employee;

public class Orang{
    private String firstName;
	private String lastName;
    private String address;
    private boolean isForeigner;
	private boolean gender; //true = Laki-laki, false = Perempuan

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsForeigner() {
        return this.isForeigner;
    }

    public boolean getIsForeigner() {
        return this.isForeigner;
    }

    public void setIsForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }

    public boolean isGender() {
        return this.gender;
    }

    public boolean getGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
	
    
}

/*
Referensi
https://www.youtube.com/watch?v=_dJKsGLZ658&t=118s (Video Pak Jati mengenai Long Parameter List)

Dibantu oleh:

>Aditya Fauzian R. P. - 1302190085
>Luqman Hadi - 1302190016
>Raja Simontua - 1302194094
>Yudistira Rashaad - 1302190028
*/