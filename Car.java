public class Car {
    String modelNumber;
    String brand;
    double price;
    String speed;
    float capacity;
    String mileage;
  
    public static int instances = 0;
    
    Car(String modelNumber, String brand, double price) {
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.price = price;
        instances ++;
    }
    
    Car(String modelNumber, String brand, double price, String speed, String mileage) {
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.price = price;
        this.speed = speed;
        this.mileage = mileage;
        instances ++;
    }
    
    Car(String modelNumber, String brand, double price, String speed, float capacity, String mileage) {
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.price = price;
        this.speed = speed;
        this.capacity = capacity;
        this.mileage = mileage;
        instances ++;

    }
    
    
     public static void main(String []args){
        Car myCar1 = new Car("2018FIESTA", "FORD", 1032632.245);
        myCar1.printClassProperties();
        System.out.println("Number of objects created : " + Car.instances);
        Car myCar2 = new Car("2018FOCUS", "FORD", 1304875.25,"200 KMPH","16LP");
        myCar2.printClassProperties();
        System.out.println("Number of objects created : " + Car.instances);
        Car myCar3 = new Car("2018MUSTANG", "FORD", 1898793.40,"300 KMPH","12LP");
        myCar3.printClassProperties();
        System.out.println("Number of objects created : " + Car.instances);
     
     }
    public void printClassProperties() {
        if (this.modelNumber != null) {
            System.out.println("Model Number:" + this.modelNumber);
        } 
        
        if (this.brand != null) {
              System.out.println("Brand:" + this.brand);
        }
        
        if (this.price >= 0) {
              System.out.println("Price:" + this.price);
        }
        
        if (this.speed != null) {
              System.out.println("Speed:" + this.speed);
        }
        
        if (this.capacity >= 0.0) {
              System.out.println("Capacity:" + this.capacity);
        }
        
        if (this.mileage != null) {
              System.out.println("Mileage:" + this.mileage);
        }
    }
    
}