package csi.ochoa.inheritance;

import javax.swing.ImageIcon;

public class GermanSheperd extends Dog{

		public GermanSheperd() {
			super();
			this.size = 50;
			this.wild = false;
			this.hair = "brown";
			this.gender = false;
			this.icon = new ImageIcon(getClass().getResource("terrier.jpeg"));
		}
		
		
		
		
		
		public Noise bark() {

			return new Noise(110, true);
		}
		
		public Shit eat() {

			return new Shit(true, 3, "Apple");
		}
	}

