
public class PersonalLoan extends Loan {
	
	private String profession;
	private double salary;

	
	public PersonalLoan(String applicantName, double loanAmount, double tenure, String profession, double salary) {
		super(applicantName, loanAmount, tenure);
		this.profession = profession;
		this.salary = salary;
	}


	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public double calculateIntrest() {
		
		double rateofIntrest = 0.06;
		if(salary<=40000) {
			rateofIntrest = 0.08;
		}
		return getLoanAmount()*getTenure()*rateofIntrest;
	}

}
