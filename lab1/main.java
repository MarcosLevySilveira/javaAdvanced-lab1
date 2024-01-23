package lab1;

public class main {

	public static void main(String[] args) {
		 Human h = new Human("John", 1990, 28, 75.0, 1.75);
		    System.out.println(h.name + ", " + h.weight);
		    h.eat(4000);
		     System.out.println(h.name + ", " + h.weight);
		   
		  
		    
		    System.out.println(h.name + ", " + h.weight);
		    h.burnCalories(4000);
		    System.out.println(h.name + ", " + h.weight);
		    
		    System.out.println(h.name + ", " + h.weight);
		    h.currentAge(2023);
		    System.out.println(h.name + ", " +  h.currentAge(2023));
		    h.displayCurrentAge(2023);
		    h.calculateBmi(h.weight, h.height);
		    System.out.println(h.calculateBmi(h.weight, h.height));
		    h.checkHealthStatus(h.weight, h.height);

	}

}
