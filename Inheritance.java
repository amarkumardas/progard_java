import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        SportsCar obj=new SportsCar();
        obj.setVehicleType();
        obj.setColor();
        obj.setWheel();
        obj.setSeatType();
        obj.setCarNumber();
        obj.setRemoteStart();
        obj.setBrand();
        System.out.println("Details:");
        System.out.println("VEHICLE TYPE: "+obj.vehicleType);
        System.out.println("VEHICLE COLOR: "+obj.getColor());
        System.out.println("Wheels: "+obj.getWheel());
        System.out.println("Seat type: "+obj.getSeatType());
        System.out.println("Vehicle number :"+obj.getCarNumber());
        System.out.println("Remote start feature: "+obj.getRemoteStart());
        System.out.println("Vehicle brand: "+obj.getBrand());
    }
}
class Vehicle{
    Scanner sc=new Scanner(System.in);
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType() {
        System.out.println("Enter vehicle type: ");
        this.vehicleType = sc.next();
    }

    String vehicleType;
}
class Car extends Vehicle{
    Scanner sc=new Scanner(System.in);

    public String getColor() {
        return color;
    }

    public void setColor( ) {
        System.out.println("Enter color: ");
        this.color = sc.next();
    }

    public byte getWheel() {
        return wheel;
    }

    public void setWheel() {
        System.out.println("Enter number of wheel");

        this.wheel = sc.nextByte();
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType() {
        System.out.println("Enter seat type (Leather/non Leather):");
        this.seatType = sc.next();
    }

    String color;
    byte wheel;
    String seatType;
}
class SportsCar extends Car{
    Scanner sc=new Scanner(System.in);
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber() {
        System.out.println("Enter car number");
        this.carNumber = sc.next();
    }

    public String getRemoteStart() {
        return remoteStart;
    }

    public void setRemoteStart( ) {
        System.out.println("Remote start Available or not(Y/N)");
        this.remoteStart = sc.next();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand( ) {
        System.out.println("Enter brand name :");
        this.brand = sc.next();
    }

    String carNumber;
    String remoteStart;
    String brand;
}