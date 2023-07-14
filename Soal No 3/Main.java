import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.tambahBarang(new Barang("Politron",0045,1800000,5));
        inventory.tambahBarang(new Barang("Samsung LED ",0030, 2000000,10));
        inventory.tambahBarang(new Barang("Google Tv",0035, 2500000,8));
        inventory.tambahBarang(new Barang("LG Smart 4k",0040, 1600000,15));
        inventory.tambahBarang(new Barang("Aqua 32inch",0025, 2600000,12));

        System.out.println("Inventory sebelum diurutkan:");
        inventory.tampilkanInventory();

        System.out.println();
        inventory.selectionSort();

        System.out.println("Inventory setelah diurutkan:");
        inventory.tampilkanInventory();

        System.out.println();
        String keyword = "Samsung LED";

        List<Barang> hasilPencarian = inventory.cariBarang(keyword);
        System.out.println("Hasil pencarian barang dengan nama \"" + keyword + "\":");
        if (hasilPencarian.isEmpty()) {
            System.out.println("Tidak ditemukan barang dengan nama \"" + keyword + "\"");
        } else {
            for (Barang barang : hasilPencarian) {
                System.out.println(barang);
            }
        }
        System.out.println("\nDaftar barang dengan quantity lebih dari 5:");
        inventory.tampilkanBarangByQuantity(5);

        int quantity = 10;
        List<Barang> hasilPencarianByQuantity = inventory.cariBarangByQuantity(quantity);
        System.out.println("\nHasil pencarian barang dengan quantity " + quantity + ":");
        if (hasilPencarianByQuantity.isEmpty()) {
            System.out.println("Tidak ditemukan barang dengan quantity " + quantity);
        } else {
            for (Barang barang : hasilPencarianByQuantity) {
                System.out.println(barang);
            }
        }
    }
}
