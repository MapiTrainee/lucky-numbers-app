package xyz.pietryga.lotto;

import java.util.Scanner;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class HappyNumbersAppTest {

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Test
    public void testGetValue_sampleQuestionAndInputLine_returnedValueAndSkippedScanner() {
	String question = TextUtil.HappyQuestion.TOTAL.getQuestion();
	String inputLine = "10";

	Scanner scanner = new Scanner(System.in);
	systemInMock.provideLines(inputLine);

	assertThat(HappyNumbersApp.getValue(question, scanner), is(10));
	assertThat(scanner.hasNext(), is(false));
    }

    @Test
    public void testGetValue_sampleQuestionAndDifferentInputLines_returnedFirstNumberValueAndSkippedScanner() {
	String question = TextUtil.HappyQuestion.TOTAL.getQuestion();
	String[] inputLines = new String[]{"abc", "abc abc abc", "1 2 3 4"};

	Scanner scanner = new Scanner(System.in);
	systemInMock.provideLines(inputLines);

	assertThat(HappyNumbersApp.getValue(question, scanner), is(1));
	assertThat(scanner.hasNext(), is(false));
    }

}
