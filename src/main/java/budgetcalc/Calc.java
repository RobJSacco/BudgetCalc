package budgetcalc;

import org.apache.commons.lang3.StringUtils;

public class Calc {


  private static double yearlySalary = 0;  


  //number of that variable in a year
  private static final int biWeeksPerYear = 26;

  public static void netWorthDelta() {

  }
  
  /**
   * Converts a string of numbers into financial standard. From 123456 to $1,234.56
   * @param string the string entered by the user
   * @param withCents true includes cents in the calculation
   * @return
   */
  public static String numericToFinancial(String string, Boolean withCents) {
    //FIXME unexpected results when withCents = true
    //Seems to multiply by 12 instead of divide by 12.
    String numeric = "";
    for (int i = 0; i < string.length(); i++) {
      if (StringUtils.isNumeric(string.substring(i,i + 1))) {
        numeric = numeric.concat(string.substring(i,i + 1));
      }
    }
    numeric = numeric.replace(".", "");
    numeric = numeric.replace(",", "");
    String financialString = "$"; 

    int decLen = 0;
    if (withCents) {
      decLen = 2;
    } 
    for (int i = 0; i < numeric.length(); i++) {   
      if (withCents) {
        if ((i == numeric.length() - decLen) && numeric.length() > decLen) {
          financialString = financialString.concat(".");                    
        }        
      }

      if  (((numeric.length() - decLen - i) % 3 == 0) && i != numeric.length() - decLen && i != 0) {       
        financialString = financialString.concat(",");
      }
      financialString = financialString.concat(numeric.substring(i, i + 1));
    }
    return financialString;
  }
  
  /**
   * Converts financial standard string into a double. $1,234.56 to 1234.56
   * @param financialString the string in financial standard
   * @return
   */
  public static double financialToDouble(String financialString) {
    double numeric = 0;
    String numericString = financialString.replace("$", "").replace(",", "");
    
    if (StringUtils.isNumeric(numericString)) {
      numeric = Double.valueOf(numericString);         
    }    
    return numeric;    
  }

  public static double getYearlySalary() {
    return yearlySalary;
  }

  public static void setYearlySalary(double yearlySalary) {
    //TODO Add support for take home/taxable income
    Calc.yearlySalary = yearlySalary;
  }

  public static double getBiWeeklySalary() {
    return yearlySalary / biWeeksPerYear;
  }

  public static void setBiWeeklySalary(double biWeeklySalary) {
    Calc.yearlySalary = biWeeklySalary * biWeeksPerYear;
  }
}
