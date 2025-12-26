public class Car {
    private String brand="BMW";
    private int milage=20;
    private String color="Black";
    private int speed=300;
    private String engine="Twin Turbo";

    public String getBrand(){return brand;}
    public String getColor(){return color;}
    public int getSpeed(){return speed;}
    public String getEngine(){return engine;}

    public void setMilage(int milage){this.milage=milage;}
    public void setColor(String color){this.color=color;}
    public void setSpeed(int speed){this.speed=speed;}
    public void setEngine(String engine){this.engine=engine;}

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.toString());

        // System.out.println(car.getBrand());
        // System.out.println(car.getMilage());
        // System.out.println(car.getColor());
        // System.out.println(car.getSpeed());
        // System.out.println(car.getEngine());


    }

}
