package it.uniupo.matteo.magri.bruteforce;

import it.uniupo.byteLib.*;
import it.uniupo.matteo.magri.XOR.XOR;

public class BruteForce {

	public static void main(String[] args) {
		//read file
		byte[] text = Tools.readByteFlow("src/main/resources/OTP-3"); //if you change OTP-3 in OTP-4 more time is used because the key is longer
		//create all possible keys
		BitStringGenerator bsGen = new BitStringGenerator(3); //OTP-3 has 3 byte, we can also put 4 if we use OTP-4
		bsGen.zeroInit(); //0x0000...0
		byte[] array =  bsGen.toByteArray();
		while(!bsGen.isMax()) {
			byte[] finalText = XOR.xorCipher(text, array);
			if(Tools.isUText(finalText))
					System.out.println(finalText);
			array =  bsGen.nextVal();
			
		}
	}
}
