import java.util.ConcurrentModificationException;
import java.util.Timer;
import java.util.TimerTask;


public class bulletTimer {
	
	Timer timer;
	
	public bulletTimer(){
		
		timer = new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				
				try{
					for(Ates  ates : graphicsLibrary.atesler){						//System.out.println("veysss");
						
						ates.setBulletY(ates.getBulletY() - graphicsLibrary.azalanY);
						
						if(ates.getBulletY()<0){
							graphicsLibrary.atesler.remove(ates);
							graphicsLibrary.harcanan_ates--;
						}
					}
				}
				catch(Exception e){
					System.out.println("NOWW");
				} 
				
			}
		}, 0, 15);
		
	}

}
