package demo.test.menus;

import demo.test.model.PngEnum;
import demo.test.screen.ScreenHolder;
import org.junit.Assert;
import org.sikuli.script.FindFailed;

import webdriver.BaseEntity;


public class MainMenu extends BaseEntity{

    /**
     * Menu navigation tabs
     * Check the correct opening tabs
     * @param menu menu
     * @param check check
     */
    public void navigateTo(PngEnum menu, PngEnum check) {
        try {
            ScreenHolder.getInstance().getScreen().click(menu.getPattern());
            Assert.assertNotNull(ScreenHolder.getInstance().getScreen().exists(check.getPattern()));
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    /**
     * For logs
     * @param message Message
     * @return null
     */
    @Override
    protected String formatLogMsg(String message) {
        return null;
    }
}
