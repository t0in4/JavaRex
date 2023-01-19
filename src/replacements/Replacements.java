package replacements;

import java.util.regex.*;

public class Replacements {
    public static void main(String[] args) {
        String patternstr = "([a-z]+)(\\d+)";
        String samplestr  = "Ab c55 24 Hello3 a.2 8a bbb00";

        Pattern pattern = Pattern.compile(patternstr);
        Matcher matcher = pattern.matcher(samplestr);

        System.out.println("pattern: " + pattern);
        System.out.println("sample:  " + samplestr);

        System.out.println("\n--> replaceFirst(\"---\")");
        System.out.println(matcher.replaceFirst("---"));

        System.out.println("\n--> replaceAll(\"===\")");
        System.out.println(matcher.replaceAll("==="));

        System.out.println("\n--> replaceAll(\"<$0>\")");
        System.out.println(matcher.replaceAll("<$0>"));

        System.out.println("\n--> replaceFirst(\"$1:$2\")");
        System.out.println(matcher.replaceAll("$1:$2"));
    }
}
