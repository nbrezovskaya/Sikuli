package webdriver.elements;

import org.openqa.selenium.By;

public class Label extends BaseElement {

	/**
	 * Constructor
	 * @param locator locator
	 * @param name name
	 */
	public Label(final By locator, final String name) {
		super(locator, name);
	}

	/**
	 * Constructor
	 * @param string locator
	 * @param name name
	 */
	public Label(String string, String name) {
		super(string, name);
	}

	/**
	 * Constructor
	 * @param locator locator
	 */
	public Label(By locator) {
		super(locator);
	}

	/**
	 * Returns Element type
	 * @return Element type
	 */
	protected String getElementType() {
		return getLoc("loc.label");
	}

}
