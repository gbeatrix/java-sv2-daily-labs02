package day05;

public class Movie {
    private String title;
    private int year;
    private double avgRating;
    private int sumOfRatings;
    private int numOfRatings;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
        avgRating = 0;
        sumOfRatings = 0;
        numOfRatings = 0;
    }

    double rate(int rate){
        sumOfRatings += rate;
        ++numOfRatings;
        avgRating = ((double)sumOfRatings)/numOfRatings;
        return avgRating;
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
