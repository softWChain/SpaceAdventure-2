import java.util.Timer;
import java.util.TimerTask;


public class tasKay�p {
	
	Timer tas1;
	private int periodH�z=15;
	private int temp=0;

	public tasKay�p() {
		
		tas1  = new Timer();
		
		tas1.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				for(int i=0;i<=5;i++){
					
					if(temp==0){
						
						if(graphicsLibrary.rocketX>=graphicsLibrary.tasX[i]-30 && graphicsLibrary.rocketX<=graphicsLibrary.tasX[i]+30&&
								graphicsLibrary.rocketY>=graphicsLibrary.tasY[i] && graphicsLibrary.rocketY<=graphicsLibrary.tasY[i]+30){
							
							
							graphicsLibrary.tasY[i]=-100;
							graphicsLibrary.explosionBoolean=true;
							
							if(graphicsLibrary.explosionBoolean==true){
								
								graphicsLibrary.sagl�k-=graphicsLibrary.sagl�kDeger1;
							}
							

							
							
							/*if(graphicsLibrary.canl�>=1){
								graphicsLibrary.canl�-=1;
								
							}
							if(graphicsLibrary.canl�==0){
								graphicsLibrary.kayip=true;
		
							}
							else if(graphicsLibrary.canl�>0){
								graphicsLibrary.kayip=false;
							}
							temp++;*/
							
							
							
						}
					}
				}
				
				/*if(temp>=1&&temp<=65){
					temp++;
				}
				else if(temp==66){
					temp=0;
				}*/
	
			}
		}, 0, periodH�z);
		
	}

}
