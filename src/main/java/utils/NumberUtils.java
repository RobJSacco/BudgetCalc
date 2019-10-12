package utils;

public class NumberUtils {
public static Double sum(Double[] num) {
  Double total = (double) 0;
  
  for (Double i:num) {
    total=total + i;
  }
  
  return total;
}
}
