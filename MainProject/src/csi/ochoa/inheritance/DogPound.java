package csi.ochoa.inheritance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class DogPound extends JPanel implements ActionListener {

	List<Dog> dogs = new ArrayList<Dog>();

	private int B_WIDTH = 800;
	private int B_HEIGHT = 800;
	private final int ALL_DOGS = 50;
	private final int DELAY = 140;

	private final int x[] = new int[ALL_DOGS];
	private final int y[] = new int[ALL_DOGS];

	private boolean leftDirection = false;
	private boolean rightDirection = true;
	private boolean upDirection = false;
	private boolean downDirection = false;
	private boolean isRunning = true;

	private Timer timer;
//	public boolean nextBoolean() {
	

	public DogPound() {

		dogs.add(new Terrier());

		initDogPound();
	}

	private void initDogPound() {
		dogs.add(new Terrier());

        addKeyListener(new TAdapter());
		
		setBackground(new Color(127, 37, 97));
		setFocusable(true);

		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

		timer = new Timer(DELAY, this);
		timer.start();

	}

//   public void loadImages() {
//
//        ImageIcon iid = new ImageIcon(getClass().getResource("Terrier.png"));
//        terrier = iid.getImage().getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
//        iid = new ImageIcon(terrier);
//        
//   }

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

//        g.drawImage(background, 0, 0, null);
		doDrawing(g);
	}

	private void doDrawing(Graphics g) {
		if (isRunning) {
			for (int z = 0; z < dogs.size(); z++) {

					g.drawImage(dogs.get(z).icon.getImage(), x[z], y[z], this);

			}
			Toolkit.getDefaultToolkit().sync();
		}

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		move();
		repaint();
        checkCollision();

	}

	 private void checkCollision() {

	    	for (int z = dogs.size(); z > 0; z--) {

    	   
	    	}

	        if (y[0] >= B_HEIGHT) {
	            rightDirection = false;
	        }

	        if (y[0] < 0) {
	        	leftDirection = false;
	        }

	        if (x[0] >= B_WIDTH) {
	        	upDirection = false;
	        }

	        if (x[0] < 0) {
	        	downDirection = false;
	        }
	        
	       
	    }
	
	private class TAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {

//			int key = e.getKeyCode();
//
//			if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
//				leftDirection = true;
//				upDirection = false;
//				downDirection = false;
//			}
//
//			if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
//				rightDirection = true;
//				upDirection = false;
//				downDirection = false;
//			}
//
//			if ((key == KeyEvent.VK_UP) && (!downDirection)) {
//				upDirection = true;
//				rightDirection = false;
//				leftDirection = false;
//			}
//
//			if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
//				downDirection = true;
//				rightDirection = false;
//				leftDirection = false;
//
//			}
		}
	}
	

	
	
	 private void move() {

	        for (int z = dogs.size(); z > 0; z--) {
	            x[z] = x[(z - 1)];
	            y[z] = y[(z - 1)];
	        }

	        if (leftDirection) {
	            x[0] -= ALL_DOGS;
	        }

	        if (rightDirection) {
	            x[0] += ALL_DOGS;
	        }

	        if (upDirection) {
	            y[0] -= ALL_DOGS;
	        }

	        if (downDirection) {
	            y[0] += ALL_DOGS;
	        }
	        
	        
	   	 Random rd = new Random(); // creating Random object

	     if(rd.nextInt(5) == 3) {
			leftDirection = rd.nextBoolean();
			upDirection = rd.nextBoolean();
			downDirection = rd.nextBoolean();
			rightDirection = rd.nextBoolean();
			
			}
	        
	        
	        
	        
	    }
	 

	
	
	
}



