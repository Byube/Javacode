package snake;

import javax.swing.JFrame;

public class Main {
	public Main() {
		JFrame jf = new JFrame();
		GamePanel gamePanel = new GamePanel();
		
		jf.add(gamePanel);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("SNAKECODING TEST");
		
		jf.pack();
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		new Main();
	}

}
