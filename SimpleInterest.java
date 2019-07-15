import java.util.Scanner;

class SimpleInterest{
	double principleInterest, interestRate;
	int time;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//instantiate class
		SimpleInterest si = new SimpleInterest();
		//get principle interest
		System.out.print("Enter Principle : ");
		si.setPrinciple(sc.nextDouble());
		//get interest rate
		System.out.print("Enter Rate of interest : ");
		si.setRate(sc.nextDouble());
		//get time
		System.out.print("Enter Time in years : ");
		si.setTime(sc.nextInt());

		//print results
		si.printResult();

	}

	public void setPrinciple(double val){
		this.principleInterest = val;
	}

	public void setRate(double val){
		this.interestRate = val;
	}

	public void setTime(int val){
		this.time = val;
	}

	public void printResult(){
		System.out.print("Simple Interest :"+((double)(this.principleInterest*(this.interestRate/100))));
	}
}