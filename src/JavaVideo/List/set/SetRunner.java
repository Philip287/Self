package JavaVideo.List.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
       /* String[] cars = {"Mini", "Mercedes-benz", "Audi", "VW", "Smart", "Toyota", "Porsche"};
        String[] otherCars = {"Audi", "Ford", "GMC", "Toyota", "Chevrolet"};
*/
       /* HashSet<>() позволяет сохранять в коллекцию уникальные имена (не повторяющиеся),
       не сохраняет последовательность записи

       Set<String> carSet = new HashSet<>(Arrays.asList(cars));

        Set<String> otherCarSet = new HashSet<>(Arrays.asList(otherCars));

        Set<String> uniqueCar = new HashSet<>(carSet);
        */

        /* LinkedHashSet<>() Позволяет сохранять уникальные имена и сохраняет последовательность записи
        Set<String> carSet = new LinkedHashSet<>(Arrays.asList(cars));

        Set<String> otherCarSet = new LinkedHashSet<>(Arrays.asList(otherCars));

        Set<String> uniqueCar = new LinkedHashSet<>(carSet);
        */
        // TreeSet позволяет сохранить уникальные имена и отсортировать их
      /*  Set<String> carSet = new TreeSet<>(Arrays.asList(cars));

        Set<String> otherCarSet = new TreeSet<>(Arrays.asList(otherCars));

        Set<String> uniqueCar = new TreeSet<>(carSet);

        uniqueCar.addAll(otherCarSet);

        print(uniqueCar);*/

        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("VW", "Golf",45));
        sixCars.add(new Car("Audi", "A3",60));
        sixCars.add(new Car("VW", "Polo",35));
        sixCars.add(new Car("BMW", "Z4",120));
        sixCars.add(new Car("BMW", "440i",200));

        Set<Car> europaCars = new HashSet<>();
        sixCars.add(new Car("Toyota", "Auris",40));
        sixCars.add(new Car("Reno", "Clio",30));
        sixCars.add(new Car("Reno", "Megan",50));
        sixCars.add(new Car("VW", "Golf",45));
        sixCars.add(new Car("VW", "Polo",35));

        NavigableSet<Car> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(europaCars);
        //print(uniqueCars);
      //  SortedSet cars = uniqueCars.headSet(new Car("Toyota", "Auris",40));
        SortedSet cars = uniqueCars.subSet(new Car("Toyota", "Auris",40), true,
                new Car("Audi", "A3", 60), true);


        print(uniqueCars);
        System.out.println("Hire: ");
        System.out.println(uniqueCars.higher(new Car("Toyota", "Auris",40)));

        System.out.println("Lower: ");
        System.out.println(uniqueCars.lower(new Car("Toyota", "Auris",40)));

        System.out.println("ceiling: ");
        System.out.println(uniqueCars.ceiling(new Car("Toyota", "Auris",43)));

        System.out.println("floor: ");
        System.out.println(uniqueCars.floor(new Car("Toyota", "Auris",43)));

    }

    private static void print(Set<Car> cars){
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per day");
        for (Car car : cars) {
             System.out.printf("%-20s %-20s %-20s \n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
    }
}
