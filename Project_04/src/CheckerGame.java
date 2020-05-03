import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 * 
 * @author sellercw
 *
 */
public class CheckerGame extends JFrame {
	private char [][] boardStatus  = new char [][] {
		 {'e','b','e','b','e','b','e','b'},
	     {'b','e','b','e','b','e','b','e'},
		 {'e','b','e','b','e','b','e','b'},
		 {'e','e','e','e','e','e','e','e'},
		 {'e','e','e','e','e','e','e','e'},
		 {'r','e','r','e','r','e','r','e'},
		 {'e','r','e','r','e','r','e','r'},
		 {'r','e','r','e','r','e','r','e'},
		 };
	JPanel panel;
	JMenu menu;
	JLabel status, status2;
	
	public CheckerGame() {
		setSize(505,585);
		setTitle("Checker Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		panel = new JPanel();
		JMenuBar mBar = new JMenuBar();
		menu = new JMenu("Game Help");
		mBar.add(menu);
		setJMenuBar(mBar);
		
		panel.setLayout(new GridLayout(2,1));
		CheckerBoard board = new CheckerBoard(boardStatus);
		add(board, BorderLayout.CENTER);
		status = new JLabel("This game was developed by Colin Sellers", JLabel.CENTER);
		add(status, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		CheckerGame game = new CheckerGame();
		game.setVisible(true);
	}
}
