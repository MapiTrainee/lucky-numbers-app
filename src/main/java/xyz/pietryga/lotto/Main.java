package xyz.pietryga.lotto;

import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import static xyz.pietryga.lotto.TextUtil.*;

public class Main {

    public static void main(String[] args) throws ParseException {
	System.out.println(HAPPY_NUMBERS_HEADER);
	Scanner sc = new Scanner(System.in);
	TreeSet<Integer> luckyNumbers = new TreeSet<>();
	int n = 0, max = 0, day = 0, month = 0, year = 0;

	// Total and Max value
	do {
	    n = getValue(HappyQuestion.TOTAL.getQuestion(), sc);
	    max = getValue(HappyQuestion.MAX.getQuestion(), sc);
	} while (n <= 0 || max <= 0 || n > max);

	// Day of birth
	do {
	    day = getValue(HappyQuestion.DAY.getQuestion(), sc);
	} while (day < 1 || day > 31);

	// Month of birth
	do {
	    month = getValue(HappyQuestion.MONTH.getQuestion(), sc);
	} while (month < 1 || month > 12);

	// Year of birth
	do {
	    year = getValue(HappyQuestion.YEAR.getQuestion(), sc);
	} while (year < CURRENT_YEAR - 100 || year > CURRENT_YEAR);

	Random generator = new Random(System.currentTimeMillis() - (day * month * year));
	do {
	    luckyNumbers.add(generator.nextInt(max) + 1);
	} while (luckyNumbers.size() < n);

	System.out.print(HAPPY_RESULT + luckyNumbers);
    }

    private static int getValue(String question, Scanner sc) {
	System.out.print(question);
	while (!sc.hasNextInt()) {
	    sc.next();
	    sc.skip(".*");
	    System.out.print("Set a number!\n" + question);
	}
	int value = sc.nextInt();
	sc.skip(".*");
	return value;
    }
}
