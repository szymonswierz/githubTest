package Section6.ReadingUserInputFixed;

import java.util.Scanner;

public class LoopChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Give any character to quit: ");
            try {
                String num = scanner.nextLine();
                int fixedNum = Integer.parseInt(num);
                if (fixedNum < minNum) {
                    minNum = fixedNum;
                }
                if (fixedNum > maxNum) {
                    maxNum = fixedNum;
                }
            } catch (NumberFormatException badInput) {
                System.out.println("MIN = " + minNum);
                System.out.println("MAX = " + maxNum);
                break;
            }

        }
    }

}
