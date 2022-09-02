
public class JewelLoan extends Loan {

	private int jewelWeight;
	
	
	public JewelLoan(String applicantName, double loanAmount, double tenure, int jewelWeight) {
		super(applicantName, loanAmount, tenure);
		this.jewelWeight = jewelWeight;
	}



	public int getJewelWeight() {
		return jewelWeight;
	}



	public void setJewelWeight(int jewelWeight) {
		this.jewelWeight = jewelWeight;
	}

	double rateofIntrest;

	@Override
	public double calculateIntrest() {
		// TODO Auto-generated method stub
		if(jewelWeight >= 5) {
			rateofIntrest  = 0.04;
		}
		else {
			rateofIntrest = 0.07;
		}
		return getLoanAmount()*getTenure()*rateofIntrest;
	}

}
