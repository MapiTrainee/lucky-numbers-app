package xyz.pietryga.lotto;

import java.util.Arrays;
import java.util.List;

public class TextUtil {

    public static String HAPPY_NUMBERS_HEADER
            = "  _   _                                _   _                    _                        _ \n"
            + " | | | |                              | \\ | |                  | |                      | |\n"
            + " | |_| |  __ _  _ __   _ __   _   _   |  \\| | _   _  _ __ ___  | |__    ___  _ __  ___  | |\n"
            + " |  _  | / _` || '_ \\ | '_ \\ | | | |  | . ` || | | || '_ ` _ \\ | '_ \\  / _ \\| '__|/ __| | |\n"
            + " | | | || (_| || |_) || |_) || |_| |  | |\\  || |_| || | | | | || |_) ||  __/| |   \\__ \\ |_|\n"
            + " \\_| |_/ \\__,_|| .__/ | .__/  \\__, |  \\_| \\_/ \\__,_||_| |_| |_||_.__/  \\___||_|   |___/ (_)\n"
            + "              | |    | |      __/ |                                                       \n"
            + "              |_|    |_|     |___/                                                        \n\n";

    public static String[] questions = {"Total lucky numbers [n]: ", "Max value [greater than or equal n]: ", "Day of birth [1-31]: ", "Month of birth [1-12]: "};
    public static String HAPPY_RESULT = "Your happy numbers are: ";
    
    
    public static String[] getQuestions() {
        return questions;
    }

    private TextUtil() {
    }

}
