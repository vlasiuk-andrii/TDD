import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int summ(String s) {
        int summValue = 0;
        if (s.equals(""))
            return summValue;
        else {
            return getSummValue(s, summValue);
        }
    }

    private int getSummValue(String s, int summValue) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            summValue += Integer.parseInt(m.group());
        }
        return summValue;
    }
}
