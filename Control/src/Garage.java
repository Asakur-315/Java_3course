import java.lang.ProcessBuilder.Redirect.Type;

public class Garage {
    private Integer maxCars, curCars;
    private Integer camryQ = 0;
    private Integer golfQ = 0;
    private Car[] cars;
    public Garage(Integer maxCars){
        this.maxCars = maxCars;
        curCars = 0;
        cars = new Car[maxCars];

        for (Car car : cars) {
            car = null;
        }
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

        for (Car car : cars) {
            if (car instanceof Car){
                camryQ++;
            }
            else if (car instanceof Golf){
                golfQ++;
            }
        }
        if (golfQ > camryQ)
        System.out.println(String.format("Гольфы в гараже: %d", golfQ));
        System.out.println(String.format("Камри в гараже: %d", camryQ));
        if (golfQ < camryQ)
        System.out.println(String.format("Гольфы в гараже: %d", golfQ));
    }

    public void sortByPrice(){


    }
}
