public class ArithmeticOperations {
    public ArithmeticOperations() {
    }
 
    public static void main(String[] var0) {
       byte var1 = 10;
       byte var2 = 5;
       int var3 = var1 + var2;
       int var4 = var1 - var2;
       int var5 = var1 * var2;
       int var6 = var1 / var2;
       int var7 = var1 % var2;
       double power = Math.pow(var1, var2);
        System.out.println("Power (num1 ^ num2): " + power);

        // Square root
        if (var1 >= 0) {
            double sqrtNum1 = Math.sqrt(var1);
            System.out.println("Square root of num1: " + sqrtNum1);
        } else {
            System.out.println("Square root of num1: Cannot calculate square root of a negative number");
        }

        if (var2 >= 0) {
            double sqrtNum2 = Math.sqrt(var2);
            System.out.println("Square root of num2: " + sqrtNum2);
        } else {
            System.out.println("Square root of num2: Cannot calculate square root of a negative number");
        }
        
    
       System.out.println("Number 1: " + var1);
       System.out.println("Number 2: " + var2);
       System.out.println("Sum: " + var3);
       System.out.println("Difference: " + var4);
       System.out.println("Product: " + var5);
       System.out.println("Quotient: " + var6);
       System.out.println("Remainder: " + var7);
    }}
    