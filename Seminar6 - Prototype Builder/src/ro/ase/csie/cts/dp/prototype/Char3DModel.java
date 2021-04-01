package ro.ase.csie.cts.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Char3DModel {
	CharacterType type;
	String color;

	ArrayList<Integer> graphicPoints = new ArrayList<>();

	private Char3DModel() {}
	
	public Char3DModel(CharacterType type, String color) {
		this.type = type;
		this.color = color;
		
		System.out.println("Generating the 3D model points...");
		try {
			Thread.sleep(2000);
			Random random = new Random(7887);
			
			for (int i=0; i<20; i++) {
				graphicPoints.add(random.nextInt(1000));
			}
			
			System.out.println("Model loaded.");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Char3DModel copy = new Char3DModel();
		copy.type = this.type;
		copy.color = this.color;
		copy.graphicPoints = (ArrayList<Integer>) this.graphicPoints.clone();
		return copy;
	}
}
