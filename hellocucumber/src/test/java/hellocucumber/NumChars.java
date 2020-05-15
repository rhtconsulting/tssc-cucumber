package hellocucumber;

public class NumChars {

public static String numChars(String str) {

if ( str.length() == 0 ) {
return "An empty string was provided.";
}


int length = str.length();

return  Integer.toString(length);

}


}
