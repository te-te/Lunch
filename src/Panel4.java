import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel4 {	
	JPanel infoP;			// �� ���� �г�	
	JLabel foodNameL;		// ���� �̸� ��
	JLabel foodPriceL;		// ���� ���� ��
	JLabel foodPointL;		// ���� �Ǹ� ��� ������ ��
	JLabel foodShopL;		// ���� �Ǹ��� ��
	JLabel foodDistanceL;	// ���� �Ǹ��� �Ÿ� ��
	JButton closeInfoB;		// �� ���� �г� �ݱ� ��ư
	
	JPanel argP;
	CardLayout argCL;
	
	Font font;				// ��Ʈ ����
	
	public void create(JPanel argP, CardLayout argCL, Food argFood){
		this.argP = argP;
		this.argCL = argCL;
		
		// �� ���� �г�
		infoP = new JPanel(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon infoImage =
						new ImageIcon("img/screen/info.png");
				g.drawImage(infoImage.getImage(), 0, 0, 800, 450, null);
			}
		};
		infoP.setBounds(0, 0, 800, 450);
		infoP.setLayout(null);
		argP.add(infoP, "Info");
		
		// ��Ʈ ����
		font = new Font("Dialog", Font.PLAIN, 20);
		
		// ���� �̸� ��
		foodNameL = new JLabel("�̸� : " + argFood.name);
		foodNameL.setBounds(280, 50, 300, 50);
		foodNameL.setFont(font);
		foodNameL.setForeground(Color.WHITE);
		infoP.add(foodNameL);
		
		// ���� ���� ��
		foodPriceL = new JLabel("���� : " + Integer.toString(argFood.price));
		foodPriceL.setBounds(280, 100, 300, 50);
		foodPriceL.setFont(font);
		foodPriceL.setForeground(Color.WHITE);
		infoP.add(foodPriceL);
				
		// ���� �Ǹ� ��� ������ ��
		foodPointL = new JLabel("��ġ : " + argFood.point);
		foodPointL.setBounds(280, 150, 300, 50);
		foodPointL.setFont(font);
		foodPointL.setForeground(Color.WHITE);
		infoP.add(foodPointL);
		
		// ���� �Ǹ��� ��
		foodShopL = new JLabel("�Ǹ� : " + argFood.shop);
		foodShopL.setBounds(280, 200, 300, 50);
		foodShopL.setFont(font);
		foodShopL.setForeground(Color.WHITE);
		infoP.add(foodShopL);
		
		// ���� �Ǹ��� �Ÿ� ��
		foodDistanceL = new JLabel("�Ÿ� : " + argFood.distance);
		foodDistanceL.setBounds(280, 250, 300, 50);
		foodDistanceL.setFont(font);
		foodDistanceL.setForeground(Color.WHITE);
		infoP.add(foodDistanceL);
		
		// �� ���� �г� �ݱ� ��ư
		closeInfoB = new JButton(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon closeInfoBImage =
						new ImageIcon("img/button/closeInfoB.png");
				g.drawImage(closeInfoBImage.getImage(), 0, 0, 100, 40, null);
			}
		};
		closeInfoB.addActionListener(new ButtonHandler());
		closeInfoB.setBounds(330, 360, 100, 40);
		infoP.add(closeInfoB);
		
		// ��ġ������-�� ���� ȭ�� ǥ��
		argCL.show(argP, "Info");
	}
	
	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// �� ���� �г� �ݱ�
			argCL.show(argP, "Result");
		}
	}
}
