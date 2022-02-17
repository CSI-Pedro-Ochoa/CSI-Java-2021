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
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;








public class DogPound extends JPanel implements ActionListener {

	
	
	List<Dog> dogs = new ArrayList<Dog>();
	private int B_WIDTH = 800;
	private int B_HEIGHT = 800; 
    private final int DOT_SIZE = 50;
    private final int ALL_DOTS = 50;


    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int[ALL_DOTS];

   


    private Image ball;
    private Image dog;
    private Image background;
    
    private boolean inGame = true;

	
  	private Image shepherd; 
  	
  	
    public DogPound() {
        
        initDogPound();
    }
    
    private void initDogPound() {

        
        setBackground(new Color(187, 87, 17));
        setFocusable(true);

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
  
        
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(background, 0, 0, null);
        doDrawing(g);
    }
    
 private void doDrawing(Graphics g) {
        
                   Toolkit.getDefaultToolkit().sync();

        }        

 
    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();
    }

}
