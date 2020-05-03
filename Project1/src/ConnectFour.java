/**
 * Implements a game of Connect 4, where players take turns
 * dropping checkers down columns.  The first player to get
 * 4 in a row is the winner.
 * @author Norm Krumpe
 */

import java.awt.*;
import javax.swing.*;

public class ConnectFour extends JFrame {
	
	public static void main(String[] args) {
		new ConnectFour(6, 7);
	}

	private int rows, columns;
	private JPanel cellPanel, buttonPanel;
	private JLabel status;
	private Cell[][] cells;
	private JButton[] columnButtons;
	private static int CELL_SIZE = 70; // adjust this for larger or smaller cells

	/**
	 * Constructs a Connect 4 grid with a specified number of rows and columns.
	 * 
	 * @param rows
	 *            the number of rows of squares
	 * @param columns
	 *            the number of columns of squares
	 */
	public ConnectFour(int rows, int columns) {
		super("Let's play Connect 4!");
		this.rows = rows;
		this.columns = columns;

		frameSetup();
		cellPanelSetup();
		buttonPanelSetup();
		statusSetup();
		pack();
		setVisible(true);
	}

	/**
	 * Sets up the details for the frame.
	 */
	private void frameSetup() {
		setLayout(new BorderLayout());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	/**
	 * Sets up the details for the square panel itself.
	 */
	private void cellPanelSetup() {
		// The layout is based on the number of rows
		cellPanel = new JPanel(new GridLayout(rows, 0));
		cellPanel.setPreferredSize(new Dimension(CELL_SIZE * columns, CELL_SIZE * rows));

		// Each square in the grid is a Square object
		cells = new Cell[rows][columns];
		for (int row = 0; row < cells.length; row++) {
			for (int cell = 0; cell < cells[0].length; cell++) {
				cells[row][cell] = new Cell();
				cellPanel.add(cells[row][cell]);
			}
		}
		add(cellPanel, BorderLayout.CENTER);
	}

	/**
	 * Sets up the buttons at the top of each column
	 */
	private void buttonPanelSetup() {
		buttonPanel = new JPanel(new GridLayout(1, 0));
		columnButtons = new JButton[columns];
		for (int i = 0; i < columns; i++) {
			columnButtons[i] = new JButton("" + i);
			columnButtons[i].setToolTipText("Move in column " + i);
			buttonPanel.add(columnButtons[i]);
		}
		add(buttonPanel, BorderLayout.NORTH);
	}

	/**
	 * Sets up the status label at the bottom of the frame, which keeps track of
	 * which player has the move.
	 */
	private void statusSetup() {
		status = new JLabel("Player 1's turn...", JLabel.CENTER);
		add(status, BorderLayout.SOUTH);
	}

	/**
	 * Updates a specified square by indicating which player should now occupy
	 * that square
	 * 
	 * @param row
	 *            the row of the square
	 * @param col
	 *            the column of the square
	 * @param player
	 *            which player should occupy that square (0=empty, 1=player1,
	 *            2=player2)
	 */
	public void updateCell(int row, int col, int player) {
		cells[row][col].setPlayer(player);
	}


}
