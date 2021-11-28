package app;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {
	public static void main(String[] args) {
	    Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension d = tk.getScreenSize();
	    System.out.println("O tamanho da tela é de " + d.width + " X " + d.height);

	  }
}
