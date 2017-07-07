import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Prannoy Sarkar on 7/7/17.
 */
public class charCounter {
    public static void main(String args[]) throws FileNotFoundException, IOException{//throwing FileNotFoundException, IOException exceptions

        BufferedReader TextFile = new BufferedReader(new FileReader("TextFile.txt"));//creating a bufferreader object to get character streams
        int c;
        Map<Character,Integer> dictionary = new HashMap<Character,Integer>();//create a Map to store character and its count
        while ((c=TextFile.read())!=-1){
            char ch = (char) c;
            dictionary.put(ch, dictionary.getOrDefault(ch,0) + 1); //Returns the value to which the specified key is mapped,
                                                                        // or defaultValue if this map contains no mapping for the key.
        }

        File outputFile = new File("output.txt"); // make a new file to print the output
        PrintWriter pw = new PrintWriter(outputFile);//Create a PrintWriter object on outputFile
        for (Map.Entry m : dictionary.entrySet()){ // looping into elements of dictionary

            pw.print(m.getKey()+"--"+m.getValue()+"\n"); // Print key-value set
        }
        pw.close();                                     //Close the PrintWriter object

    }
}
