package app;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println ("O a linguagem do sistema é " + (loc.getDisplayLanguage()));
		System.out.println ("Ou seja em " + (loc.getLanguage()));
	}

}
