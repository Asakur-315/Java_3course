public class Camry extends Car{
    private Boolean is3i5;
    private String name;
    private Integer year, mileage;

    public Camry(Boolean is3i5, Integer year, Integer mileage){
        super(200, 10000, "Автомат", "Чёрный");
        this.is3i5 = is3i5;
        if (is3i5) {
            super.setMaxSpd(300);
            super.setPrice(12000);
        }
        
        this.year = year;
        this.name = String.format("Камри %s %s года " , (is3i5 ? "Три и пять" : "Два и пять"),this.year); 
        this.mileage = mileage;          
    }

    public void repaint(String color){
        super.setColor(color);
    }

    public Integer getMileage(){
        return this.mileage;
    }

    public String getName(){
        return name;
    }
}