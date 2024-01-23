package lab1;

public class Human {
	String name;
	  int birthYear;
	  int maxAge;
	  Double weight;
	  Double height;

	  public Human(){
	    name="no name";
	    birthYear=2000;
	    maxAge=100;
	    weight=75.0;
	    height=171.0;
	  }

	  public Human(String n, int b,int a, double w, double h){
	    name=n;
	    birthYear=b;
	    maxAge=a;
	    weight=w;
	    height=h;
	  }
	  
	  public void smoke(int numOfCigarettes){
	    
	   maxAge-=2*numOfCigarettes; 
	    
	  }

	  public void exercise(int numOfHours){
	    maxAge+= numOfHours/300;
	    
	  }

	  public void displayInfo(){
	    System.out.println("Name:"+name);
	    System.out.println("Year of birth:"+birthYear);
	    System.out.println("Maximum age:"+maxAge);
	    
	  }


	  public double eat(int calories){
	    if (calories == 4000){
	      weight += 0.5;
	    }
	    return weight;
	  }

	  public double burnCalories(int calories){
	    if (calories == 4000){
	      weight -= 0.2;
	    }
	    return weight;
	  }

	  public int currentAge(int currentYear){
	    currentYear = 2023;
	    return currentYear - birthYear;
	  }
	  
	  public void displayCurrentAge(int currentYear){
	    currentYear = 2023;
	    int calc = currentYear - birthYear;
	    System.out.println(calc);
	  }

	  public double calculateBmi(double weight, double height){
	    double bmi = weight / (height * height);
	    return bmi;
	  }

	 public void checkHealthStatus(double weight, double height){
	   double bmi = weight / (height * height);
	    if (bmi > 25){
	       System.out.println("Unhealthy");
	    }
	   else{
	     System.out.println("Healthy");
	   }
	  }

	  
	}