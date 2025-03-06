public class OrganicWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equals("organic")) {
            System.out.println("Collecting organic waste.");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}