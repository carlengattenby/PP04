import java.time.Duration;
import java.time.Instant;
public class Algorithm {

     public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fib2(10));
    
        long start1 =  System.currentTimeMillis();
        Algorithm.fib2(20);
        //Algorithm.fib(20);
        long end1 = System.currentTimeMillis();      
        System.out.println("Elapsed Time in milli seconds: "+ (end1-start1));
    }

    public static long fib(long n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

    private static long fib2(long n) {
        long prev = 1;
        long current = 1;
        for (int i = 2; i <= n; i++) {
            long temp = current;
            current = prev + current;
            prev = temp;
        }
        return current;
    }  
    
}


