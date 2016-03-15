package demo.test;

import demo.test.menus.MainMenu;
import demo.test.model.PngEnum;
import webdriver.BaseTest;
import demo.test.forms.*;

public class DemoTest extends BaseTest {

	public void runTest() {

		MainMenu mainMenu = new MainMenu();

		logStep(1,"Go to website");
		RoomstylerPage rp = new RoomstylerPage();

		logStep(2,"Close dialog window");
		rp.closeDialogWindow();
		rp.assertDialogWindowIsClose();

		logStep(3,"Open menu 'Furnish your room'");
		mainMenu.navigateTo(PngEnum.ptrFurnishYourRoom, PngEnum.ptrListElements);

		logStep(4,"Go to 'Dining room'");
		mainMenu.navigateTo(PngEnum.ptrDiningRoom,PngEnum.ptrDiningRoomMenu);

		logStep(5,"Choose item and drag in workspace");
		rp.dragAndDrop(PngEnum.ptrElement, PngEnum.ptrWorkspace);
		String informationDragItem = rp.getInformationDragItem();

		rp.assertDragItemInWorkspace();

		logStep(6,"Check item in workspace");
		rp.assertItemInWorkspaceCorrectly(PngEnum.ptrElementInWorkspace);

		logStep(7,"Check information");
		rp.assertInformation(informationDragItem);

		logStep(8,"Delete element");
		rp.deleteElement(PngEnum.ptrDeleteElement);
		rp.assertInfoAfterDeleteElement();
	}
}
