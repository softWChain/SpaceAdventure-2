import java.util.Timer;
import java.util.TimerTask;


public class ödülClass {
	
	private int temp=0;
	Timer timer;
	private int periodHýz=20;
	
	public ödülClass(){
		
		
		for(int i=0;i<=5;i++){
			
			graphicsLibrary.ödülX[i] += 10+temp;
			graphicsLibrary.ödülY[i] -=-100+temp;
			temp+=100;
		}
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				graphicsLibrary.ödülHýz[0] = 3;
				graphicsLibrary.ödülHýz[1] = 7;
				graphicsLibrary.ödülHýz[2] = 4;
				graphicsLibrary.ödülHýz[3] = 6;
				graphicsLibrary.ödülHýz[4] = 2;
				graphicsLibrary.ödülHýz[5] = 5;
				
				for(int i=0;i<=5;i++){
					
					graphicsLibrary.ödülY[i]+= graphicsLibrary.ödülHýz[i];
					
					if(graphicsLibrary.ödülY[i] >= Main.setHeight){
						
						graphicsLibrary.ödülY[i] = -100;
					}
					
					
				}
				
				
				
			}
		}, 0, periodHýz);
		
		
		
	}

}
