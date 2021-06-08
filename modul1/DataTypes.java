import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main(String[] args){

  String namaDepan = "Dwi";
  String namaBelakang = "Darmawan";
  int usia = 20;
  int targetTahunKuliah = 4;
  double ipk = 3.89764512;
  char nilaiAbjad = 'A';
  boolean tampan = true;

  Scanner inputan = new Scanner(System.in);

  System.out.println("========== Fase input ==========");
  System.out.print("Input nama depan : ");
  namaDepan = inputan.nextLine();
  System.out.print("Input usia : ");
  usia = inputan.nextInt();
  System.out.print("Input ipk : ");
  ipk = inputan.nextDouble();
  System.out.print("Input nilai abjad : ");
  nilaiAbjad = inputan.next().charAt(0);
  System.out.print("Input Tampan : ");
  tampan = inputan.nextBoolean();

  System.out.println("========== Fase output ==========");
  System.out.println("Nama depan : " + namaDepan);
  System.out.println("Nama belakang : " + namaBelakang);
  System.out.println("Usia : " + usia);
  System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
  System.out.println("IPK : " + ipk);
  System.out.println("Nilai PBO : " + nilaiAbjad);
  System.out.println("Tampan : " + tampan);

  JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaBelakang);

 }
}