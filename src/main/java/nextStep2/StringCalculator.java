package nextStep2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    int add(String text){
        if(text.length()<2){
            return Integer.parseInt(text);
        }else{
            int sum=0;
            Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
            if(m.find()){
                String customDelimiter = m.group(1);

                String[] num = m.group(2).split(customDelimiter);

                for(String i : num){
                    sum += Integer.parseInt(i);
                }
            }else{
                String[] num = text.split(",|:");
                for(String i : num){
                    sum += Integer.parseInt(i);
                }
            }
            return sum;
        }
    }
}
