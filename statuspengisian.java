package SKCK;

	public class statuspengisian extends skck {
			public String sttspengisian;

			public statuspengisian (String nama , String jeniskelamin, String noTelepon, String ttl, String kebangsaan, 
			String agama, int noskck, String tempattinggalskrg, String pekerjaan,  String keterangan, String sttspengisian)
			{
				super(nama , jeniskelamin, noTelepon, ttl, kebangsaan, 
				agama, noskck, tempattinggalskrg, pekerjaan,  keterangan );
				this.sttspengisian = sttspengisian;
			}

				public String getsttspengisian(){
					return sttspengisian;
				}

				//overide
				public void NamaPolres()
				{
					System.out.println("Polres Purwakarta");
				}

				public String run(){
					return ("Nomer SKCK		\t: "+Noskck()+"\nNama		\t\t: "+nama()+"\nJenisKelamin	\t\t: "
					+jeniskelamin()+"\nNo.Telepon	\t\t: "+noTelepon()+"\nTempat/tanggal lahir 		: "+ttl()+"\nKebangsaan	 	\t: "
					+kebangsaan()+"\nAgama		\t\t: "+agama()+"\nTempat Tinggal Sekarang		: "+tempattinggalskrg()+"\nPekerjaan	\t\t: "+pekerjaan()
					+"\nKeterangan 	\t\t: "+keterangan()+"\nStatus Pembuatan	\t: "+getsttspengisian());
		
		
				}
	}
		
