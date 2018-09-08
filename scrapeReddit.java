import java.io.IOException;
import java.net.URL;									// using .net.URL library
import java.util.Scanner;								


public class scrapeReddit {
	public static void main(String[] args) throws IOException {
		String line;
		//String[][] stateBirdList = new String[50][2];	// used to store state and statebird
		
		String address = "http://nugs.net/search/my%20morning%20jacket";
		
		URL pageLocation = new URL(address); 					// creating URL object
		Scanner input = new Scanner(pageLocation.openStream()); // scanning html
		int j;
		int i = 0;
		while(input.hasNext()) {
			line = input.nextLine();							// get next line
		
			System.out.println(line);
			
			
			/*							
			if(line.contains("strong")) {						// only look at lines containing "strong"
				int from = line.indexOf(">");					// string manipulation 
				int to = line.indexOf("</");
				
				if(line.substring(from,to).contains("state bird:")){ // more string manipulation
					
					int fromtwo = line.substring(from, to).indexOf("."); // used to find index of states
					
					int toTwo = line.substring(from, to).lastIndexOf("."); // used to find index of states
					
					int fromThree = line.substring(from, to).indexOf(":");	// used to find index of birds
					j = 0;
					stateBirdList[i][j] = line.substring(fromtwo + 4, toTwo + 2); // storing state in array 
					++j;
					stateBirdList[i][j] = line.substring(fromThree + 4, to);	  // storing bird in array next to state
					++i;
				}
			}
			*/
		
		}
		
		
		/*	// testing to make sure all data was stored properly in array
		for(int l = 0; l < 50; ++l){
			for(int k = 0; k < 2; ++k){
				System.out.print(stateBirdList[l][k] + " ");
			}
			System.out.println();
		}
		*/  // test successful
				
	input.close();																// closing scanner object
	}
}
