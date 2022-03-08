package csi.ochoa.inheritance;

import javax.swing.ImageIcon;

public class Dog {

		
		String hair;
		int size; 
		boolean wild = true;
		boolean gender;
		ImageIcon icon;
		
		

		public Dog() {
			
			
		}  
		public Dog(String hair, int size, boolean wild, boolean gender, String directory) {
			super();
			this.hair = hair;
			this.size = size;
			this.wild = wild;
			this.gender = gender;
			this.icon = new ImageIcon(new ImageIcon(getClass().getResource(directory)).getImage().getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH));
		}


		public void piss() {
			
			System.out.println("tssss");{
				if(gender = true) {
					System.out.println("Raise leg");
				}
				System.out.println("tsssss");
			}	
		}
		
		public void die() {
			
		}
		
		public void wagTail() {
			
		}
		
		public void grow() {
			
			
		}
		
		
		public class Shit {

			boolean soft;
			int size;
			String shape;
			
			
			public Shit() {

			}
			
			public Shit(boolean hard, int size, String shape) {
				super();
				this.soft = soft;
				this.size = size;
				this.shape = shape;
			}


		}
		
		public void mate(Dog D) {
			
			
			
		}
		public void digest() {
			
		
			
			
			return;
		}
		
		

		public class Noise {
			public Noise(int i, boolean b) {
				
			}
			int decibels = 0;
			boolean recurring = false;
		}
	
		
		public class Food {
			public Food(String flavor, String color, boolean humanFood) {
				
			}
			String flavor;
			String color;
			boolean humanFood;
		}
		
		
		public Shit eat(Food f) {
			
			return new Shit();
		}
		
	
		public Noise bark(Noise n) {
			
			
			return new Noise(n.decibels, n.recurring);
		}

	}
	


