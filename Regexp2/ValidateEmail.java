import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cherif on 17/10/2015.
 */
public class ValidateEmail {
    @SuppressWarnings("unchecked")
	public static void main(String[] args){
        @SuppressWarnings("rawtypes")
		List<String> emails = new ArrayList();
        emails.add("dupontjean@univ-rennes1.fr");
        emails.add("user1@gmail.com");

//Invalid emails
        emails.add("@yahoo.com");

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
