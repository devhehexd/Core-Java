import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.util.Locale;

public class DateTimeDemo {
    public static void main(String[] args) {

        //Date now = new Date();
        //System.out.println(now); //now.toString()
        //Calender cal = new Calender(); 추상 클래스이기 때문에 객체 생성 불가능

        //Calendar cal = Calendar.getInstance();
        //System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n",
                            //cal.get(Calendar.YEAR),
                            //cal.get(Calendar.MONTH) + 1, //Gregorian and Julian calendars에서 1월은 0이기 때문에 1을 더해야함
                            ////cal.get(Calendar.DATE)
                            //cal.get(Calendar.DAY_OF_MONTH));

        //Calendar cal = new GregorianCalendar(2024, 11, 25); 부모가 Calender
        //System.out.printf("금년은 %d년%n", cal.get(Calendar.YEAR));

        //DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, Locale.FRANCE);
        //System.out.println(df.format(new Date()));

        //String pattern = "오늘은 yyyy년 MM월 dd일 입니다.";
        //DateFormat df = new SimpleDateFormat(pattern); //부모가 DateFormat
        //System.out.println(df.format(new Date()));

        //String pattern = String.format("오늘은 %1$tY년 %1$tm월 %1$td일 입니다.", new Date());
        //System.out.println(pattern);
        System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다.", new Date());
    }
}
