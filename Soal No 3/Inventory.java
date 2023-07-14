import java.util.ArrayList;
import java.util.List;

class Inventory {
    private List<Barang> daftarBarang;

    public Inventory() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanInventory() {
        System.out.println("Daftar Barang di Inventory:");
        for (Barang barang : daftarBarang) {
            System.out.println(barang);
        }
    }

    public void selectionSort() {
        int n = daftarBarang.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (daftarBarang.get(j).getNama().compareTo(daftarBarang.get(minIndex).getNama()) < 0) {
                    minIndex = j;
                }
            }

            Barang temp = daftarBarang.get(minIndex);
            daftarBarang.set(minIndex, daftarBarang.get(i));
            daftarBarang.set(i, temp);
        }
    }

    public List<Barang> cariBarang(String keyword) {
        List<Barang> hasilPencarian = new ArrayList<>();

        for (Barang barang : daftarBarang) {
            if (barang.getNama().equalsIgnoreCase(keyword)) {
                hasilPencarian.add(barang);
            }
        }

        return hasilPencarian;
    }

    public void tampilkanBarangByQuantity(int quantity) {
        System.out.println("Daftar Barang dengan Quantity Lebih dari " + quantity + ":");
        for (Barang barang : daftarBarang) {
            if (barang.getQuantity() > quantity) {
                System.out.println(barang);
            }
        }
    }

    public List<Barang> cariBarangByQuantity(int quantity) {
        List<Barang> hasilPencarian = new ArrayList<>();

        for (Barang barang : daftarBarang) {
            if (barang.getQuantity() == quantity) {
                hasilPencarian.add(barang);
            }
        }

        return hasilPencarian;
    }
}