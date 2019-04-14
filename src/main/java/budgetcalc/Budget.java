package budgetcalc;

public class Budget {
  double yearlySalary;

  /**
   * This class will gold the budgetItem objects, and can be used handle budge interactions.
   */
  public static void budget() {

    BudgetItem rent = new BudgetItem();
    BudgetItem food = new BudgetItem();
    BudgetItem utilitys = new BudgetItem();
    BudgetItem transportation = new BudgetItem();
    BudgetItem fun = new BudgetItem();
    BudgetItem debt = new BudgetItem();
    BudgetItem savings = new BudgetItem();
    rent.setYearlyExpense(1);
    
    //TODO update BudgetItems every time a KeyRelese event is detected
    //TODO allow the user to enter the estimated taxable percentage
    //TODO flag high percentage budget Items
    

  }

}
