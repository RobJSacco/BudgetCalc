package model.budgetcalc;

import utils.NumberUtils;

public class Budget {
  private Double totalExpenses;
  private Double totalIncome;
  private Double net;
  
  public Budget(Double[] Incomes, Double[] Expenses){
    totalIncome = (NumberUtils.sum(Incomes) / 12);
    totalExpenses = NumberUtils.sum(Expenses);
    net = totalIncome - totalExpenses;
    //TODO allow the user to enter the estimated taxable percentage
    //TODO flag high percentage budget Items
    //TODO Allow the user to select how frequently the expense occurs (expense per year/month etc.
  }
  
  public Double getIncome() {
    return totalIncome;
  }
  
  public Double getExpenses() {
    return totalExpenses;
  }
  
  public Double getNet() {
    return net;
  }

}

