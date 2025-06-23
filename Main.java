public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to your calculator!");

        // all calculator operations will be performed on the same instance
        Calculator myCalculator = new Calculator();

        // call each method and print the result
        double sum = myCalculator.add(5,7);
        System.out.println("This is the sum of your input: " + sum);

        double diff = myCalculator.sub(45,11);
        System.out.println("This is the difference of your input: " + diff);

        double mult = myCalculator.mult(6,3);
        System.out.println("This is the product of your input: " + mult);

        double div = myCalculator.div(36,9);
        System.out.println("This is the result of dividing your input: " + div);

        int mod = myCalculator.mod(14,7);
        System.out.println("This is the result of the modulus: " + mod);
        System.out.println("Thank you for using my calculator!");
    }
}