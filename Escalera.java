public class Escalera {
    static int fibonacci(int n)
    {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static int climbStairs(int n)
    {
        return fibonacci(n + 1);
    }
    public static void main(String args[]) {
        int n = 4;
        System.out.println(climbStairs(8));
        System.out.println(climbStairs(9));
        System.out.println(climbStairs(10));
    }
}

