
public class HousingLoan extends Loan {
	
	private int propsAge;
	private String collateral;
//	Loan obj = new Loan();
	
	public HousingLoan(String applicantName, double loanAmount, double tenure, int propsAge, String collateral) {
		super(applicantName, loanAmount, tenure);
		this.propsAge = propsAge;
		this.collateral = collateral;
	}

	public int getPropsAge() {
		return propsAge;
	}

	public void setPropsAge(int propsAge) {
		this.propsAge = propsAge;
	}

	public String getCollateral() {
		return collateral;
	}

	public void setCollateral(String collateral) {
		this.collateral = collateral;
	}

	@Override
	public double calculateIntrest() {
		// TODO Auto-generated method stub
//		getLoanAmount();
		double rateofIntrest = 0.10;
		if(propsAge<5) {
			rateofIntrest = 0.12;
		}
//		else {
//			amount = getLoanAmount()*getTenure()*12;
//		}
		
		return getLoanAmount()*getTenure()*rateofIntrest;
	}

}
