import java.util.Timer;
import java.util.TimerTask;


public class ödülKayýp {
	
	Timer timer;
	private int temp=0;
	private int periodHýz=20;
	
	public ödülKayýp(){
		
	
		timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				
				for(int i=0;i<=5;i++){
					
					if(graphicsLibrary.rocketX>=graphicsLibrary.ödülX[i]-65 && graphicsLibrary.rocketX<=graphicsLibrary.ödülX[i]+30&&
							graphicsLibrary.rocketY>=graphicsLibrary.ödülY[i]-30&& graphicsLibrary.rocketY<=graphicsLibrary.ödülY[i]+65){
						
						graphicsLibrary.saglýkBoolean=true;
						graphicsLibrary.ödülY[i]=-100;
						
						if(graphicsLibrary.saglýkBoolean==true){
							
							graphicsLibrary.saglýk+=graphicsLibrary.saglýkDeger;
						}
						
						
								
					}
				}
			}
		}, 0, periodHýz);
		
		
		
		
	}

}
