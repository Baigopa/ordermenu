import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double hitungTotal() {
            double total = 0;
            for (MenuItem item : items) {
                total += item.hitungSubtotal();
            }
            return total;
        }


    public void tampilkanNota() {
        System.out.println("Nota Pemesanan:");
        for (MenuItem item : items) {
            System.out.printf("%s x%d : Rp %.2f\n", item.getNama(), item.getJumlah(), item.hitungSubtotal());
        }
        System.out.printf("Total: Rp %.2f\n", hitungTotal());
    }
}
