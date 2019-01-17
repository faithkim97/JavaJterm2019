import java.util.*;

public class Vehicle {
  private int numWheels;
  private String vehicleType;
  private String color;
  private String model;
  private int gasMeter;

  public Vehicle(int n, String v, String c, String m, int g) {
    vehicleType = v;
    numWheels = n;
    color = c;
    model = m;
    gasMeter = g;
  }

  public Vehicle() {
    numWheels = 4;
    vehicleType = "car";
    color = "red";
    model = "Hyundai";
    gasMeter = 100;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public int getNumWheels() {
    return numWheels;
  }

  public String getColor() {
    return color;
  }

  public String getModel() {
    return model;
  }

  public int getGasMeter() {
    return gasMeter;
  }

  public void setNumWheels(int n) {
    numWheels = n;
  }

  public void setVehicleType(String v) {
    vehicleType = v;
  }

  public void setColor(String c) {
    color = c;
  }

  public void setModel(String m) {
    model = m;
  }

  public void setGasMeter(int g) {
    gasMeter = g;
  }

  public void drive() {
    System.out.println("You are driving your " + vehicleType);
    gasMeter = gasMeter - 5 > 0 ? gasMeter - 5 : 0;
    System.out.println(vehicleType + " gas goes down to: " + gasMeter);
  }

}
