public class CreditPaymentService {
    public double calculate(int loanAmount, double interestRate, int creditTerm) {
        double monthlyInterestRate = interestRate / (100 * 12);
        double exponentiation = (Math.pow(1 + monthlyInterestRate, -creditTerm));

        double monthlyPaymentAmount = loanAmount * (monthlyInterestRate/(1 - exponentiation));
        int monthlyPaymentAmountNew = (int) monthlyPaymentAmount;
        return monthlyPaymentAmountNew;
    }
}