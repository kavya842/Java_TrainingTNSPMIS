// import java.time.LocalDate;

// public class DateTime {
//     public static void main(String[] args) {

        // Get the current date
//         LocalDate now = LocalDate.now();

//         System.out.println("Today's date is: " + now);
//         System.out.println("year:"+now.getYear());
//         System.out.println("Month:"+now.getMonth());
//         System.out.println("Day:"+now.getDayOfMonth());
//     }
// }

//!----------------------------------------------------------
import java.time.LocalDate;
public class DateTime{
    public static void main(String[] args){
        LocalDate now=LocalDate.now();
        LocalDate yesterday=now.minusDays(1);
        LocalDate Tomorrow=now.plusDays(1);
        System.out.println("yesterday date:"+yesterday);
        System.out.println("today date:"+now);
        System.out.println("Tomorrow date:"+Tomorrow);
    }
}
