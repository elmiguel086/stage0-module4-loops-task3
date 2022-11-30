package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first==0||second==0)
            if(first==0)
                System.out.println(second);
            else
                System.out.println(first);
        else {
            int[] a = new int[1+(first+second)/2];
            for (int i = 1; i <= first; i++) {
                if(first%i==0)
                    a[i]=i;
            }
            int[] b = new int[1+(first+second)/2];
            for (int i = 1; i <= second; i++) {
                if(second%i==0)
                    b[i]=i;
            }
            int equals = 0;
            int bigNum = 0;

            for (int i = 1; i < a.length; i++) {
                for (int j = 1; j < b.length; j++) {
                    if(a[i]==b[j]) {
                        equals = a[i];
                        break;
                    }
                }
                if(bigNum<equals)
                    bigNum=equals;
            }
            System.out.println(bigNum);

        }
    }
}
