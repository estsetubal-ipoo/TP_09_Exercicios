package parte3;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        if(qty < 0) throw new IllegalArgumentException("Qty cannot be < 0.");
        if(unitPrice < 0) throw new IllegalArgumentException("Unit price cannot be < 0.");

        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        if(qty < 0) throw new IllegalArgumentException("Qty cannot be < 0.");

        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice < 0) throw new IllegalArgumentException("Unit price cannot be < 0.");

        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return qty * unitPrice;
    }

    public String toString() {
        return String.format("InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice=%f]",
                id, desc, qty, unitPrice);
    }
}
