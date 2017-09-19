import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel3 {
	JPanel resultP;		// ��� ȭ�� �г�
	JLabel foodImageL;	// ���� �̹��� ��
	JButton infoB;		// �� ���� ���� ��ư
	JButton closeB;		// ���α׷� ���� ��ư
	
	JPanel argP;
	CardLayout argCL;
	Food argFood;
	
	public void create(JPanel argP, CardLayout argCL, Food argFood){
		this.argP = argP;
		this.argCL = argCL;
		this.argFood = argFood;
		
		// ��� ȭ�� �г�
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
		
		// ���� �̹��� ��
		foodImageL = new JLabel(argFood.image);
		foodImageL.setBounds(250, 55, 270, 270);
		resultP.add(foodImageL);
		
		// �� ���� ���� ��ư
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
		
		// ���α׷� ���� ��ư
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
		
		// ��ġ������-��� ȭ�� ǥ��
		argCL.show(argP, "Result");
	}
	
	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource() == infoB){
				// �� ���� ȭ�� �г� ����&���
				Panel4 objP4 = new Panel4();
				objP4.create(argP, argCL, argFood);
			}
			if(ae.getSource() == closeB){
				// ���α׷� ����
				System.exit(0);
			}
		}
	}
}