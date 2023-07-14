class Barang {
    private String nama;
    private int id;
    private int harga;
    private int quantity;

    public Barang(String nama,int id, int harga, int quantity) {
        this.nama = nama;
        this.id = id;
        this.harga = harga;
        this.quantity = quantity;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Nama: " + nama +", Id: " + id + ", Harga: " + harga + ", Quantity: " + quantity;
    }
}