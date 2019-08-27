import java.util.Timer;
import java.util.TimerTask;


public class rocketSpeed {

	Timer speed;
	private int rocketHýz=10;

	public rocketSpeed() {
		
		speed = new Timer();
		speed.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				if(graphicsLibrary.moveup == true && graphicsLibrary.rocketY>10){
					
					graphicsLibrary.rocketY-=rocketHýz;
				}
				else if(graphicsLibrary.movedown == true && graphicsLibrary.rocketY<420){
					
					graphicsLibrary.rocketY+=rocketHýz;
				}
				else if(graphicsLibrary.moveleft == true&& graphicsLibrary.rocketX>0){
					
					graphicsLibrary.rocketX-=rocketHýz;
				}
				else if(graphicsLibrary.moveright == true &&graphicsLibrary.rocketX<530){
					
					graphicsLibrary.rocketX+=rocketHýz;
				}
				
				
			}
		}, 0, 15);
		
	}

}
