package it.uniupo.matteo.magri.XOR;

public class XOR {

	/*Constructor*/
	private XOR() {};
	
	/*Methods*/
	public static byte[] xorCipher(byte[] text, byte[] key) {
		int textLength = text.length;
		int keyLength = key.length;
		byte[] finalText = new byte[textLength];
		for(int i=0;i<textLength;i++) {
			finalText[i] = (byte) (text[i]^key[i%keyLength]);
		}
		return finalText;
	}
}