
public class CalculatorTest {
   public static void main(String[] args)
   {
        if(Calculator.add(2,3) != 5)
        {
            throw new AssertionError("2 + 3 test case failed.");
        }

        System.out.println("All test cases passed");
   }
}
