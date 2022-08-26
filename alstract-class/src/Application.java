
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan obj1 = new HousingLoan("Swaggy Sinha", 2000000.00,20,22,"House");
		
		Loan obj2 = new PersonalLoan("Mohan Singh", 2000000.00,20,"IT",40000);

		Loan obj3 = new JewelLoan("Shivam Tyagi", 500000.00, 10, 6);
		
		LoanService service = new LoanService(); 
//		System.out.println("is Added "+service.addLoan(obj1));
		
		service.addLoan(obj1);
		service.addLoan(obj2);
		service.addLoan(obj3);
		Loan [] loans = service.getAll();
		
		
		for(Loan eachLoan: loans) {
			System.out.println(eachLoan.calculateIntrest());
		}
	}

}
