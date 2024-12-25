package pkg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String schedule;
    private int staffID;

    public Book() {}

    public Book(String name, String schedule, int staffID) {
        this.name = name;
        this.schedule = schedule;
        this.staffID = staffID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getTrainerId() {
        return staffID;
    }

    public void setTrainerId(int staffID) {
        this.staffID = staffID;
    }
}

