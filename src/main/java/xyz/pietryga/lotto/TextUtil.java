package xyz.pietryga.lotto;

public class TextUtil {

    public static final String HAPPY_NUMBERS_HEADER
	    = "  _   _                                _   _                    _                        _ \n"
	    + " | | | |                              | \\ | |                  | |                      | |\n"
	    + " | |_| |  __ _  _ __   _ __   _   _   |  \\| | _   _  _ __ ___  | |__    ___  _ __  ___  | |\n"
	    + " |  _  | / _` || '_ \\ | '_ \\ | | | |  | . ` || | | || '_ ` _ \\ | '_ \\  / _ \\| '__|/ __| | |\n"
	    + " | | | || (_| || |_) || |_) || |_| |  | |\\  || |_| || | | | | || |_) ||  __/| |   \\__ \\ |_|\n"
	    + " \\_| |_/ \\__,_|| .__/ | .__/  \\__, |  \\_| \\_/ \\__,_||_| |_| |_||_.__/  \\___||_|   |___/ (_)\n"
	    + "              | |    | |      __/ |                                                       \n"
	    + "              |_|    |_|     |___/                                                        \n";

    public static final String HAPPY_RESULT = "Your happy numbers are: ";

    public enum HappyQuestion {
	TOTAL("Total lucky numbers [n]: "),
	MAX("Max value [greater than or equal n]: "),
	DAY("Day of birth [1-31]: "),
	MONTH("Month of birth [1-12]: ");

	private final String question;

	private HappyQuestion(String question) {
	    this.question = question;
	}

	public String getQuestion() {
	    return question;
	}
    }

    private TextUtil() {
    }

}
