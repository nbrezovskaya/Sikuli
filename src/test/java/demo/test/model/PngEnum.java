package demo.test.model;

import org.sikuli.script.Pattern;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public enum PngEnum {
    ptrDialogWindow,
    ptrCloseDialogWindow,
    ptrFurnishYourRoom,
    ptrDiningRoom,
    ptrElementInWorkspace,
    ptrDragItem,
    ptrDeleteElement,
    ptrWorkspace,
    ptrWorkspace2,
    ptrElement,
    ptrListElements,
    ptrDiningRoomMenu,
    ptrSceneInformation,
    ptrInformationDragAndDropItem;

    private static final Map<PngEnum, Pattern> PATTERN_MAPPING;

    static {
        PATTERN_MAPPING = new HashMap<>();
        PATTERN_MAPPING.put(ptrDialogWindow, new Pattern(getPath("img/dialogWindow.png")));
        PATTERN_MAPPING.put(ptrCloseDialogWindow, new Pattern(getPath("img/close.png")));
        PATTERN_MAPPING.put(ptrFurnishYourRoom, new Pattern(getPath("img/furnishYourRoom.png")));
        PATTERN_MAPPING.put(ptrDiningRoom, new Pattern(getPath("img/diningRoom.png")));
        PATTERN_MAPPING.put(ptrElementInWorkspace, new Pattern(getPath("img/elementInWorkspace.png")));
        PATTERN_MAPPING.put(ptrDragItem, new Pattern(getPath("img/element2.png")));
        PATTERN_MAPPING.put(ptrDeleteElement, new Pattern(getPath("img/delete.png")));
        PATTERN_MAPPING.put(ptrWorkspace, new Pattern(getPath("img/workspace.png")));
        PATTERN_MAPPING.put(ptrWorkspace2, new Pattern(getPath("img/workspace2.png")));
        PATTERN_MAPPING.put(ptrElement, new Pattern(getPath("img/element.png")));
        PATTERN_MAPPING.put(ptrListElements, new Pattern(getPath("img/list.png")));
        PATTERN_MAPPING.put(ptrDiningRoomMenu, new Pattern(getPath("img/diningRoomMenu.png")));
        PATTERN_MAPPING.put(ptrSceneInformation, new Pattern(getPath("img/sceneInformation.png")));
        PATTERN_MAPPING.put(ptrInformationDragAndDropItem, new Pattern(getPath("img/informationDragAndDropItem.png")));
    }

    private static String getPath(String relativePath) {
        URL resource = PngEnum.class.getClassLoader().getResource(relativePath);
        return resource != null ? resource.getPath() : null;
    }

    public Pattern getPattern() {
        return PATTERN_MAPPING.get(this);
    }
}
