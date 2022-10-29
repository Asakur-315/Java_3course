public class Golf extends Car{
    private Boolean isVR6;
    private String name;
    private Integer year, mileage;

    public Golf(Boolean isVR6, Integer year, Integer mileage){
        super(180, 7000, "Автомат", "Чёрный");
        this.isVR6 = isVR6;
        if (isVR6) {
            super.setMaxSpd(290);
            super.setPrice(10000);
        }
        
        this.year = year;
        this.name = String.format("Гольф %s %s года " , (isVR6 ? "2.5l" : "1.6l"),this.year); 
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