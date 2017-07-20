package xyz.pietryga.lotto;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println(TextUtil.HAPPY_NUMBERS_HEADER);
        Scanner sc = new Scanner(System.in);
        String[] questions = TextUtil.getQuestions();
        TreeSet<Integer> luckyNumbers = new TreeSet<>();

        int n = 0, max = 0, day = 0, month = 0;
        do {
            try {
                System.out.print(questions[0]);
                n = sc.nextInt();

                System.out.print(questions[1]);
                max = sc.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Give a number!");
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }
        } while (n > max || n <= 0 || max <= 0);

        do {
            try {
                System.out.print(questions[2]);
                day = sc.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Give a number!");
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }
        } while (day < 1 || day > 31);

        do {
            try {
                System.out.print(questions[3]);
                month = sc.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Give a number!");
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }
        } while (month < 1 || month > 12);
        Random rand = new Random((long) ((day * 3000 + month * 120) * Math.random()));
        do {
            luckyNumbers.add(rand.nextInt(max) + 1);
        } while (luckyNumbers.size() < n);

        System.out.print(TextUtil.HAPPY_RESULT);
        StringBuilder sb = new StringBuilder();
        luckyNumbers.forEach(l -> sb.append(l).append(", "));
        sb.deleteCharAt(sb.length() - 2);
        System.out.println(sb.toString());
    }
}
