package budgetcalc;

public class Budget {
  static BudgetItem salaryItem = new BudgetItem("Salary");
  static BudgetItem rentItem = new BudgetItem("Rent");
  static BudgetItem foodItem = new BudgetItem("Food");
  static BudgetItem utilitiesItem = new BudgetItem("Util:");
  static BudgetItem transportationItem = new BudgetItem("Car");
  static BudgetItem funItem = new BudgetItem("Fun");
  static BudgetItem debtItem = new BudgetItem("Debt");
  static BudgetItem savingsItem = new BudgetItem("Save");


  /**
   * This class will gold the budgetItem objects, and can be used handle budge interactions.
   */
  public static double[] budget(
      double salary, 
      double rent, 
      double food,
      double utilities,
      double transportation,
      double fun,
      double debt,
      double savings) {
    
    salaryItem.setExpense(salary);
    rentItem.setExpense(rent);
    foodItem.setExpense(food);
    utilitiesItem.setExpense(utilities);
    transportationItem.setExpense(transportation);
    funItem.setExpense(fun);
    debtItem.setExpense(debt);
    savingsItem.setExpense(savings);
    
    double expenses = 
         rent 
        + food
        + utilities
        + transportation
        + fun
        + debt
        + savings;
    double net = (salary / 12) - expenses;
    double[] budgetNumbers = {salary / 12, expenses, net};
    return budgetNumbers;
    //TODO update BudgetItems every time a KeyRelese event is detected
    //TODO allow the user to enter the estimated taxable percentage
    //TODO flag high percentage budget Items
    //TODO Allow the user to select how frequently the expense occurs (expense per year/month etc.
  }


}
