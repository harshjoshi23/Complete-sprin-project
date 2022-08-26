package example.demo;

public class Application {

	public static void print(Insurance insurance) {
		System.out.println(insurance.calculatePremium());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance policy = new Insurance(101023,"Ramesh",70000);
		System.out.println(policy);
		print(policy);
//		
//		System.out.println(policy);
//		HealthInsurance obj1 = new HealthInsurance(2020,"Mohan", 30000, false, 50);
//		HealthInsurance obj2 = new HealthInsurance(2020,"Mohan", 30000, true, 80);
//		HealthInsurance obj3 = new HealthInsurance(2020,"Mohan", 30000, false, 50);
		
		// SuperClass = SubClass we can type it like this : 
		//but, AnyClass = AnyOtherClass is not possible, 
		// It needs to be the subclass of the other class 
		
		Insurance obj1 = new HealthInsurance(2020,"Mohan", 30000, false, 50);
		Insurance obj2 = new HealthInsurance(2020,"Mohan", 30000, true, 80);
		Insurance obj3 = new HealthInsurance(2020,"Mohan", 30000, false, 50);
		
		print(obj1);
		print(obj2);
		print(obj3);
		
//		HealthInsurance obj2 = new HealthInsurance();
		System.out.println(obj1);
		System.out.println(obj1.calculatePremium());
		
		System.out.println(obj2);
		System.out.println(obj2.calculatePremium());
		
		System.out.println(obj3);
		System.out.println(obj3.calculatePremium());


	}

	
}
