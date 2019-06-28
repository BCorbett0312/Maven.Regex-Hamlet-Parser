import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;
    private String horatioData;
    private String hamletReplace;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }




    public String getHamletData(){
        return hamletData;
    }

    public String changeHamlet(String changeTo){
        String result = hamletData.replaceAll("(?i)Hamlet", changeTo);
        return result;

    }

    public String changeHoratio(String changeTo){
        String result = hamletData.replaceAll("(?i)Horatio", changeTo);
        return result;

    }

    public Integer findHamlet(String toCheck){
        Pattern patternToMatch = Pattern.compile("(?i)Hamlet");
        Matcher matcher = patternToMatch.matcher(toCheck);
        Integer counter = 0;
        while(matcher.find()){
            counter++;


        }
        return counter;

    }

    public Integer findHoratio(String toCheck){
        Pattern horatioMatcher = Pattern.compile("(?i)Horatio");
        Matcher matcher = horatioMatcher.matcher(toCheck);
        Integer counter = 0;
        while(matcher.find()){
            counter++;

        }
        return counter++;

    }

}
