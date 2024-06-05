
public class CarLoan implements Divi { // implementing interface
    private double principal;
    private double rate;
    private int years;

    public CarLoan(double principal, double rate, int years) { // parameters
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }

    @Override
    public double loanAmount() {
        // Simple interest calculation
        return principal + (principal * rate * years);
    }

    @Override
    public void accept() { // accept method
        System.out.println("Car loan accepted.");
    }
}
