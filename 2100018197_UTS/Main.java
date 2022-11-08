public class Main {
  public static void main(String[] args) {
    System.out.println("\t\t\t UTS PBO \n");
    System.out.println("\t\t\tNama    : AHMAD AL-GHAZALI SHABIR");
    System.out.println("\t\t\tNIM     : 2100018197");
    System.out.println("\t\t\tKelas   : D \n" );

   
    Tendik tendik = new Tendik();
    tendik.setNama("Ahmad");
    tendik.setNip(21000181);
    tendik.setTglLahir("31/12/2002");
    tendik.setAlamat("Jakarta");
    tendik.setJk("Laki-Laki");
    tendik.setTahunMasuk(2018);

    Dosen dsn = new Dosen();
    dsn.setJurusan("Informatika");
    dsn.setNidn(21212002);
    dsn.setNama("Muhammad Shabir S.Kom");
    dsn.setNip(219808092);
    dsn.setTglLahir("30/10/1980");
    dsn.setJk("Laki-Laki");
    dsn.setAlamat("Bogor");
    dsn.setTahunMasuk(2019);

    System.out.println("\t\t\tTenaga Kependidikan");
    System.out.println("Nama Tendik         : " +tendik.getNama());
    System.out.println("NIP  Tendik         : " +tendik.getNip());
    System.out.println("Tanggal Lahir       : " +tendik.getTglLahir());
    System.out.println("Jenis Kelamin       : " +tendik.getJk());
    System.out.println("Alamat              : " +tendik.getAlamat());
    System.out.println("Tahun masuk         : " +tendik.getTahunMasuk());
    System.out.println("Gaji pokok          : " +tendik.gajiTotal());
    System.out.println("Upah lembur(20 jam) : " +tendik.lembur(20));
    System.out.println("Gaji total          : " +tendik.gajiTotal(20));


    System.out.println("\n");
    System.out.println("\t\t\tDosen");
    System.out.println("Nama Dosen          : " +dsn.getNama());
    System.out.println("NIDN                : " +dsn.getNidn());
    System.out.println("Jurusan             : " +dsn.getJurusan());
    System.out.println("NIP  Dosen          : " +dsn.getNip());
    System.out.println("Tanggal Lahir       : " +dsn.getTglLahir());
    System.out.println("Jenis Kelamin       : " +dsn.getJk());
    System.out.println("Alamat              : " +dsn.getAlamat());
    System.out.println("Tahun masuk         : " +dsn.getTahunMasuk());
    System.out.println("Gaji pokok          : " +dsn.gajiTotal());
    System.out.println("Kelas lebih (6 SKS) : " +dsn.mengajarLebih(6));
    System.out.println("Gaji total          : " +dsn.gajiTotal(6));

  }
}