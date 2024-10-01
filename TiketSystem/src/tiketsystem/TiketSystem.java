package tiketsystem;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

class Pelanggar {
    private String nama;
    private String alamat;

    public Pelanggar(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

class Pengendara extends Pelanggar {
    private int idPengendara;
    private String sim;

    public Pengendara(String nama, String alamat, int idPengendara, String sim) {
        super(nama, alamat);
        this.idPengendara = idPengendara;
        this.sim = sim;
    }

    public int getIdPengendara() {
        return idPengendara;
    }

    public void setIdPengendara(int idPengendara) {
        this.idPengendara = idPengendara;
    }

    public String getSIM() {
        return sim;
    }

    public void setSIM(String sim) {
        this.sim = sim;
    }
}

class Kendaraan {
    private int idKendaraan;
    private String merek;
    private String model;
    private int tahunBuat;

    public Kendaraan(int idkendaraan, String merek, String model, int tahunBuat) {
        this.idKendaraan = idkendaraan;
        this.merek = merek;
        this.model = model;
        this.tahunBuat = tahunBuat;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerk(String merk) {
        this.merek = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahunBuat() {
        return tahunBuat;
    }
        public void setTahunBuat(int tahunBuat) {
        this.tahunBuat = tahunBuat;
    }
}

class Tilang<Hearing, Pembayaran> {
    private int idSuratTilang;
    private Date tanggalPelanggaran;
    private String jenisPelanggaran;
    private Pengendara pengendara;
    private Kendaraan kendaraan;
    private DetailBayar detailBayar;
    private Hearing hearing;
    private Pembayaran pembayaran;

    public Tilang(int idSuratTilang, Date tanggalPelanggaran, String tipePelanggaran, Pengendara pengendara, Kendaraan kendaraan) {
        this.idSuratTilang = idSuratTilang;
        this.tanggalPelanggaran = tanggalPelanggaran;
        this.jenisPelanggaran = tipePelanggaran;
        this.pengendara = pengendara;
        this.kendaraan = kendaraan;
    }

    public int getTicketId() {
        return idSuratTilang;
    }

    public void setTicketId(int ticketId) {
        this.idSuratTilang = ticketId;
    }

    public Date getTanggalPelanggaran() {
        return tanggalPelanggaran;
    }

    public void setTanggalPelanggaran(Date tanggalPelanggaran) {
        this.tanggalPelanggaran = tanggalPelanggaran;
    }

    public String getTipePelanggaran() {
        return jenisPelanggaran;
    }

    public void setTipePelanggaran(String tipePelanggaran) {
        this.jenisPelanggaran = tipePelanggaran;
    }

        public Pengendara getPengendara() {
        return pengendara;
    }

    public void setPengendara(Pengendara pengendara) {
        this.pengendara = pengendara;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public DetailBayar getDetailBayar() {
        return detailBayar;
    }

    public void setDetailBayar(DetailBayar detailBayar) {
        this.detailBayar = detailBayar;
    }

    public Hearing getHearing() {
        return hearing;
    }

    public void setHearing(Hearing hearing) {
        this.hearing = hearing;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }
}

class DetailBayar {
    private int fineId;
    private int totalTagihan;
    private Date tanggalDibuat;
    private String status;

    public DetailBayar(int fineId, int totalTagihan, Date tanggalDibuat, String status) {
        this.fineId = fineId;
        this.totalTagihan = totalTagihan;
        this.tanggalDibuat = tanggalDibuat;
        this.status = status;
    }

    public int getFineId() {
        return fineId;
    }

    public void setFineId(int fineId) {
        this.fineId = fineId;
    }

    public int getTotalTagihan() {
        return totalTagihan;
    }

    public void setTotalTagihan(int amount) {
        this.totalTagihan = amount;
    }

    public Date getTanggalDibuat() {
        return tanggalDibuat;
    }

    public void setTanggalDibuat(Date tanggalDibuat) {
        this.tanggalDibuat = tanggalDibuat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

public class TiketSystem {

    private static final Logger logger = Logger.getLogger(TiketSystem.class.getName());

    public static void main(String[] args) {
        Pengendara pengendara = new Pengendara("Budi", "Jl. Kebon Jeruk No. 12", 101, "A12345");

        Kendaraan kendaraan = new Kendaraan(201, "Toyota", "Avanza", 2018);

        Date tanggalPelanggaran = new Date();

        Tilang<String, String> tilang = new Tilang<>(301, tanggalPelanggaran, "Melanggar Lampu Merah", pengendara, kendaraan);

        DetailBayar detailBayar = new DetailBayar(401, 500000, new Date(), "Belum Dibayar");
        tilang.setDetailBayar(detailBayar);

        logger.log(Level.INFO, "Pengendara: {0}", tilang.getPengendara().getNama());
        logger.log(Level.INFO, "Kendaraan: {0} {1}", new Object[]{tilang.getKendaraan().getMerek(), tilang.getKendaraan().getModel()});
        logger.log(Level.INFO, "Pelanggaran: {0}", tilang.getTipePelanggaran());
        logger.log(Level.INFO, "Total Tagihan: {0}", tilang.getDetailBayar().getTotalTagihan());
    }
}
