import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DSLIDM  {

	public static void main(String[] args) {
		
		String s = null;

		String[] anArray = new String[9];
        anArray[0] = "find";
        anArray[1] = ".";
        anArray[2] = "-name";
        anArray[3] = "*.java";
        anArray[4] = "-exec";
        anArray[5] = "ls";
        anArray[6] = "{}";
        anArray[7] = "\\";
        anArray[8] = ";";

        try {

            ProcessBuilder processBuilder = new ProcessBuilder(anArray);
            Process p = processBuilder.start();
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(p.getInputStream()));
 
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            System.exit(0);
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
	}
}