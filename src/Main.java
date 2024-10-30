public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Menambahkan item ke dalam pesanan
        order.addItem(new MenuItem("Nasi Goreng", 25000, 2));
        order.addItem(new MenuItem("Es Teh", 5000, 2));
        order.addItem(new MenuItem("Ayam Bakar", 30000, 1));

        // Menampilkan nota
        order.tampilkanNota();
    }
}