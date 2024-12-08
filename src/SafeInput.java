
/*
* @param pipe is a scanner opened to read from System.in
* @param prompt is a prompt for the user
* @return is a string response that is not zero length
 */

import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; //zero length string. loop runs until it isnt
        do {
            System.out.print(prompt + ": "); //show the prompt
            retString = pipe.nextLine();
        } while (retString.isEmpty());
        return retString;
    }
}