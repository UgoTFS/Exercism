public class SalaryCalculator {
    private int baseSalary = 1000;

    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? 0.85 : 1.00;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold*multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = multiplierPerDaysSkipped(daysSkipped)*baseSalary+bonusForProductSold(productsSold);
        return salary < 2000.0 ? salary : 2000;
    } 
}
