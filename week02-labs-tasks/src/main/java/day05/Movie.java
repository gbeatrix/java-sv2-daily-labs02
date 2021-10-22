package day05;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int year;
    private double avgRating;
    private List<Integer> ratings = new ArrayList<>();

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    private double calcAvgRating(){
        double sum = 0;
        for(int rate : ratings){
            sum += rate;
        }
        avgRating = sum/ratings.size();
        return avgRating;
    }

    double rate(int rate){
        ratings.add(rate);
        return calcAvgRating();
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getAvgRating() {
        return avgRating;
    }
}
