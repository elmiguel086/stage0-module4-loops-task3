package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int a = Math.abs(t);
        String number = String.valueOf(a);
        int res = 0;
        for (int i = 0; i < number.length() ; i++) {
            res += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        System.out.println(res);
    }
}
