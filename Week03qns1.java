import java.util.Scanner;

public class Week03qns1 {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
  
    public Week03qns1() {
      this(2.5, 1, 1000);
    }
  

    public Week03qns1(double annualInterestRate, int numberOfYears,
        double loanAmount) {
      this.annualInterestRate = annualInterestRate;
      this.numberOfYears = numberOfYears;
      this.loanAmount = loanAmount;
      loanDate = new java.util.Date();
    }
  
    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
      return annualInterestRate;
    }
  
    public void setAnnualInterestRate(double annualInterestRate) {
      this.annualInterestRate = annualInterestRate;
    }
  
    public int getNumberOfYears() {
      return numberOfYears;
    }
  
    public void setNumberOfYears(int numberOfYears) {
      this.numberOfYears = numberOfYears;
    }
  
  
    public double getLoanAmount() {
      return loanAmount;
    }
  
  
    public void setLoanAmount(double loanAmount) {
      this.loanAmount = loanAmount;
    }
  
    public double getMonthlyPayment() {
      double monthlyInterestRate = annualInterestRate / 1200;
      double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
        (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
      return monthlyPayment;    
    }
  
 
    public double getTotalPayment(double monthlyPayment) {
      double totalPayment = getMonthlyPayment() * numberOfYears * 12;
      return totalPayment;    
    }
  
  
    public java.util.Date getLoanDate() {
      return loanDate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();
        Week03qns1 ln001 = new Week03qns1(annualInterestRate, numberOfYears, loanAmount);
        double monthlyPayment = ln001.getMonthlyPayment();
        System.out.println("The loan was created on " + ln001.getLoanDate());
        System.out.printf("The monthly payment is %.2f %n", monthlyPayment);
        System.out.printf("The total payment is %.2f", ln001.getTotalPayment(monthlyPayment));
        input.close();
      }

    
  }

