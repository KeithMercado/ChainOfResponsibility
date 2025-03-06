public class WasteCollectionChain {
    private WasteCollector chain;

    public WasteCollectionChain() {
        this.chain = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        chain.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);
    }

    public void collectWaste(WasteContainer container) {
        if (container.isFull()) {
            chain.collectWaste(container);
        } else {
            System.out.println("The waste container is not full yet.");
        }
    }
}