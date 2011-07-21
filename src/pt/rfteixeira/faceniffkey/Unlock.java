package pt.rfteixeira.faceniffkey;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.util.Log;

public class Unlock {
	public static String decode(String id) throws NoSuchAlgorithmException {
		MessageDigest localMessageDigest =  MessageDigest.getInstance("SHA1");

		byte[] arrayOfByte1 = id.getBytes();

		String str2 = bytesToHex(localMessageDigest.digest(arrayOfByte1));

		byte[] arrayOfByte2 = new byte[8];
		int i = 0;
		int k = 0;

		for (int j = 0; ; j = k) {
			if (j >= 8) {
				String str3 = bytesToHex(localMessageDigest.digest(arrayOfByte2)).substring(0, 8);

				if (str3.equalsIgnoreCase(str3)) {
					Log.d("FaceNiffKey", "KEY: " + str3);
					return str3;
				}
			}

			k = j + 1;
			byte m = (byte)str2.charAt(i);

			arrayOfByte2[j] = m;

			int n = k + 1;
			i += n;
		}
	}

	private static String bytesToHex(byte abytes[]){
		char ac[] = {(byte)'0', (byte)'1', (byte)'2', (byte)'3',
				(byte)'4', (byte)'5', (byte)'6', (byte)'7',
				(byte)'8', (byte)'9', (byte)'A', (byte)'B',
				(byte)'C', (byte)'D', (byte)'E', (byte)'F'};


		StringBuffer stringbuffer = new StringBuffer();

		int i = 0;

		do {
			int j = abytes.length;
			if (i >= j)
				return stringbuffer.toString();

			int k = abytes[i] >> 4 & 0xf;
			stringbuffer.append(ac[k]);

			int l = abytes[i] & 0xf;
			stringbuffer.append(ac[l]);

			i++;

		} while(true);

	}
}
