package academy.devdojo.maratonajava.javacore.AATestesSolos.domain;

public class Race {
    private String raceTrack;
    private double km;
    private Car[] cars;

    public Race(String raceTrack, double km) {
        this.raceTrack = raceTrack;
        this.km = km;
    }

    public void print(){
        System.out.print("🏁 RaceTrack of today: ");
        System.out.print(this.raceTrack);
        System.out.println(", KM: "+this.km+".");
        if(cars == null || cars.length == 0){System.out.println("Don't found race cars"); return;}
        System.out.println("🚘 Race cars (N/M/Y): ");
        int c = 1;
        for (Car car : cars) {
            System.out.print("- Car "+c+": ");
            System.out.print(car.getCar()+", ");
            System.out.print(car.getModel()+", ");
            System.out.println(car.getYear());
            c++;
        }
        System.out.println();
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public String getRaceTrack() {
        return raceTrack;
    }

    public double getKm() {
        return km;
    }


}
