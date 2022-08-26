
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan obj1 = new HousingLoan("Swaggy Sinha", 2000000.00,20,22,"House");
		
		Loan obj2 = new PersonalLoan("Mohan Singh", 2000000.00,20,"IT",40000);

		
		LoanService service = new LoanService(); 
		
		service.addLoan(obj1);
		Loan [] loans = service.getAll();
		
		for(Loan eachLoan: loans) {
			System.out.println(eachLoan.calculateIntrest());
		}
	}

}
