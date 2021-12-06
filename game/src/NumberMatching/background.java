package NumberMatching;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import game.MovePiece;
import game.PlayGame;
import game.rule;

public class background extends JFrame implements ActionListener{

	//게임 창 크기
	public final int WIDTH = 900;
	public final int HEIGHT = 800;
	public final int BOARD_WIDTH = (int) (WIDTH * 0.96);
	public final int BOARD_HEIGHT = (int) (HEIGHT * 0.925);
	
	//최상위 jFrame
	private JFrame BoardFrame;	
	
	//상단 영역 jPanel
	private JPanel upPanel;
	//중앙 영역 jPanel
	public static JPanel gamePanel;
	//하단 영역 jPanel
	private JPanel underPanel;
	
	//단계 표시
	public static JLabel comment;
	
	//숫자 버튼
	public static JButton[] buttons;

	
	public background() {
		//최상위 jFrame 선언
		BoardFrame = new JFrame();
		BoardFrame.setTitle("개수맞추기");
		//게임 화면 jPanel
		gamePanel = new JPanel();
		upPanel = new JPanel();
		underPanel = new JPanel();
		//당기기 버튼
		buttons = new JButton[8];
		for(int i=0;i<buttons.length;i++) {
			buttons[i] = new JButton();
		}
		int height=80,width=80;
		int x = 160;
		int y = 191;
		for(int i=0;i<buttons.length;i++) {
			buttons[i].setBounds(x, y, width, height);
			buttons[i].setBackground(Color.RED);
			x+=75;
			if(x==625) {
				x = 75;
				y +=85;
			}
			underPanel.add(buttons[i]);
		}
		
		
		
		//레벨 표시
		comment = new JLabel("1/3");
		
		//기본 레이아웃 구성
		upPanel.setLayout(null);
		upPanel.setBounds(10, 10, 865, 150);
		upPanel.setBackground(Color.decode("#F5F2DF"));
		gamePanel.setLayout(null);
		gamePanel.setBounds(10, 160, 865, 400);
		gamePanel.setBackground(Color.WHITE);
		underPanel.setLayout(null);
		underPanel.setBounds(10, 560, 865, 190);
		underPanel.setBackground(Color.decode("#F5F2DF"));
		
		comment.setBounds(410, 40, 150, 50);
		upPanel.add(comment);
		
		//버튼
		

		
		//최상위 jFrame 기본 설정
		BoardFrame.setLayout(null);
		BoardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BoardFrame.setLocationRelativeTo(null);
		BoardFrame.setSize(WIDTH, HEIGHT);
		BoardFrame.setResizable(false);
		BoardFrame.setVisible(true);
		BoardFrame.add(gamePanel);
		BoardFrame.add(upPanel);
		BoardFrame.add(underPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}