import java.util.Timer;
import java.util.TimerTask;


public class explosionClass {
	
	Timer exp;
	private int periodHýz = 60;
	private int temp=0;

	public explosionClass() {
		exp = new Timer();
		
		exp.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				if(graphicsLibrary.explosionBoolean==true){
					
					//System.out.println("############EXPLOSÝON###########");
					
					if(temp<15){
						graphicsLibrary.expolisionAnimation=temp;
						temp++;
					}
					
					else if(temp==15){
						
						graphicsLibrary.expolisionAnimation=15;
						temp=0;
						graphicsLibrary.explosionBoolean=false;
					}
				}
				

				
				
			}
		}, 0, periodHýz);
		
	}

}
