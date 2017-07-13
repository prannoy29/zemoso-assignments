import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Prannoy Sarkar
 */
public class AbsPath {
    private String dirInput;
    private String regex;
    private ArrayList<String> mylist = new ArrayList<String>();

    /**
     *
     * @param dirInput String parameter containing Directory path
     *
     *                 This method prints all the absolute path to files or directory that matches with regex
     */

    void getList(String dirInput){
        File file = new File(dirInput);
        String[] listTocheck = file.list();
        if(file.isDirectory()) {
            for (String s : listTocheck) {
                //System.out.println(s);
                if (checkRegex(s, regex)) {
                    //System.out.println("its working fine");
                    File f = new File(dirInput,s);

                    mylist.add(f.getAbsolutePath());
                }
                getList(dirInput+"/"+s);
            }
        }
    }

    /**
     *
     * @param s takes a file/directory path String as an input
     * @param regex takes a REGEX String pattern as an input
     * @return  returns boolean value whether the String and Regex matches
     *
     * The method takes two String, one path of the file/Directory, another the REGEX Pattern
     */
    boolean checkRegex(String s,String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);
        return m.matches();
    }
    public static void main(String args[]){
        AbsPath obj = new AbsPath();
        obj.dirInput = "/home";
        obj.regex = ".*.java";
        obj.getList(obj.dirInput);
        //File file = new File(obj.dirInput);
        for (String s : obj.mylist){
            System.out.println(s);
        }


    }


}
