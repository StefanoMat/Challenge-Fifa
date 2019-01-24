package challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Jogador {
    private String nationality;
    private String club;
    private String fullName;
    private int age;
    private Double buyOut;
    private Double salary;
    private LocalDate birthDate;

    public Jogador(String fullName, String club, int age, LocalDate birthDate, String nationality, Double salary,
                   Double buyOut) {
        setFullName(fullName);
        setClub(club);
        setAge(age);
        setBirthDate(birthDate);
        setNationality(nationality);
        setSalary(salary);
        setBuyOut(buyOut);
    }

    public String getNationality(){
        return this.nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }


    public String getClub(){
        return this.club;
    }

    public void setClub(String club){
        this.club = club;
    }


    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public Double getBuyOut(){
        return this.buyOut;
    }

    public void setBuyOut(Double buyOut){
        this.buyOut = buyOut;
    }

    public Double getSalary(){
        return this.salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }


    public LocalDate getBirthDate(){
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = this.birthDate;
    }

    public void carregarJogador(String fileUrl) throws IOException {
        BufferedReader buffer;
        String line = "";
        System.out.println(fileUrl);
        String[] country = new String[2];

        buffer = new BufferedReader(new FileReader(fileUrl));
        while ((line = buffer.readLine()) != null) {

            country = line.split(";");
            System.out.println();

        }

    }




}
