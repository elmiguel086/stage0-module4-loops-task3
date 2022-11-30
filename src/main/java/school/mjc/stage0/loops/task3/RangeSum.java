package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int res = 0;
        for (int i = firstBoarder; i <= secondBoarder ; i++) {
            res += i;
        }
        System.out.println(res);
    }
}
