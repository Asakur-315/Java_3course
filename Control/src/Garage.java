
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Garage {
    private Integer maxCars, curCars;
    private Camry[] camryQ;
    private Golf[] golfQ;

    private Car[] cars;
    public Garage(Integer maxCars){
        this.maxCars = maxCars;
        curCars = 0;
        cars = new Car[maxCars];
        camryQ = new Camry[maxCars];
        golfQ = new Golf[maxCars];
        for (Car car : cars) {
            car = null;
        }
    }

    public Boolean addCar(Camry car){
        for (Camry camry : this.camryQ) {
            if (curCars < maxCars){
                camry = car;
                curCars += 1;
                return true;
            }
            else continue;
        }
        return false;
    }

        public Boolean addCar(Golf car){
        for (Golf golf : this.golfQ) {
            if (curCars < maxCars){
                golf = car;
                curCars += 1;
                return true;
            }
            else continue;
        }
        return false;
    }

    public Boolean addCar(Car car){
        for (Car place : cars) {
            if (place == null & curCars < maxCars){
                place = car;
                curCars += 1;
                return true;
            }
            else continue;
        }
        return false;
    }

    public void getAutos(){
        for (Camry camry : camryQ) {
            if (camry != null) System.out.println(camry.getName());
        }
        for (Golf golf : golfQ) {
            if (golf != null) System.out.println(golf.getName());
        }
    }

    public void sortByPrice(){
        Integer[] prices = new Integer[maxCars]; 
        for (int i = 0; i < cars.length; i++){
            prices[i] = cars[i].getPrice();
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(prices) );
        Integer[] sortedPrices = linkedHashSet.toArray(new Integer[] {});
        Arrays.sort(sortedPrices);
        for (Integer price : prices) {
            System.out.println(price);
        }
    }
}
