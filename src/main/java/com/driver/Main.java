package com.driver;

public class Main {

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function called p
        Product p = new Product();

        // Task 3: Call method product(int x, int y) using Product class object p
        int result1 = p.product(5, 10);
        System.out.println("Product of 5 and 10 is: " + result1);

        // Task 4: Call method product(int x, int y, int z) using Product class object p
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4 is: " + result2);

        // Task 5: Call method product(double x, double y) using Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5 is: " + result3);
    }

    // Task 1: Create a class Product inside Main class
    static class Product {
        // Task 3: Create method product(int x, int y)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create overloaded method product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create overloaded method product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }
    }
}
