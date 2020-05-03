import javax.swing.JPanel;
/**
 * 
 * @author sellercw
 *
 */
public class CheckerBoard extends JPanel{
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
	int row;
	int column;
	
	public CheckerBoard(char [][] boardStatus) {
		this.boardStatus = boardStatus;
		
		for(row = 0; row < 8; row++) {
			for(column = 0; column < 8; column++) {
				CheckerPiece newChecker = new CheckerPiece(row, column, boardStatus[row][column]);
				add(newChecker, row * 8 + column);
			}
		}
	}
	public void setBoardStatus(char [][] boardStatus) {
		this.boardStatus = boardStatus;
		repaint();
	}
	public void setCheckerPiece(int row, int column, char status) {
		boardStatus[row][column] = status;
		repaint();
	}
	
}
