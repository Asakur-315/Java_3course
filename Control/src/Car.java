abstract class Car {
    private Integer maxSpd, nowSpd, price;
    private String transmissionType, color;

    public Car(Integer maxSpd, Integer price, String transmission, String color){
        this.maxSpd = maxSpd;
        this.nowSpd = 0;
        this.price = price;
        this.transmissionType = transmission;
        this.color = color;
    }

    public void start(){
        this.nowSpd = 1;
    } 
    public void stop(){
        this.nowSpd = 0;
    }
    public void accelerate(Integer speed){

        this.nowSpd= ((speed > maxSpd) ? maxSpd : speed);
    }
    public void setPrice(Integer price){
        this.price = price; 
    }
    public void setNowSpd(Integer nowSpd){
        this.nowSpd = nowSpd;
    }
    public void setMaxSpd(Integer maxSpd){
        this.maxSpd = maxSpd;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Integer getSpeed(){
        return this.nowSpd;
    }
    public Integer getPrice() {
        return price;
    }
}
