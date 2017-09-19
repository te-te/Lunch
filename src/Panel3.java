import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel3 {
	JPanel resultP;		// 결과 화면 패널
	JLabel foodImageL;	// 음식 이미지 라벨
	JButton infoB;		// 상세 정보 보기 버튼
	JButton closeB;		// 프로그램 종료 버튼
	
	JPanel argP;
	CardLayout argCL;
	Food argFood;
	
	public void create(JPanel argP, CardLayout argCL, Food argFood){
		this.argP = argP;
		this.argCL = argCL;
		this.argFood = argFood;
		
		// 결과 화면 패널
		resultP = new JPanel(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon resultImage =
						new ImageIcon("img/screen/result.png");
				g.drawImage(resultImage.getImage(), 0, 0, 800, 450, null);
			}
		};
		resultP.setBounds(0, 0, 500, 500);
		resultP.setLayout(null);
		argP.add(resultP, "Result");
		
		// 음식 이미지 라벨
		foodImageL = new JLabel(argFood.image);
		foodImageL.setBounds(250, 55, 270, 270);
		resultP.add(foodImageL);
		
		// 상세 정보 보기 버튼
		infoB = new JButton(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon infoBImage =
						new ImageIcon("img/button/infoB.png");
				g.drawImage(infoBImage.getImage(), 0, 0, 100, 40, null);
			}
		};
		infoB.addActionListener(new ButtonHandler());
		infoB.setBounds(250, 350, 100, 40);
		resultP.add(infoB);
		
		// 프로그램 종료 버튼
		closeB = new JButton(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon closeBImage =
						new ImageIcon("img/button/closeB.png");
				g.drawImage(closeBImage.getImage(), 0, 0, 100, 40, null);
			}
		};
		closeB.addActionListener(new ButtonHandler());
		closeB.setBounds(420, 350, 100, 40);
		resultP.add(closeB);
		
		// 배치관리자-결과 화면 표시
		argCL.show(argP, "Result");
	}
	
	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource() == infoB){
				// 상세 정보 화면 패널 생성&출력
				Panel4 objP4 = new Panel4();
				objP4.create(argP, argCL, argFood);
			}
			if(ae.getSource() == closeB){
				// 프로그램 종료
				System.exit(0);
			}
		}
	}
}