package exercise;


public class Production {
    private int existingStock;
    private final int unitPrice = 150;

    public Production(int existingStock) {
        this.existingStock = existingStock;
    }

    public void addStock(int newStock) {
        this.existingStock += newStock;
    }

    public int calculateTotalValue() {
        return this.existingStock * unitPrice;
    }

    public void printTotalValue() {
        System.out.println("Total value of stock: " + calculateTotalValue());
    }
}
