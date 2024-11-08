/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */

// Constructor to initialize all fields
public class Record {
    private String firstName;
    private String lastName;
    private String date;
    private int division;
    private int points;
    private String summary;

    public Record(String firstName, String lastName, String date, int division, int points, String summary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.division = division;
        this.points = points;
        this.summary = summary;
    }

    // Getter methods
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDate() { return date; }
    public int getDivision() { return division; }
    public int getPoints() { return points; }
    public String getSummary() { return summary; }
}

