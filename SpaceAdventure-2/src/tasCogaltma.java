import java.util.Timer;
import java.util.TimerTask;


public class tasCogaltma {
	Timer tas;
	private int temp=0;
	private int periodH�z=20;

	public tasCogaltma() {
		
		for(int i=0;i<=5;i++){
			
			graphicsLibrary.tasX[i] =10+temp; 
			graphicsLibrary.tasY[i] =-100-temp; 
			temp+=100;
		}
		
		tas = new Timer();
		tas.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				graphicsLibrary.tasH�zlanma[0]=5;
				graphicsLibrary.tasH�zlanma[1]=4;
				graphicsLibrary.tasH�zlanma[2]=5;
				graphicsLibrary.tasH�zlanma[3]=4;
				graphicsLibrary.tasH�zlanma[4]=5;
				graphicsLibrary.tasH�zlanma[5]=3;
				
				for(int i=0;i<=5;i++){
					
					graphicsLibrary.tasY[i]+=graphicsLibrary.tasH�zlanma[i];
					
					if(graphicsLibrary.tasY[i]>=Main.setHeight){
						
						graphicsLibrary.tasY[i]=-100;
					}
						
				}
				
			}
		}, 0, periodH�z);


	}

}
