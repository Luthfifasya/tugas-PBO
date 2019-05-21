package SKCK;

public class kolompengisian {
		/*(String nama , String jeniskelamin, int noTelepon, int ttl, String kebangsaan, 
		String agama, int noskck, String tempattinggalskrg, String pekerjaan,  String keterangan)*/
		public static void main (String[] args){

			System.out.println();
			System.out.println();
		/*(String namaPolres, String nama , String jeniskelamin, int noTelepon, int ttl, String kebangsaan, 
		String agama, int noskck, String tempattinggalskrg, String pekerjaan,  String keterangan)*/
			statuspengisian run1 = new statuspengisian("Lutfi", "Laki-Laki","087805354954" , "bandung, 05 oktober 1998", "Indonesia"
			,"islam", 3 , "jl. Purwakarta no.70", "Mahasiswa", "Penah di penjara di Bandung", "Belum jadi");
			run1.NamaPolres();
			System.out.println("================================================================================");
			System.out.println("================================================================================");
			System.out.println(run1.run());


		}
	}