package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int t1 = 1;
        int t2 = 1;
        int x  = 0;
        for (int i = 0; i < lastFibonacci; i++) {
            if(i==0){
                System.out.println(i);
            }
            else if(i>2)
            {
                x = t1 + t2;
                System.out.println(x);
                t1 = t2;
                t2 = x;
            }
            else
            {
                System.out.println(1);
            }
        }
    }
}
