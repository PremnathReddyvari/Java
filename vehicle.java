package first;

import java.util.ArrayList;

public class vehicle {
	    public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
		String modelNumber;
	    String brand;
	    String speed;
	    String mileage;
	    double price;
	
	    public static void main(String[] args) {
	       
	    	vehicle v1=new vehicle();
	    	v1.modelNumber="2018FIESTA";
	    	v1.brand= "ford";
	    	v1.speed="100 KMPH";
	    	v1.price=1032632.245;
	    	System.out.println("modelnumber:"+v1.modelNumber+", brand:"+v1.brand+",speed:"+v1.speed+",price:"+v1.price);
	    	
	    	vehicle v2=new vehicle();
	    	v2.modelNumber="2018FOCUS";
	    	v2.brand= "ford";
	    	v2.speed="200 KMPH";
	    	v2.price=1304875.25;
	    	v2.mileage="16 PL";
	    	System.out.println("modelnumber:"+v2.modelNumber+", brand:"+v2.brand+",speed:"+v2.speed+",price:"+v2.price);
	    	
	    	vehicle v3=new vehicle();
	    	v3.modelNumber="2018MUSTANG";
	    	v3.brand= "ford";
	    	v3.speed="300 KMPH";
	    	v3.price=1898793.40;
	    	v3.mileage="12 PL";
	    	System.out.println("modelnumber:"+v3.modelNumber+", brand:"+v3.brand+",speed:"+v3.speed+",price:"+v3.price);
	    	 String result;
	    	 result=((v1.speed==v3.speed) ?((v2.speed==v3.speed) ? v2.modelNumber :v3.modelNumber): (v3.speed==v2.speed) ? v2.modelNumber:v3.modelNumber);
		        System.out.println("the fastest going car is :"+result);
	    	if(v1.brand==v2.brand && v2.brand==v3.brand){
	    		System.out.println("all listed cars are of same brand");
	    	}
	    	
	    	String total;
	    	total= 100+200+300+"KMPH";
	    	System.out.println("the total sum of speeds of cars :"+total);
	    	double diffPrice;
	    	diffPrice= v2.price-v1.price;
	    	System.out.println("price difference between 2018FOCUS 2018FIESTA and  :"+diffPrice);
	    	diffPrice=v3.price-v2.price;
	    	System.out.println("price difference between 2018MUSTANG and 2018FOCUS: "+diffPrice);
	    	if(v1.price>v2.price){
	    		System.out.println("the highest pricing car is:"+v1.modelNumber);
	    		
	    	}
	    	else if (v2.price>v3.price)
    			System.out.println("the highest pricing car is: "+v1.modelNumber);
    		else
    			System.out.println("the highest pricing car is :"+v1.modelNumber);
	    	System.out.println("v1 instance of v2"+(v1 instanceof vehicle));
	    	
	    	 ArrayList<vehicle> al=new ArrayList<vehicle>();  
	    	  al.add(v1);  
	    	  al.add(v2); 
	    	  al.add(v3);  
	    	  for (vehicle v: al)
	    		  //System.out.println(v.modelNumber);
	    		  System.out.println("modelnumber:"+v.modelNumber+", brand:"+v.brand+",speed:"+v.speed+",price:"+v.price);
	    	
	    	  
	    	
	    }
	    
}
	    	
	    	
	    	
	    	
	    	
			
	    

