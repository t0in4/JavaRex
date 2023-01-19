package subpatternmatches;
import java.util.regex.*;
public class Subpattern {



        public static void main(String[] args) {
            String patternstr = "([a-z]+)(\\d+)";
            String samplestr = "Ab c55 24 Hello3 a.2 8a bbb00";

            Pattern pattern = Pattern.compile(patternstr);
            Matcher matcher = pattern.matcher(samplestr);

            System.out.println("pattern: " + pattern);
            System.out.println("sample:  " + samplestr);
            System.out.println();

            System.out.println("subpatterns in matches: ");
            while (matcher.find()) {
                System.out.println(matcher.group()
                        + "\tfirst: " + matcher.group(1) + ", second:" + matcher.group(2));
            }
        }

}
