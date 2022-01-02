package JavaApps;

import java.util.Random;

public class PasswordGenerator {

    static String[] adjectives = {"Funny","Smart","Slow","Funny","Silly","Stupid"};
	static String[] nouns = {"Lion","Apple","Sofa","Boy","Car","Bear"};
    public static void main (String[] args) {
        Random R = new Random();

        String adjective = adjectives[R.nextInt(6)];
        String noun = adjectives[R.nextInt(6)];
        int num = R.nextInt(99);

        String password = adjective+noun+num;

        System.out.printf("Your new ridiculos password is %s:",password);

    }
}