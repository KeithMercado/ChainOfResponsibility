public class HazardousWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equals("hazardous")) {
            System.out.println("Collecting hazardous waste.");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}