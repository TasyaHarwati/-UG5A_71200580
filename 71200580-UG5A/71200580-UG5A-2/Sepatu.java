public class Sepatu {
    private string kode;
    private string MerkModel;
    private int ukuran;
    private long harga;
    private int stok;
    private static int nextNum;

    public static void setNextNum(int nextNum) {
        nextNum = newnextNum;
    }
    public static int getNextNum() {
        return nextNum;
    }

    public string getKode() {
        return kode;
    }

    public string getMerkModel() {
        return MerkModel;
    }

    public int getUkuran() {
        return ukuran;
    }

    public int getStok() {
        return stok;
    }

    public long getHarga() {
        return harga;
    }
}
