import java.util.*;

public class VehicleImpl {
  public static void main(String[] args) {
    Vehicle car = new Vehicle();
    Vehicle truck = new Vehicle(6, "truck", "black", "Toyota", 2000);
    System.out.println(car.getVehicleType() + " has " +
      car.getGasMeter() + " while " + truck.getVehicleType() + " has " +
      truck.getGasMeter() + " gallons of gas. ");

    car.drive();
    truck.drive();
  }


}
