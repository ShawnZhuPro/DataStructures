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
				
		
		try {
			Scanner scanner = new Scanner(new File("covid417.csv"));
			
			while(scanner.hasNext()) {
//				System.out.println(scanner.next());
			}
			
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		HashMap states = new HashMap<String, ArrayList<String>>();
//		HashMap map = new HashMap<String, states>();
		
		HashMap states = new HashMap<String, ArrayList<String>>();
		HashMap map = new HashMap<String, HashMap<String, ArrayList<String>>>();


		
		try {
			Scanner scanner = new Scanner(new File("covid417.csv"));
			
			while(scanner.hasNextLine()) {
				String[] row = scanner.nextLine().split(",");
				String cityName = row[0];
				String stateName = row[1];
				ArrayList<String> list = new ArrayList<String>();
				list.add(row[2]);  // confirmed
				list.add(row[3]);  // deaths
				list.add(row[4]);  // recovered
				list.add(row[5]);  // active
				states.put(stateName, list);
				map.put(cityName, states);

			}
//			System.out.println(map.get("Yuma"));
			scanner.close();
			
			
			// User input ---------------------------------------------------
			while(true) {
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please enter a State");
				
				String stateSelected = userInput.nextLine();
				
				System.out.println(stateSelected + " state confirmed total is: " + "total here " +
						". \n Please enter a city:\n");
				
				String citySelected = userInput.nextLine();
				System.out.println("The confirmed number of cases in " + citySelected + ", " +
						stateSelected + " is : ");
				
			}
			// --------------------------------------------------------------
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		// If you want confirmed cases from Abbeville, South Carolina
		int confirmed = 0;
		int deaths = 1;
		int recovered = 2;
		int active = 3;
//		String res = map.get("Abbeville");
//		System.out.println(map.get("Abbeville"));

	}

}
