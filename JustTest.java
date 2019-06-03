import java.util.regex.Pattern;

public class JustTest {

    public static void main(String[] args){

        String date = "2019/12/01";
        String time = "20:14:00";
        System.out.println(matchDate(date));
        System.out.println(matchTime(time));


    }

    public static boolean matchDate(String date){
        Pattern DATE_PATTERN = Pattern.compile(
                "^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))/02/29) $"
                        + "|^(((19|2[0-9])[0-9]{2})/02/(0[1-9]|1[0-9]|2[0-8]))$"
                        + "|^(((19|2[0-9])[0-9]{2})/(0[13578]|10|12)/(0[1-9]|[12][0-9]|3[01]))$"
                        + "|^(((19|2[0-9])[0-9]{2})/(0[469]|11)/(0[1-9]|[12][0-9]|30))$");

        return DATE_PATTERN.matcher(date).matches();
    }

    public static boolean matchTime(String time){
        Pattern timePattern = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
        return timePattern.matcher(time).matches();
    }
    
}
