

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.jws.HandlerChain;
import javax.swing.JPanel;


public class rocketMovement extends JPanel implements KeyListener {
	
	


	public rocketMovement()  {
		setFocusable(true);
		addKeyListener(this);
		
	}

	@SuppressWarnings("unused")
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_W){
			graphicsLibrary.moveup = true;
			//System.out.println(" Key PRESSED  = MOVEUP");
					
		}
		if(e.getKeyCode() == KeyEvent.VK_S){
			graphicsLibrary.movedown = true;
			//System.out.println(" Key PRESSED  = MOVEDOWN");
					
		}
		if(e.getKeyCode() == KeyEvent.VK_A){
			graphicsLibrary.moveleft = true;
			//System.out.println(" Key PRESSED  = MOVeLEFT");
					
		}
		if(e.getKeyCode() == KeyEvent.VK_D){
			graphicsLibrary.moveright = true;
			//System.out.println(" Key PRESSED  = MOVERÝGHT");
					
		}
		

		
		

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_W){
			graphicsLibrary.moveup = false;
					
		}
		if(e.getKeyCode() == KeyEvent.VK_S){
			graphicsLibrary.movedown = false;
					
		}
		if(e.getKeyCode() == KeyEvent.VK_A){
			graphicsLibrary.moveleft = false;
					
		}
		if(e.getKeyCode() == KeyEvent.VK_D){
			graphicsLibrary.moveright = false;
					
		}
			
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
