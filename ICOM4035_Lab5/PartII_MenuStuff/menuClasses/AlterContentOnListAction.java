package menuClasses;

import dataManager.DMComponent;

public class AlterContentOnListAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		dm.getMenuStack().push(AlterListsContentMenu.getAlterListsContentMenu()); 
	}

}