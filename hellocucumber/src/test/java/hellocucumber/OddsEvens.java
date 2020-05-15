package hellocucumber;

public class OddsEvens {


public static String oddOrEven(String str) {

int num;
try {
num = Integer.parseInt(str);
} catch(NumberFormatException e) {
	return "The provided String was not a valid integer.";
}


String result;
if (num % 2 == 0) {
	result = "even";
} else {
	result = "odd";
}

String answer = num + " is an " + result + " number";

return answer;

}




}
