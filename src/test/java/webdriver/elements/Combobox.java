package webdriver.elements;

import org.openqa.selenium.By;


public class Combobox extends BaseElement {

    /**
     * Constructor
     * @param loc locator
     */
    protected Combobox(By loc) {
        super(loc);
    }

    /**
     * Constructor
     * @param loc locator
     * @param nameOf  name
     */
    public Combobox(By loc, String nameOf) {
        super(loc, nameOf);
    }

    /**
     * Constructor
     * @param stringLocator locator
     * @param nameOfElement name
     */
    protected Combobox(String stringLocator, String nameOfElement) {
        super(stringLocator, nameOfElement);
    }

    /**
     * Returns Element type
     * @return Element type
     */
    protected String getElementType() {
        return getLoc("loc.dropDownList");
    }
}
