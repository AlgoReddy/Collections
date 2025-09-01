package enumExamples;

public class Basic {
    enum Week{
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday
        // need of enums : sometimes for a particular class , it should need only some variables , we don't need to have extra variables or so
        // enums are  special types of constants we can say
        // basic configuaration of enum is always public  , static & final
        // since it's final you cannot inherit it to the child classes
        // type is Week

    }

    public static void main(String[] args) {
        Week week ;
        week=Week.Monday;
        for (Week day: Week.values()){
            System.out.println(day);

        }
        /*  here the week is only storing the monday value in it
            Whenever you want to get the value or access the elements in the enum you have to use the type of enum
            here in this case it's Week instead small letter week
        * */
        System.out.println("here printing the ordinal of the enum ");
        System.out.println(week.ordinal());
        System.out.println(week);
    }
}
