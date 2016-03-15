package demo.test.screen;

import org.sikuli.script.Screen;

public class ScreenHolder {
    private static ScreenHolder instance = new ScreenHolder();

    private Screen screen;

    private ScreenHolder() {
        this.screen = new Screen();
    }

    public static ScreenHolder getInstance() {
        return instance;
    }

    public Screen getScreen() {
        return screen;
    }
}
