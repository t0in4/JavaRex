package substringmatch;

import java.util.regex.*;

public class SubstringMatch {
    public static void main(String[] args) {
        String patternstr = "[a-z]+\\d+";
        String samplestr = "words  words132  1way  r2d2   John133 ";

        Pattern pattern = Pattern.compile(patternstr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(samplestr);

        System.out.println("pattern: " + pattern);
        System.out.println("sample:  " + samplestr);

        System.out.println("sample string matches pattern? " + matcher.find());

        matcher.reset();  // перезапустить чтобы начать поиск совпадений снова

        System.out.println("all matches:");
        while (matcher.find()) {
            System.out.println("\t"
                    + matcher.group()
                    + "   start-end: " + matcher.start() + "-" + matcher.end());
        }
    }
}
