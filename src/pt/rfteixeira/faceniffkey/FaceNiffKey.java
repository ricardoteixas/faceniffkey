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
	private static final String SDCARD_KEY = "/sdcard/key";
	private static final String PATH_KEY = "/data/data/net.ponury.faceniff/key";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		String id = Settings.Secure.getString(getBaseContext().getContentResolver(), "android_id");
		Log.d("FaceNiffKey", "ID: " + id);

		try {
			String key = Unlock.decode(id);

			if (key != null) {
				File file = new File(PATH_KEY);

				if (file.exists()) {
					file.delete();
				}

				FileWriter fileOutputStream = null;

				try {
					fileOutputStream = new FileWriter(SDCARD_KEY);
					fileOutputStream.write(key + "\n");
					fileOutputStream.flush();
					
					Process su = Runtime.getRuntime().exec("/system/bin/su");
					DataOutputStream dataOutputStream = new DataOutputStream(su.getOutputStream());
					
					if (su == null || dataOutputStream == null)
						Log.e("FaceNiffKey", "CAN NOT RUN SU");
					
					dataOutputStream.writeBytes("mv " + SDCARD_KEY + " " + PATH_KEY + "\n");
					dataOutputStream.flush();
					dataOutputStream.writeBytes("exit\n");
					dataOutputStream.flush();
					
					try {
						su.waitFor();
					}
					
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				catch (FileNotFoundException e) {
					Log.e("FaceNiffKey", "CAN NOT WRITE KEY FILE");
					e.printStackTrace();
				}
				
				catch (IOException e) {
					e.printStackTrace();
				}

				finally {
					if (fileOutputStream != null) {
						try {
							fileOutputStream.close();
						}
						
						catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		
		catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}