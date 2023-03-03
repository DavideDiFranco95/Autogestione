package Esercizio03_03_2023;


import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Duration;
public class User {
    private String name;
    private String surname;
    private String email;
    private String address;
    public User(String name, String surname, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }
    public void getUserGrade(EnumUser user){
        switch (user){
            case GUEST:
                System.out.println("guest");
                break;
            case REGISTERED:
                System.out.println("registered");
                break;
            case HOST:
                System.out.println("host");
                break;
            case SUPER_HOST:
                System.out.println("super host");
                break;
            case ADMIN:
                System.out.println("Admin");
                break;
            default:
                System.out.println("User not found :(");
                break;
        }
    }

    Scanner scanner = new Scanner(System.in);
    public LocalDateTime stayTime(){
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //Period.between(LocalDateTime.now(),scanner.next("dd-MM-yyyy"));

        return null;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
