public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteContainer organicContainer = new WasteContainer("organic", 50);
        WasteContainer recyclableContainer = new WasteContainer("recyclable", 30);
        WasteContainer hazardousContainer = new WasteContainer("hazardous", 20);

        organicContainer.addWaste(50); // Full
        recyclableContainer.addWaste(20); // Not full
        hazardousContainer.addWaste(20); // Full

        WasteCollectionChain wasteCollectionChain = new WasteCollectionChain();

        wasteCollectionChain.collectWaste(organicContainer);
        wasteCollectionChain.collectWaste(recyclableContainer);
        wasteCollectionChain.collectWaste(hazardousContainer);
    }
}