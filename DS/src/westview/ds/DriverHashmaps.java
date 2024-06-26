package westview.ds;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DriverHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m = new HashMap<String, String>();
		
		// Adding entries to our map ("dictionary")
		m.put("nice", "mean");
		m.put("motivated", "lazy");
		m.put("rich", "poor");
		
		// Query the map for a non-existing key
		System.out.println(m.get("study"));
		
		// Query the map for an existing key
		System.out.println(m.get("motivated"));
		
		System.out.println(m.size());
		
		HashMap m2 = new HashMap<String, ArrayList<String>>();
		
		// List of favorite foods
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pasta");
		food.add("Coffee");
		food.add("Protein");
		food.add("bread");
		
		m2.put("Shawn",  food);
		System.out.println(m2.get("Shawn"));
		
		
		
		// Get the scanner going to read the csv file
		//which should be outside the src folder
		
		// Data for everything with the city name as the key
		HashMap map = new HashMap<String, HashMap<String, ArrayList<String>>>();
		HashMap stateTotals = new HashMap<String, Integer>();

		while(true) {
			
		
			try {
				Scanner scanner = new Scanner(new File("covid417.csv"));
				while(scanner.hasNextLine()) {
					// Data for the current state in the current line
					HashMap states = new HashMap<String, ArrayList<String>>();
	
					// Splits data for CSVs (using commas)
					String[] row = scanner.nextLine().split(",");
					String cityName = row[0].toLowerCase();
					String stateName = row[1].toLowerCase();

					

					
					
					ArrayList<String> list = new ArrayList<String>();
					list.add(row[2]);  // confirmed
	//				list.add(row[3]);  // deaths
	//				list.add(row[4]);  // recovered
	//				list.add(row[5]);  // active
					
					if(row[2].substring(0).equals("Confirmed")) {
						stateTotals.put(stateName, Integer.parseInt(row[2]));
					}
					states.put(stateName, list);
					map.put(cityName, states);
	
				}
				System.out.println(stateTotals);
				scanner.close();
				
				
				// User input ---------------------------------------------------
				while(true) {
					Scanner userInput = new Scanner(System.in);
					System.out.println("Please enter a State");
					
					String stateSelected = userInput.nextLine().trim().toLowerCase();
					int total = 0;
					
	
					
					System.out.println(stateSelected + " state confirmed total is: " + stateTotals.get(stateSelected) +
							". \n Please enter a city:\n");
					
					String citySelected = userInput.nextLine().trim().toLowerCase();
	
					
					System.out.println("The confirmed number of cases in " + citySelected + ", " +
							stateSelected + " is : " + ((HashMap) map.get(citySelected)).get(stateSelected));
					
				}
				// --------------------------------------------------------------
				
			} catch (Exception e) {
//				System.out.println("Please enter a valid city and state name!");


				
				e.printStackTrace();
				
			}
		}


	}

}
