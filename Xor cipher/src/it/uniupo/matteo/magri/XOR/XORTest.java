package it.uniupo.matteo.magri.XOR;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import it.uniupo.byteLib.Tools;
import it.uniupo.matteo.magri.XOR.XOR;

public class XORTest {
	
private static final String PATH = "src/main/resources/";

	@Test
	public void test() {
		byte[] chiaro = Tools.readByteFlow(PATH+"testChiaro");
		byte[] chiave = Tools.readByteFlow(PATH+"testChiave");
		
		byte[] cifrato = Tools.readByteFlow(PATH+"testCifrato");
		
		for (int i = 0; i < cifrato.length; i++) {
		assertEquals(cifrato[i], XOR.xorCipher(chiaro,chiave)[i]);
		}
  }
	
	@Test
	public void testCorta() {
		byte[] chiaro = Tools.readByteFlow(PATH+"testChiaro");
		byte[] chiave = Tools.readByteFlow(PATH+"testChiaveCorta");
		byte[] cifrato = Tools.readByteFlow(PATH+"testCifratoChCorta");
		
		for (int i = 0; i < cifrato.length; i++) {
		assertEquals(cifrato[i], XOR.xorCipher(chiaro,chiave)[i]);
		}
	}
	
	@Test
	public void testLunga() {
		byte[] chiaro = Tools.readByteFlow(PATH+"testChiaro");
		byte[] chiave = Tools.readByteFlow(PATH+"testChiaveLunga");
		byte[] cifrato = Tools.readByteFlow(PATH+"testCifratoChLunga");
		
		for (int i = 0; i < cifrato.length; i++) {
		assertEquals(cifrato[i], XOR.xorCipher(chiaro,chiave)[i]);
		}
	}


}
