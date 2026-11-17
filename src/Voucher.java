// Mengurangi total belanja dengan nilai voucher.
return totalBelanja - nilai;
public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher " + Buku.formatRupiah(nilai);
    }

    @Override
    public int totalBayar(int totalBelanja) {

        // Pembayaran tidak boleh menghasilkan nilai negatif.
        return Math.max(0, totalBelanja - nilai);
    }
}
