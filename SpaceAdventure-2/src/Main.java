import javax.swing.JFrame;


public class Main {
	
	static int setWidth = 600;
	static int setHeight=500;
	
	public static void main(String[] args) {

		
		JFrame frame = new JFrame();
		graphicsLibrary graphicsLib = new graphicsLibrary();
		BackgroundMovement backgroundmovement1 = new BackgroundMovement();
		rocketSpeed rocktsp = new rocketSpeed();
		tasCogaltma tascogalt = new tasCogaltma();
		�d�lClass �d�l = new �d�lClass();
		�d�lKay�p �d�l2 = new �d�lKay�p();
		tasKay�p taskay�p = new tasKay�p();
		explosionClass exp = new explosionClass();
		rocketMovement rocketm = new rocketMovement();
		frame.add(rocketm);
		frame.add(graphicsLib);
		frame.setTitle("Space Adventure");
		frame.setSize(setWidth,setHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		

	}

}
