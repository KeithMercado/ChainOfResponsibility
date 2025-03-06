public class RecyclableWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equals("recyclable")) {
            System.out.println("Collecting recyclable waste.");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}