import java.util.Random;
public class Main {
    public static void main(String[] args) {
        DaysOfTheWeek week= DaysOfTheWeek.FRIDAY;
        System.out.println(week);

//        for (int i=0; i<10; i++){
//            DaysOfTheWeek days =ramdomDayOfTheWeek();
//            System.out.printf("The name is %s the ordinal position is %d %n",days.name(),days.ordinal());
//            if(days==DaysOfTheWeek.FRIDAY){
//                System.out.printf("Today is %s %n", days.name());
//            }
//        }
        SwitchDayOfTheWeek(week);
    }
    public static DaysOfTheWeek ramdomDayOfTheWeek(){
        int number= new Random().nextInt(7);
        var allDays=DaysOfTheWeek.values();
        return  allDays[number];
    }
    public static void SwitchDayOfTheWeek(DaysOfTheWeek day){
        int numberDay=day.ordinal()+1;

        System.out.println("VALOR "+day.name());

        switch (day){
            case SUNDAY:
                System.out.printf("Today is Sunday %d ",numberDay);
                break;
            case MONDAY:
                System.out.printf("Today is Monday %d ",numberDay);
                break;
            case TUESDAY:
                System.out.printf("Today is TUESDAY %d ",numberDay);
                break;
            case WEDNESDAY:
                System.out.printf("Today is WEDNESDAY %d ",numberDay);
                break;
//            case THURSDAY:
//                System.out.printf("Today is Sunday %d ",numberDay);
//                break;
//            case FRIDAY:
//                System.out.printf("Today is Sunday %d ",numberDay);
//                break;
//            case SATURDAY:
//                System.out.printf("Today is Sunday %d ",numberDay);
//                break;
            default:
                //System.out.println("VALOR "+day.name().charAt(0));
                System.out.println(day.name().charAt(0)+day.name().substring(1).toLowerCase()+" Today is Day "+numberDay);

        }
    }
}