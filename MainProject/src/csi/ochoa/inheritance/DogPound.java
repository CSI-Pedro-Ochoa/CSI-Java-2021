package csi.ochoa.inheritance;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;

public class DogPound extends Jpanel {

    public DogPound() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new DogPound());
        
        setResizable(false);
        pack();
        
        setTitle("DogPound");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {

    	
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new DogPound();
            ex.setVisible(true);
        });
    }
    
    @Override
   

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(background, 0, 0, null);
        doDrawing(g);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    	
    	checkCollision();
        
        repaint();
    }
    
}
