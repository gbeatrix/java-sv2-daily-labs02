package day05;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Kojot", 2017);
        Viewer viewer1 = new Viewer();
        Viewer viewer2 = new Viewer();

        viewer1.watchMovie(movie, 5);
        viewer1.watchMovie(movie, 5);
        viewer1.watchMovie(movie, 5);
        double avg = viewer2.watchMovie(movie, 4);

        System.out.println(movie.getTitle() + ", " + movie.getYear() + ", átlagos értékelés: "+ avg);
    }
}
