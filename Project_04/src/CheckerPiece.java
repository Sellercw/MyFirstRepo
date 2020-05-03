import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;
/**
 * 
 * @author sellercw
 *
 */
public class CheckerPiece extends JPanel{
	char status;
	int row;
	int column;
	
	public CheckerPiece(int row, int column, char status) {
		if(row > 7 || column > 7 || row < 0 || column < 0)  {	
			throw new IllegalArgumentException();
		} else if (status != 'e' && status != 'b' && status != 'r') {
			throw new IllegalArgumentException();
		} else {
			this.status = status;
			this.row = row;
			this.column = column;
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if((row + column) % 2 == 0) {
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 60, 60);
		}else {
			g.setColor(Color.GREEN);
			g.fillRect(0, 0, 60, 60);
		}
	
		if(status == 'r') {
			g.setColor(Color.RED);
		} else if(status == 'b') {
			g.setColor(Color.BLACK);
		}
		g.fillOval(7,7,40,40);
	}
}
