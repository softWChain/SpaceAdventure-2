import java.util.Timer;
import java.util.TimerTask;


public class �d�lKay�p {
	
	Timer timer;
	private int temp=0;
	private int periodH�z=20;
	
	public �d�lKay�p(){
		
	
		timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				
				for(int i=0;i<=5;i++){
					
					if(graphicsLibrary.rocketX>=graphicsLibrary.�d�lX[i]-65 && graphicsLibrary.rocketX<=graphicsLibrary.�d�lX[i]+30&&
							graphicsLibrary.rocketY>=graphicsLibrary.�d�lY[i]-30&& graphicsLibrary.rocketY<=graphicsLibrary.�d�lY[i]+65){
						
						graphicsLibrary.sagl�kBoolean=true;
						graphicsLibrary.�d�lY[i]=-100;
						
						if(graphicsLibrary.sagl�kBoolean==true){
							
							graphicsLibrary.sagl�k+=graphicsLibrary.sagl�kDeger;
						}
						
						
								
					}
				}
			}
		}, 0, periodH�z);
		
		
		
		
	}

}
