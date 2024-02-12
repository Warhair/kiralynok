package kiralynok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIProgram extends JFrame {
    private Tábla tábla;
    private JPanel boardPanel;
    private JButton getInfoButton;

    public GUIProgram() {
        setTitle("Királynők");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize Tábla and boardPanel
        tábla = new Tábla('#');
        tábla.fillTable();
        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(8, 8));

        initializeBoard();

        // Create getInfoButton
        getInfoButton = new JButton("Üres mezők");
        getInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayInfo();
            }
        });

        // Add components to the frame
        add(boardPanel, BorderLayout.CENTER);
        add(getInfoButton, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void initializeBoard() {
        char[][] board = tábla.getBoard();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JLabel label = new JLabel(String.valueOf(board[i][j]));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                boardPanel.add(label);
            }
        }
    }

    private void displayInfo() {
        int uresoszlop = tábla.getÜresOszlopokSzáma();
        int uressor = tábla.getÜresSorokSzáma();
        JOptionPane.showMessageDialog(this, "Üres oszlop: " + uresoszlop + "\nÜres sor: " + uressor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUIProgram::new);
    }
}