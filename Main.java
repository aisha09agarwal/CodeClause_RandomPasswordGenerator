package RandomPasswordGenerator;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		String u = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String l = "abcdefghijklmnpqrstuvwxyz";
		String num = "0123456789";
		String sc = "!@#$%^&*()_-+={}[]:<>?,./";
		String comb = u+l+sc+num;
		int len = 8;
		char[] pass = new char[len];
		Random r = new Random();
		for(int i=0;i<len;i++) {
			pass[i] = comb.charAt(r.nextInt(comb.length()));
		}
		System.out.println("Password :  "+ new String(pass));
	}

}
