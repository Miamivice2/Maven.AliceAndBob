import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        Scanner scan = new Scanner(System.in);

        while (true){


        System.out.print("whats your name:");
        String name = scan.next();

        if(name.equals("Alice") ||name.equals("Bob")){
            System.out.println("How are you");

            }else{
            System.out.println("You are lying");
            }

            }
    }
}




