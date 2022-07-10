package A05;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable {


    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;

    }

    @Override
    public String browse() {
        String pattern = "^[^0-9]+$";
        Pattern pattern1 = Pattern.compile(pattern);
        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            Matcher matcher = pattern1.matcher(url);
            if(matcher.find()){
                sb.append("Browsing: " +url +"!").append(System.lineSeparator());
            } else {
                sb.append("Invalid URL!").append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

        String pattern = "^[0-9]+$";
        Pattern pattern1 = Pattern.compile(pattern);

        for (String number : numbers) {
            Matcher matcher = pattern1.matcher(number);
            if (matcher.find()) {
                sb.append("Calling... " +number).append(System.lineSeparator());
            } else {

                sb.append("Invalid number!").append(System.lineSeparator());
            }


        }
        return sb.toString().trim();
    }
}
