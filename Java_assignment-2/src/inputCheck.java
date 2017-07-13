import java.util.Arrays;


/**
 * @author Prannoy Sarkar
 */
public class inputCheck {
    /**
     *
     * @param input takes an input string
     * @return returns boolean value after checking input String with a-z(Case-insensitive)
     *
     * The method t checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
     * Returns True if it contains all, else returns False
     *
     */
    public boolean checkLetterAll(String input) {
        int[] myarray = new int[52];
        int c;
        int sum = 0;
        Arrays.fill(myarray, -1);
        char[] chararray = input.toLowerCase().toCharArray();
        for (char ch : chararray) {
            c = (int) ch;
            int a = c - 97;
            if (a < 26 && a > -1 && myarray[a] == -1) {
                myarray[a] = 0;
            }
        }

        int i = 0;
        while (i < 26) {
            sum += myarray[i];
            i++;
        }

        if (sum == 0) return true;
        else return false;
    }
}