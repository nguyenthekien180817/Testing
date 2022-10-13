import java.util.Scanner;

public class ticketPrice {
    public static String ticketPrice(int age, String Gender) {
        String result = "";
        if(age < 1 || !Gender.equals("nam") && !Gender.equals("nu")) {
            result = "Invalid";
        } else {
            if(Gender.equals("nam") && age < 18) {
                 result = "10000";
            } else if(Gender.equals("nam")  && age < 65) {
                 result = "25000";
            } else if( Gender.equals("nu") && age < 18) {
                 result = "5000";
            } else if(Gender.equals("nu")  && age < 65) {
                 result = "20000";
            } else {
                 result = "15000";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(ticketPrice(age, gender));
    }
}