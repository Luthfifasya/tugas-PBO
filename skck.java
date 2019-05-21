package SKCK;

public class skck {
		private int noskck ;
		private String nama, jeniskelamin, noTelepon, ttl,  kebangsaan, agama, tempattinggalskrg,  pekerjaan, keterangan;	
		public skck (String nama , String jeniskelamin, String noTelepon, String ttl, String kebangsaan, String agama, int noskck, String tempattinggalskrg, String pekerjaan,  String keterangan){
			this.nama = nama;
			this.jeniskelamin = jeniskelamin;
			this.noTelepon = noTelepon;
			this.ttl = ttl;
			this.kebangsaan = kebangsaan;
			this.agama = agama;
			this.noskck = noskck;
			this.tempattinggalskrg = tempattinggalskrg;
			this.pekerjaan = pekerjaan;
			this.keterangan = keterangan;
			
		}
		
			public String nama(){
				return nama;
			}
			
			public String jeniskelamin(){
				return jeniskelamin;
			}	
			
			public String noTelepon(){
				return noTelepon;
			}
			
			public String ttl(){
				return ttl;
			}
			
			public String kebangsaan(){
				return kebangsaan;
			}
			
			public String agama(){
				return agama;
			}
			
			public int Noskck(){
				return noskck;
			}

			public String tempattinggalskrg(){
				return tempattinggalskrg;
			}
			
			public String pekerjaan(){
				return pekerjaan;
			}

			public String keterangan(){
				return keterangan;
			}
	}

