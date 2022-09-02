
public class LoanService {
	
	private Loan[] loanList;
	//have a dynamic array
	public static int count = 0; 
	
	
	public LoanService() {
//		super();
	loanList = new Loan[3];
	}
	
	public boolean addLoan(Loan loan) { 
		// To increase the count of array
		loanList[count++] = loan;
		
		return true;
	}
	// Loan array is a subtype so can store any loan
	public Loan[] getAll() {
		return this.loanList;
	}
}
