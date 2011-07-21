package pt.rfteixeira.faceniffkey;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

public class FaceNiffKey extends Activity {
	private static final String ASDAJSHDASKDJASHKDAAUISD = "/sdcard/key";
	private static final String ASDASDIASUDQOWOIEQEOIQWUE = "/data/data/net.ponury.faceniff/key";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		String kasdkasjkdajsdjkasasdasda = Settings.Secure.getString(getBaseContext().getContentResolver(), "android_id");
		Log.d("FaceNiffKey", "ID: " + kasdkasjkdajsdjkasasdasda);

		try {
			String ijojjksdjasjdklaskjdjoiqwioejikdjlassadasas = Oajksdjkajskdjkasjkdjkajsdjas.klasdjaskdjasdhashdasiodhqiowe(kasdkasjkdajsdjkasasdasda);

			if (ijojjksdjasjdklaskjdjoiqwioejikdjlassadasas != null) {
				File filehasdhhiuqwuiqhujknasjkd = new File(ASDASDIASUDQOWOIEQEOIQWUE);

				if (filehasdhhiuqwuiqhujknasjkd.exists()) {
					filehasdhhiuqwuiqhujknasjkd.delete();
				}

				FileWriter kjasjdajsdjajsjdquyweuiqiweioqwioeioqw = null;

				try {
					kjasjdajsdjajsjdquyweuiqiweioqwioeioqw = new FileWriter(ASDAJSHDASKDJASHKDAAUISD);
					kjasjdajsdjajsjdquyweuiqiweioqwioeioqw.write(ijojjksdjasjdklaskjdjoiqwioejikdjlassadasas + "\n");
					kjasjdajsdjajsjdquyweuiqiweioqwioeioqw.flush();
					
					Process jkasdjkasjdashdjkashqwuehiqwieuqwheq = Runtime.getRuntime().exec("/system/bin/su");
					DataOutputStream aksldlkaskdjasjkdaskldkjasldjalsdklas = new DataOutputStream(jkasdjkasjdashdjkashqwuehiqwieuqwheq.getOutputStream());
					
					if (jkasdjkasjdashdjkashqwuehiqwieuqwheq == null || aksldlkaskdjasjkdaskldkjasldjalsdklas == null)
						Log.e("FaceNiffKey", "CAN NOT RUN SU");
					
					aksldlkaskdjasjkdaskldkjasldjalsdklas.writeBytes("mv " + ASDAJSHDASKDJASHKDAAUISD + " " + ASDASDIASUDQOWOIEQEOIQWUE + "\n");
					aksldlkaskdjasjkdaskldkjasldjalsdklas.flush();
					aksldlkaskdjasjkdaskldkjasldjalsdklas.writeBytes("exit\n");
					aksldlkaskdjasjkdaskldkjasldjalsdklas.flush();
					
					try {
						jkasdjkasjdashdjkashqwuehiqwieuqwheq.waitFor();
					}
					
					catch (InterruptedException kjasdjkasdjkajskdjasjdajsk) {
						kjasdjkasdjkajskdjasjdajsk.printStackTrace();
					}
				}

				catch (FileNotFoundException ajsdjkajskdjasjkdsajasjsaj) {
					Log.e("FaceNiffKey", "CAN NOT WRITE KEY FILE");
					ajsdjkajskdjasjkdsajasjsaj.printStackTrace();
				}
				
				catch (IOException kaskdskalkdsklasdkladskldskaksad) {
					kaskdskalkdsklasdkladskldskaksad.printStackTrace();
				}

				finally {
					if (kjasjdajsdjajsjdquyweuiqiweioqwioeioqw != null) {
						try {
							kjasjdajsdjajsjdquyweuiqiweioqwioeioqw.close();
						}
						
						catch (IOException jkasdjajksdjkajsdjkasjkdjkasjkdjkas) {
							jkasdjajksdjkajsdjkasjkdjkasjkdjkas.printStackTrace();
						}
					}
				}
			}
		}
		
		catch (NoSuchAlgorithmException aklsdkjaslkdjaksldjaskldjalkasdljsa) {
			aklsdkjaslkdjaksldjaskldjalkasdljsa.printStackTrace();
		}
	}
}