public class MathOperations {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three doubles
    public  double add(double a, double b, double c) {
        return a + b + c;
    }
    
    // Method to concatenate two strings
    public  String add(String a, String b) {
        return a + b;
        }
    
    // Demonstration of usage
    public static void main(String[] args) {
        MathOperations mo=new MathOperations();
        int sum1 = mo.add(10, 10);
        System.out.println("Sum of two integers: " + sum1);
        
        double sum2 = mo.add(10.5, 11.5, 12.5);
        System.out.println("Sum of three doubles: " + sum2);
        
        String combined = mo.add("Data ", "Valley!");
        System.out.println("Concatenated string: " + combined);
    }
}