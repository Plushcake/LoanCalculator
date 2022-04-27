public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double calculatingTheMonthlyPayment = service.calculate(1_000_000, 9.99, 1);
        System.out.println("Ежемесячный платеж " + (int) (calculatingTheMonthlyPayment * 100) / 100 + " рублей");
    }
}
