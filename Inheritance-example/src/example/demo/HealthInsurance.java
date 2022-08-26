package example.demo;

public class HealthInsurance extends Insurance {
	
	
	// now we want to change our super class method: 
	
	private boolean preExisitingDisease;
	private int age;
	
	
	// health insurance properties use different properties : 
	
	public HealthInsurance() {
		// even if the super() is removerd what will it do
		// weather we put the keyword super or not the constructor will be called 
		// We use super to know which constructor to allow 
//		super();
		
	}
	
	
	
	@Override
	protected double calculatePremium() {
		// TODO Auto-generated method stub
		double premium = 6000; 
		// By default bool is false 
		if(preExisitingDisease && age >60) premium = 7000;
		
		return premium;
		
//		return super.calculatePremium();
	}



	public HealthInsurance(long policyNumber, String policyHolderName, double policyAmount, boolean preExisitingDisease,
			int age) {
		
		super(policyNumber, policyHolderName, policyAmount);
		this.preExisitingDisease = preExisitingDisease;
		this.age = age;
		
		
	}
	
	
}
