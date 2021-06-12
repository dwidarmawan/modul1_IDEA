package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggalLahir;

    void tampilkanAtribut() {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        System.out.println("Nama \t\t\t : " + this.nama);
        System.out.println("NPM \t\t\t : " + this.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(this.tanggalLahir));
    }

    public void menyapa() {
    }

    int hitungUsia() {
        Calendar tanggalLahir = Calendar.getInstance();
        tanggalLahir.setTime(this.tanggalLahir);
        Calendar hariIni = Calendar.getInstance();

        int selisihTahun = hariIni.get(Calendar.YEAR) - tanggalLahir.get(Calendar.YEAR);

        int bulanIni = hariIni.get(Calendar.MONTH);
        int bulanLahir = tanggalLahir.get(Calendar.MONTH);

        if (bulanIni < bulanLahir) {
            selisihTahun--;
        }else{
            int tanggalHariIni = hariIni.get(Calendar.MONTH);
            int tanggalTanggalLahir = tanggalLahir.get(Calendar.MONTH);

            if (bulanIni == bulanLahir
                    &&
                    tanggalHariIni < tanggalTanggalLahir) {
                selisihTahun--;
            }
        }

        return selisihTahun;
    }
}
