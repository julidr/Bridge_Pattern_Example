package bridgeMovie;

public class BridgeDemo {
	
	public static void main(String[] args){
		
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTittle("Guardians of the Galaxy Vol. 2");
		movie.setRuntime("136");
		movie.setYear("2017");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		
		String printerMaterial = moviePrinter.print(printFormatter);
		
		System.out.println(printerMaterial);
	}

}
