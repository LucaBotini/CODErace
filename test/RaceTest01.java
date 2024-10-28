package academy.devdojo.maratonajava.javacore.AATestesSolos.test;
import academy.devdojo.maratonajava.javacore.AATestesSolos.domain.Car;
import academy.devdojo.maratonajava.javacore.AATestesSolos.domain.Race;

public class RaceTest01 {
    public static void main(String[] args) {
        Race race = new Race("Laguna Seca",3602.0);
        Car car = new Car("Honda","Civic SI", 2007, 224.8);
        Car car2 = new Car("AUDI","RS6 Avant", 2020, 283.7);
        Car car3 = new Car("Land Rover Range","Land Rover", 2013, 219.4);
        Car cars[] = {car, car2, car3};
        race.setCars(cars);
        race.print();
        System.out.println("📃 speed information: ");
        car.speedCalculation(cars, race.getKm());

    }
}
