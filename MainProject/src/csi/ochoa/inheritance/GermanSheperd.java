package csi.ochoa.inheritance;

	
public class GermanSheperd extends Dog{

		public GermanSheperd() {
			super();
			this.size = 50;
			this.wild = false;
			this.hair = "brown";
			this.gender = "female";
		}
		
		
		
		
		
		public Noise bark() {

			return new Noise(110, true);
		}
		
		public Shit eat() {

			return new Shit(true, 3, "Apple");
		}
	}

