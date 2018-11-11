package Random;

public class FirstOne {


    enum Days
    {
        Sun, Mon, Tue, Wed,
        Thu, Fri, Sat;
    }


    public static void main(String[] args) {

       Days day = Days.Sun;

       System.out.println(solution("Sat",23));
       System.out.println(solution("Fri",2));
       System.out.println(solution("Wed",2));
       System.out.println(solution("Wed",7));
       System.out.println(solution("Wed",8));
    }


    public static int daysToInt(Days day) {

        if (day == Days.Sun) {
            return 0;
        }

        else if (day == Days.Mon) {
            return 1;
        }

        else if (day == Days.Tue) {
            return 2;
        }

        else if (day == Days.Wed) {
            return 3;
        }

        else if (day == Days.Thu) {
            return 4;
        }

        else if (day == Days.Fri) {
            return 5;
        }

        else
            return 6;
    }


    public static Days intToDays(int position) {

        if(position==0){
            return Days.Sun;
        }

        else if(position==1){
            return Days.Mon;
        }

        else if(position==2){
            return Days.Tue;
        }

        else if(position==3){
            return Days.Wed;
        }

        else if(position==4){
            return Days.Thu;
        }

        else if(position==5){
            return Days.Fri;
        }

        else
            return Days.Sat;
    }


    public static String solution(String S, int K) {

        String daysAfter = "";

        if(K<0 || K>500 || S == null || S.isEmpty()){
            return daysAfter;
        }

        Days day = Days.valueOf(S);

        return String.valueOf(intToDays(((daysToInt(day)+(K%7))%7)));
    }


}
