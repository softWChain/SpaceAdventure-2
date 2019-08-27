import java.util.Timer;
import java.util.TimerTask;


public class tasKayýp {
	
	Timer tas1;
	private int periodHýz=15;
	private int temp=0;

	public tasKayýp() {
		
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
								
								graphicsLibrary.saglýk-=graphicsLibrary.saglýkDeger1;
							}
							

							
							
							/*if(graphicsLibrary.canlý>=1){
								graphicsLibrary.canlý-=1;
								
							}
							if(graphicsLibrary.canlý==0){
								graphicsLibrary.kayip=true;
		
							}
							else if(graphicsLibrary.canlý>0){
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
		}, 0, periodHýz);
		
	}

}
