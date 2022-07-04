import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        /*Scanner inp = new Scanner(System.in);
        String exp = inp.nextLine();
        System.out.println(exp instanceof String);
        System.out.println(exp);
        System.out.println(exp.equals("333"));
        String ex = "1";*/
        /*String[]arr_template = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String arr_check = "V";
        int arab = 0;
        for (int i = 0; i < arr_template.length; i++){
            if (arr_check.equals(arr_template[i])) {
                arab = i + 1;
                break;
            } else continue;
        }
        System.out.println(arab);*/
        String[]arr_rome = {"C","XC","L","XL","X","IX","V","IV","I"};
        int[]arr_arab = {100,90,50,40,10,9,5,4,1};
        int t = 100;
        String rome_digit = "";
        do {
            for (int i = 0; i < arr_arab.length; i++){
                if(t >= arr_arab[i]) {
                    t = t - arr_arab[i];
                    rome_digit = rome_digit + arr_rome[i];
                    break;
                }
            }
        } while (t > 0);
        System.out.println(rome_digit);
    }
}