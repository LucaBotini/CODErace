package academy.devdojo.maratonajava.javacore.AATestesSolos.domain;

public class Car {
    private String car;
    private String model;
    private int year;
    private double speedMax;

    static{
        System.out.println("🚨 Welcome to best CODE race 🚨");
    }

    public Car(String model, String car, int year, double speedMax){
        this.car = car;
        this.model = model;
        this.year = year;
        this.speedMax = speedMax;
    }

    public void print() {
        System.out.print(this.model);
        System.out.print(", "+this.car);
        System.out.print(", "+this.year+"\n");
    }

    String winner;
    double shortestTimeInSeconds = Double.MAX_VALUE;

    public void speedCalculation(Car[] cars, double distance) {

        for (Car c : cars) {
            System.out.println("🚗 "+c.car + " Maximum speed" + ": " + c.getSpeedMax());

            double timeH = distance / c.getSpeedMax();
            double timeInSeconds = timeH * 60;

            int minutes = (int) (timeInSeconds / 60); // minutos
            double seconds = timeInSeconds % 60;

            System.out.printf("- The time required to travel %.2f km at %.2f km/h is %d minutes and %.2f seconds.%n",
                    distance, c.getSpeedMax(), minutes, seconds);
            System.out.println();

            if (timeInSeconds < shortestTimeInSeconds) {
                shortestTimeInSeconds = timeInSeconds;
                winner = c.car;
            }
        }
        int winningMinutes = (int) (shortestTimeInSeconds / 60);
        double winningSeconds = shortestTimeInSeconds % 60;
        System.out.printf("🥇 Winner is: %s, com: %d minutes and %.2f seconds of travel! 🥇.%n", winner, winningMinutes, winningSeconds);
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeedMax() {
        return speedMax;
    }

}
