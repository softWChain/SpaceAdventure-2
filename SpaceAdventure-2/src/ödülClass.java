import java.util.Timer;
import java.util.TimerTask;


public class �d�lClass {
	
	private int temp=0;
	Timer timer;
	private int periodH�z=20;
	
	public �d�lClass(){
		
		
		for(int i=0;i<=5;i++){
			
			graphicsLibrary.�d�lX[i] += 10+temp;
			graphicsLibrary.�d�lY[i] -=-100+temp;
			temp+=100;
		}
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				graphicsLibrary.�d�lH�z[0] = 3;
				graphicsLibrary.�d�lH�z[1] = 7;
				graphicsLibrary.�d�lH�z[2] = 4;
				graphicsLibrary.�d�lH�z[3] = 6;
				graphicsLibrary.�d�lH�z[4] = 2;
				graphicsLibrary.�d�lH�z[5] = 5;
				
				for(int i=0;i<=5;i++){
					
					graphicsLibrary.�d�lY[i]+= graphicsLibrary.�d�lH�z[i];
					
					if(graphicsLibrary.�d�lY[i] >= Main.setHeight){
						
						graphicsLibrary.�d�lY[i] = -100;
					}
					
					
				}
				
				
				
			}
		}, 0, periodH�z);
		
		
		
	}

}
