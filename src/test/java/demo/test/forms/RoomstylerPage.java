package demo.test.forms;

import demo.test.model.PngEnum;
import demo.test.screen.ScreenHolder;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;
import webdriver.BaseForm;
import webdriver.elements.Label;

/**
 * Class Roomstyler page
 */
public class RoomstylerPage extends BaseForm {
    private Label lbInformationDragItem = new Label(By.xpath("//div[@class='popup-info']//h3"), "Information on drag item");
    private Label lbProductInformation = new Label(By.xpath("//*[@class='name' and contains(text(), ' ')]"), "Product information");

    public RoomstylerPage() {
        super(By.xpath("//*[@class='content']"), "Welcome to roomstyler 3D home planner");
    }

    /**
     * Close dialog window.
     */
    public void closeDialogWindow() {
        try {
            ScreenHolder.getInstance().getScreen().click(PngEnum.ptrCloseDialogWindow.getPattern());
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    /**
     * Check that window dialog closed.
     */
    public void assertDialogWindowIsClose() {
        try {
            ScreenHolder.getInstance().getScreen().wait(PngEnum.ptrFurnishYourRoom.getPattern());
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Assert.assertNull(ScreenHolder.getInstance().getScreen().exists(PngEnum.ptrDialogWindow.getPattern()));
    }

    /**
     * Drag the selected item to workspace.
     * @param dragItem
     * @param dropItem
     */
    public void dragAndDrop(PngEnum dragItem, PngEnum dropItem) {
        try {
            ScreenHolder.getInstance().getScreen().dragDrop(dragItem.getPattern(), dropItem.getPattern());
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    /**
     * Check that drag item in workspace.
     */
    public void assertDragItemInWorkspace() {
        Assert.assertNotNull(ScreenHolder.getInstance().getScreen().exists(PngEnum.ptrDragItem.getPattern()));
    }

    /**
     * Check that the item is correctly displayed in workspace.
     * @param itemInWorkspace
     */
    public void assertItemInWorkspaceCorrectly(PngEnum itemInWorkspace) {
        Assert.assertNotNull(ScreenHolder.getInstance().getScreen().exists(itemInWorkspace.getPattern()));
    }

    /**
     * Check that the same information about item.
     * @param informationDragItem
     */
    public void assertInformation(String informationDragItem) {
        try {
            ScreenHolder.getInstance().getScreen().click(PngEnum.ptrElementInWorkspace.getPattern());
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        assertEquals(informationDragItem, lbProductInformation.getText());
    }

    /**
     * Delete element.
     * @param deleteElement
     */
    public void deleteElement(PngEnum deleteElement) {
        try {
            ScreenHolder.getInstance().getScreen().click(deleteElement.getPattern());
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    /**
     * Check that after delete element information is correct.
     */
    public void assertInfoAfterDeleteElement() {
        Assert.assertNotNull(ScreenHolder.getInstance().getScreen().exists(PngEnum.ptrSceneInformation.getPattern()));
    }

    /**
     * Receives information on the dragged item.
     *@return information on the dragged item
     */
    public String getInformationDragItem() {
        return lbInformationDragItem.getText();
    }
}


