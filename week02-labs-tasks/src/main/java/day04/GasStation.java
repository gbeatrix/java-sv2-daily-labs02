package day04;

public class GasStation {
    private double price;

    public GasStation(double price) {
        this.price = price;
    }

    public double refuel(Car car, double amount){
        car.setFuel(amount);
        return price*amount;
    }

    public static void main(String[] args) {
        GasStation gasStation = new GasStation(500);
        Car car = new Car();
        double price = gasStation.refuel(car, 10);
        System.out.println(price + "Ft az üzemanyag ára.");
        car.setDistance(80);
        System.out.println(car.getAvgConsumption() + "l a kocsi fogyasztása.");
    }
}
