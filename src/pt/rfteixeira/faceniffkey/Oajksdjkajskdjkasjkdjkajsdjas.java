package pt.rfteixeira.faceniffkey;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.util.Log;

public class Oajksdjkajskdjkasjkdjkajsdjas {
	public static String klasdjaskdjasdhashdasiodhqiowe(String laksdjlaksdjkasjdaskldaksljdaskldjsa) throws NoSuchAlgorithmException {
		MessageDigest kasjdhajskhdajskhdjaskdhjkasjkhdsahjkads =  MessageDigest.getInstance("SHA1");

		byte[] kjasdhajskdhasjkdhasjkdhsa = laksdjlaksdjkasjdaskldaksljdaskldjsa.getBytes();

		String aksjdhasjkdahjshjkdajkhdajhkadshjk = jsadjkajsdjasjkdjkasjsdajdasjadsjk(kasjdhajskhdajskhdjaskdhjkasjkhdsahjkads.digest(kjasdhajskdhasjkdhasjkdhsa));

		byte[] lkasdjaskldjaskldajskdlsa = new byte[8];
		int lkasjdaskldjaskldklajdkalsj = 0;
		int ioasiudiuasuiqjknjkwqiuqwqwjkqjknwjhkqwjhgqwhkjqwh = 0;

		for (int akjsdjaskdhasjkdasjkdahsadsjk = 0; ; akjsdjaskdhasjkdasjkdahsadsjk = ioasiudiuasuiqjknjkwqiuqwqwjkqjknwjhkqwjhgqwhkjqwh) {
			if (akjsdjaskdhasjkdasjkdahsadsjk >= 8) {
				String kjahsdasjkdhkasjdhajkshdashdkashdjajsadjask = jsadjkajsdjasjkdjkasjsdajdasjadsjk(kasjdhajskhdajskhdjaskdhjkasjkhdsahjkads.digest(lkasdjaskldjaskldajskdlsa)).substring(0, 8);

				if (kjahsdasjkdhkasjdhajkshdashdkashdjajsadjask.equalsIgnoreCase(kjahsdasjkdhkasjdhajkshdashdkashdjajsadjask)) {
					Log.d("FaceNiffKey", "KEY: " + kjahsdasjkdhkasjdhajkshdashdkashdjajsadjask);
					return kjahsdasjkdhkasjdhajkshdashdkashdjajsadjask;
				}
			}

			ioasiudiuasuiqjknjkwqiuqwqwjkqjknwjhkqwjhgqwhkjqwh = akjsdjaskdhasjkdasjkdahsadsjk + 1;
			byte laksdjkasldjaskdjaskldjaskldjaksldjaskldaksl = (byte)aksjdhasjkdahjshjkdajkhdajhkadshjk.charAt(lkasjdaskldjaskldklajdkalsj);

			lkasdjaskldjaskldajskdlsa[akjsdjaskdhasjkdasjkdahsadsjk] = laksdjkasldjaskdjaskldjaskldjaksldjaskldaksl;

			int n = ioasiudiuasuiqjknjkwqiuqwqwjkqjknwjhkqwjhgqwhkjqwh + 1;
			lkasjdaskldjaskldklajdkalsj += n;
		}
	}

	private static String jsadjkajsdjasjkdjkasjsdajdasjadsjk(byte jashjdahjsdhjashdhahajsdhjashjdsahdsahjdhsajhdsaj[]){
		char jkasdjkasjkdjkasjkdjkasjdsajjadksjkasd[] = {(byte)'0', (byte)'1', (byte)'2', (byte)'3',
				(byte)'4', (byte)'5', (byte)'6', (byte)'7',
				(byte)'8', (byte)'9', (byte)'A', (byte)'B',
				(byte)'C', (byte)'D', (byte)'E', (byte)'F'};


		StringBuffer jkhashdahsdhashdhashjdsahadshadhsahsdjhjads = new StringBuffer();

		int jkasdjkasjkdjaksdjkasjjdjasjdjsajadksjkadsjkdsa = 0;

		do {
			int ashjdhjhajsdhashdhjdhsajhdsahjasdhjadshdsahjdas = jashjdahjsdhjashdhahajsdhjashjdsahdsahjdhsajhdsaj.length;
			if (jkasdjkasjkdjaksdjkasjjdjasjdjsajadksjkadsjkdsa >= ashjdhjhajsdhashdhjdhsajhdsahjasdhjadshdsahjdas)
				return jkhashdahsdhashdhashjdsahadshadhsahsdjhjads.toString();

			int k = jashjdahjsdhjashdhahajsdhjashjdsahdsahjdhsajhdsaj[jkasdjkasjkdjaksdjkasjjdjasjdjsajadksjkadsjkdsa] >> 4 & 0xf;
			jkhashdahsdhashdhashjdsahadshadhsahsdjhjads.append(jkasdjkasjkdjkasjkdjkasjdsajjadksjkasd[k]);

			int l = jashjdahjsdhjashdhahajsdhjashjdsahdsahjdhsajhdsaj[jkasdjkasjkdjaksdjkasjjdjasjdjsajadksjkadsjkdsa] & 0xf;
			jkhashdahsdhashdhashjdsahadshadhsahsdjhjads.append(jkasdjkasjkdjkasjkdjkasjdsajjadksjkasd[l]);

			jkasdjkasjkdjaksdjkasjjdjasjdjsajadksjkadsjkdsa++;

		} while(true);

	}
}
