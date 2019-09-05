import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GstCalculatorTest {
  Product product=new Product("Burger",100,10,0);
  GstCalculator gstCalculator=new GstCalculator(product);

  @Test
  public void calculateTotalBill() {
    System.out.println(gstCalculator.calculateTotalBill());
  }
}