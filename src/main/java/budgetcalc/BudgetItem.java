package budgetcalc;

public class BudgetItem {
  private double yearlyExpense = 0;
  private double percentExpense = 0;
  private double maximumDesiredPercent = 0;

  //number of that variable in a year
  private final int weeksPerYear = 52;
  private final int monthsPerYear = 12;
  private final int biWeeksPerYear = 26;
  
  private String name;
  
  BudgetItem(String name){
    this.name = name;
  }
  public void setExpense(double Expense) {    
    this.yearlyExpense = Expense;     
  }
  public double getYearlyExpense() {
    return yearlyExpense;
  }

  public void setYearlyExpense(double yearlyExpense) {
    this.yearlyExpense = yearlyExpense;     
  }


  public double getMonthlyExpense() {
    return yearlyExpense / monthsPerYear;
  }

  public void setMonthlyExpense(double monthlyExpense) {    
    setYearlyExpense(monthlyExpense * monthsPerYear); 
  }

  public double getBiWeeklyExpense() {
    return yearlyExpense / biWeeksPerYear;
  }

  public void setBiWeeklyExpense(double biWeeklyExpense) {
    setYearlyExpense(biWeeklyExpense * biWeeksPerYear); 
  }

  public double getWeeklyExpense() {
    return yearlyExpense / weeksPerYear;
  }

  public void setWeeklyExpense(double weeklyExpense) {
    setYearlyExpense(weeklyExpense * weeksPerYear); 
  }

  public double getPercentExpense() {
    return percentExpense;
  }

  public double getMaximumDesiredPercent() {
    return maximumDesiredPercent;
  }

  public void setMaximumDesiredPercent(double maximumDesiredPercent) {
    this.maximumDesiredPercent = maximumDesiredPercent;
  }


}
