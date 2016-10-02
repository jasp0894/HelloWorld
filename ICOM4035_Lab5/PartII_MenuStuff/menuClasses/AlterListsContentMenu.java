package menuClasses;

import java.util.ArrayList;

public class AlterListsContentMenu extends Menu {
	private static AlterListsContentMenu OLM = new AlterListsContentMenu(); 
	private AlterListsContentMenu() { //singleton
		super(); 
		String title; 
		ArrayList<Option> options = new ArrayList<Option>();  
		title = "Alter Lists Menu";  
		options.add(new Option("Add a New Value to a List", new AddToListAction())); 
		options.add(new Option("Delete Position from a List", new DeleteFromListAction())); 
		options.add(new Option("Show Content of a List", new ShowListAction())); 
		options.add(Option.EXIT); 

		super.InitializeMenu(title, options); 

	}
	
	public static AlterListsContentMenu getAlterListsContentMenu() { 
		return OLM; 
	}
}