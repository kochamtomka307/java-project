package pl.edu.pwsz.student.demo;

/**
 * Created by Student on 2017-05-30.
 */
public class Student {

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private int yearOfBirth;

    private String name;

    private String lastname;
}
