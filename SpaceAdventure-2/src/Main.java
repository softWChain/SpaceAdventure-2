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
		ödülClass ödül = new ödülClass();
		ödülKayýp ödül2 = new ödülKayýp();
		tasKayýp taskayýp = new tasKayýp();
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
