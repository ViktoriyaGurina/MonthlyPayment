public class Main {
    public static void main(String[] args) {
        MonthlyPayment service = new MonthlyPayment();
        double monthlyPayment = service.calculate( 9.99, 1_000_000 , 12);
        System.out.println(monthlyPayment);
    }
}