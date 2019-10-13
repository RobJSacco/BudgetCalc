package model.budgetcalc;

import utils.NumberUtils;

public class Budget {
  private Double totalExpenses;
  private Double totalIncome;
  private Double net;
  
  public Budget(Double[] Incomes, Double[] Expenses, Double taxes){
    totalIncome = (NumberUtils.sum(Incomes) / 12) * (1 - taxes);
    totalExpenses = NumberUtils.sum(Expenses);
    net = totalIncome - totalExpenses;
    //TODO flag high percentage budget Items
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

