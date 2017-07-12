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
public class absPath {
    private String dirInput;
    private String regex;
    private ArrayList<String> mylist = new ArrayList<String>();

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

    boolean checkRegex(String s,String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);
        return m.matches();
    }
    public static void main(String args[]){
        absPath obj = new absPath();
        obj.dirInput = "/home";
        obj.regex = ".*.java";
        obj.getList(obj.dirInput);
        //File file = new File(obj.dirInput);
        for (String s : obj.mylist){
            System.out.println(s);
        }


    }


}
