public class WasteContainer {
    private String type; // Type of waste 
    private int capacity; // Capacity
    private int currentLevel; // Current waste level

    public WasteContainer(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.currentLevel = 0;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void addWaste(int amount) {
        this.currentLevel += amount;
    }

    public boolean isFull() {
        return currentLevel >= capacity;
    }
}