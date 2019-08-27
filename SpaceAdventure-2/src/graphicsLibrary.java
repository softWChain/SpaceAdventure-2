import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class graphicsLibrary extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	static BufferedImage resim1;
	static BufferedImage resim2;
	static BufferedImage rocketImage;
	static BufferedImage tasImage;
	static BufferedImage explosionArray[] = new BufferedImage[16];
	static BufferedImage ödülImage;
	static BufferedImage atesImage;
	
	static ArrayList<Ates> atesler = new ArrayList<Ates>();

	
	static int backgroundY1=0;
	static int backgroundY2=-500;
	static int bakcgroundSpeed=15;
	static int rocketX=250,rocketY=250;
	static int canlý=2;
	static int expolisionAnimation;
	static int saglýk=100;
	static int saglýkDeger=10;
	static int saglýkDeger1=20;
	static int harcanan_ates=0;
	static int azalanY=4;


	
	
	static int tasHýzlanma[] = new int[6];
	static int tasX[] = new int[6];
	static int tasY[] = new int[6];
	static int ödülX[] = new int[6];
	static int ödülY[] = new int[6];
	static int ödülHýz[] = new int[6];
	

	static boolean moveup=false,movedown=false,moveleft=false,moveright=false;
	static boolean tasCarpma1=false,kayip=false;
	static boolean explosionBoolean=false;
	static boolean bulletBolean= false;
	static boolean saglýkBoolean=false;
	


	public graphicsLibrary(){

		setFocusable(true);
		
		try{
			
			resim1 = ImageIO.read(new File("rsc/Adsýz.png"));
			resim2 = ImageIO.read(new File("rsc/Adsýz.png"));
			rocketImage = ImageIO.read(new File("rsc/Adsýz1.png"));
			tasImage = ImageIO.read(new File("rsc/asteriod.png"));
			atesImage = ImageIO.read(new File("rsc/Ates.png"));
			
			
			
			//EXPLOSÝON
			for(int i=0;i<=15;i++) {
				
				try{
					
					explosionArray[i] = ImageIO.read(new File("rsc/exp"+(i+1)+".png"));
				}
				
				catch(IOException e){
					
					
				}
				
				
			}
			
		}
		
		catch(IOException e){
			
			e.printStackTrace();
		}
		
	}
	
	
	public void paint(Graphics g){
		super.paint(g);
		
		g.drawImage(resim1, 0, backgroundY1,600,500,null);
		g.drawImage(resim2, 0, backgroundY2,600,500,null);
		g.drawImage(rocketImage, rocketX, rocketY,null);
		
		//Bullet
		
		for(Ates ates : atesler){
			g.drawImage(atesImage, ates.getBulletX(),ates.getBulletY(), 30, 30,null);
		}
		
		
		//TAS ÝMAGE
		for(int i=0;i<=5;i++){
			
			g.drawImage(tasImage, tasX[i], tasY[i],50,50,null);
		}
		
		//ÖDÜL
		
		
		for(int i=0;i<=5;i++){
			
			g.drawImage(ödülImage, ödülX[i], ödülY[i],30,30,null);

		}
		
		//EXPLOSÝON
		if(graphicsLibrary.explosionBoolean==true){
			
			for(int i=0;i<=15;i++){
				
				if(expolisionAnimation==i){
					
					g.drawImage(explosionArray[i], rocketX, rocketY-20,73,100,null);
				}
	
			}
			
			/*if(expolisionAnimation>0 && expolisionAnimation<6){
				
				g.setColor(new Color(230,0,0,15));
				g.fillRect(0, 0, getWidth(), getHeight());
			}
			else if(expolisionAnimation>6 && expolisionAnimation<15)
				g.setColor(new Color(230,0,0,15));
				g.fillRect(0, 0, getWidth(), getHeight());
			*/
			}
		
		//SAGLIK
		
		
		g.setColor(Color.CYAN);
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString("Saglýk : " +graphicsLibrary.saglýk, 5, 30);
		
	
		repaint();
		
		
	}
	

}
