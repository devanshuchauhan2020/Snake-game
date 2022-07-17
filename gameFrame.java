

import javax.swing.JFrame;

public class gameFrame extends JFrame {
	 gameFrame(){
		 GamePanel panel = new GamePanel();
		 this.add(panel);
		 this.setTitle("Snake Game");
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setResizable(false);
		 this.pack();
		 this.setVisible(true);
		 this.setLocationRelativeTo(null);
	 }
}
