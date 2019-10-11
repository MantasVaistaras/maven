package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words) {
		String[] separateWords = StringUtils.split(words, " ");
		return (words == null) ? 0 : separateWords.length;
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println("Testuojam");
    	System.out.println ("Starting Application");
    	Application app = new Application();
    	int count = app.countWords("Du zodziai");
    	System.out.println("Zodziu skaicius: " + count);
	
	
    }
}