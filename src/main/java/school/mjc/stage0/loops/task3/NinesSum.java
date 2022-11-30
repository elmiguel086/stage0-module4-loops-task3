package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if(lengthOfLastNumber<1)
            System.out.println("0");
        else
        {
            int res = 0;
            for (int i = 0; i <= lengthOfLastNumber; i++) {
                String nines = "0";
                for (int j = 0; j < i ; j++) {
                    nines += "9";
                }
                res += Integer.parseInt(String.valueOf(nines));
            }
            System.out.println(res);
        }

    }

}
