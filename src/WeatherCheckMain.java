import java.util.Scanner;
public class WeatherCheckMain {
  public static void main(String[] args) {
	  Scanner user_input = new Scanner(System.in);
	  System.out.println("Enter the temperature");
	  int inputTemperature = user_input.nextInt();
	  System.out.println("Enter true or false if it's summer or not");
	  boolean inputSummerCheck = user_input.nextBoolean();
	  boolean finalSummerResult = WeatherCheck.weatherOutput(inputTemperature, inputSummerCheck);
	  System.out.println("The boolean value if it is within the required range is: " + finalSummerResult);
  }
}
