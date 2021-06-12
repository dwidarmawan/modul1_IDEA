package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNpm("19710106");
        mahasiswa.setNama("Dwi Darmawan");
        mahasiswa.tanggalLahir = simpleDateFormat.parse("01-01-2001");

        System.out.println("Nama \t\t\t : " + mahasiswa.getNama());
        System.out.println("NPM \t\t\t : " + mahasiswa.getNpm());
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa.tanggalLahir));

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNpm("19710100");
        mahasiswa2.setNama("Baron");
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("02-02-2002");

        System.out.println("Nama \t\t\t : " + mahasiswa2.getNama());
        System.out.println("NPM \t\t\t : " + mahasiswa2.getNpm());
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usia : " + mahasiswa.hitungUsia());

    }
}
