
public class WeatherCheck {
  public static boolean isSummer = true;
  public static int  temperature;
  public static boolean weatherResults;
  public static boolean weatherOutput(int temperature, boolean isSummer) {
	  if(isSummer) {
		  if(temperature> 60 && temperature <= 90) {
			  weatherResults = true;
		  } else {
			  weatherResults = false;
		  }
			
		  }
	  else {
		  if(temperature> 60 && temperature <= 100 ) {
			  weatherResults = true;
		  } else {
			  weatherResults = true;
		  }	  
	  } 

	  return weatherResults;
  }
  
}
