public class MonthlyPayment {
    public double calculate(double percent, double creditAmount, double creditPeriod ) {
        double monthlyRateDouble = percent / 100;
        double monthlyRate = monthlyRateDouble / creditPeriod;
        double annuityRate = (monthlyRate * Math.pow((1+monthlyRate),creditPeriod) / (Math.pow((1+monthlyRate),creditPeriod) - 1));
        double monthlyPayment = annuityRate * creditAmount;

        return monthlyPayment;
    }
}

