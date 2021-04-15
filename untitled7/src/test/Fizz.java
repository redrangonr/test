package test;

public class Fizz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String RESULT = "";


    public static String run(int number) {
        String result = RESULT;
        boolean chihetcho3 = number % 3 == 0;
        if (chihetcho3) {
            result = FIZZ;
        }
        boolean chiahetcho5 = number % 5 == 0;
        if (chiahetcho5) {
            result = BUZZ;
        }
        if(chihetcho3 && chiahetcho5){
            result = FIZZ_BUZZ;
        }
        if(result.equals("")){
            result = ""+number;
        }
        return result;
    }
}