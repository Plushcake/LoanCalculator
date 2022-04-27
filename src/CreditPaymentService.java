public class CreditPaymentService {
    public double calculate(int totalCredit, double interestRate, int loanTerm) {


        int months = loanTerm * 12;

        double mir = interestRate / 100 / 12;


        double payment = totalCredit * mir / (1 - 1 / Math.pow(1 + mir, months));


        return payment;
    }
}

//Расчитать ежемесячный платеж.

//Total credit - сумма кредита.
//Interest rate - процентная ствака годовая.
// Loan term - срок кредита.

//monthly interest rate - месячная процентная ставка. Сократил до слова mir.


