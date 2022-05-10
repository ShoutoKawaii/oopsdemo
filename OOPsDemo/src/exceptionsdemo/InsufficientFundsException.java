package exceptionsdemo;

public class InsufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amt;
	
	public InsufficientFundsException(double amt) {
		this.amt = amt;
	}

	public double getAmt() {
		return amt;
	}
	
	
	
	

}
