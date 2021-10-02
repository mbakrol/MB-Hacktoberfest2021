public class Fibonacchi {
    public static void main(String[] args) {
        // for (int i = 0; i < 11; i++) {
        // System.out.println(fiboFormula(i));
        // }
        System.out.println(fiboFormula(50));
    }

    // Time Complexity = O(1.6180)^n
    static int fiboFormula(int n) {
        // just for demo, use long instead
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));// Goldern Ratio
    }

    // It has an issue , It is only showing The Fibonacci Series for small range
    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
