package demo.test.model;


import org.sikuli.script.Pattern;
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
        PATTERN_MAPPING.put(ptrDialogWindow, new Pattern("src/test/resources/img/dialogWindow.png"));
        PATTERN_MAPPING.put(ptrCloseDialogWindow, new Pattern("src/test/resources/img/close.png"));
        PATTERN_MAPPING.put(ptrFurnishYourRoom, new Pattern("src/test/resources/img/furnishYourRoom.png"));
        PATTERN_MAPPING.put(ptrDiningRoom, new Pattern("src/test/resources/img/diningRoom.png"));
        PATTERN_MAPPING.put(ptrElementInWorkspace, new Pattern("src/test/resources/img/elementInWorkspace.png"));
        PATTERN_MAPPING.put(ptrDragItem, new Pattern("src/test/resources/img/element2.png"));
        PATTERN_MAPPING.put(ptrDeleteElement, new Pattern("src/test/resources/img/delete.png"));
        PATTERN_MAPPING.put(ptrWorkspace, new Pattern("src/test/resources/img/workspace.png"));
        PATTERN_MAPPING.put(ptrWorkspace2, new Pattern("src/test/resources/img/workspace2.png"));
        PATTERN_MAPPING.put(ptrElement, new Pattern("src/test/resources/img/element.png"));
        PATTERN_MAPPING.put(ptrListElements, new Pattern("src/test/resources/img/list.png"));
        PATTERN_MAPPING.put(ptrDiningRoomMenu, new Pattern("src/test/resources/img/diningRoomMenu.png"));
        PATTERN_MAPPING.put(ptrSceneInformation, new Pattern("src/test/resources/img/sceneInformation.png"));
        PATTERN_MAPPING.put(ptrInformationDragAndDropItem, new Pattern("src/test/resources/img/informationDragAndDropItem.png"));
    }

    public Pattern getPattern() {
        return PATTERN_MAPPING.get(this);
    }
}
