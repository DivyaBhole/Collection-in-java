public class Main {
    public static void main(String[] args) { // Passing the values
        Divi homeLoan = new HomeLoan(200000, 0.05, 30);
        Divi carLoan = new CarLoan(30000, 0.07, 5);
//calculation
        System.out.println("Home Loan Amount: " + homeLoan.loanAmount());
        homeLoan.accept();

        System.out.println("Car Loan Amount: " + carLoan.loanAmount());
        carLoan.accept();
    }
}
