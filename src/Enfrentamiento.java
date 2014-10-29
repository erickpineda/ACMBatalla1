import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Enfrentamiento extends GraphicsProgram {

	private static final double LIMITEANCHO = 700;

	public static void main(String[] args) {
		new Enfrentamiento().start(args);
	}

	public void run() {
		this.setSize(804, 405);

		GImage soldado = new GImage("images/soldado.png");
		ArrayList<Soldado> soldados = new ArrayList<Soldado>();
		add(soldado);

		for (int i = 0; i < 800; i++) {
			soldado.move(3, 0);
			soldado.pause(40);
		}

	}
}
