import java.util.Timer;
import java.util.TimerTask;


public class BackgroundMovement {
	
	Timer movement;

	public BackgroundMovement() {
		
		movement = new Timer();
		
		movement.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(graphicsLibrary.backgroundY1<496){
					graphicsLibrary.backgroundY1+=2;
				}
				else{
					graphicsLibrary.backgroundY1=-500;
				}
				
				if(graphicsLibrary.backgroundY2<496){
					graphicsLibrary.backgroundY2+=2;
				}
				else{
					graphicsLibrary.backgroundY2=-500;
				}
				
				
			}
		}, 0, graphicsLibrary.bakcgroundSpeed);
		
	}

}
