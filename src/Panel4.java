import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel4 {	
	JPanel infoP;			// 상세 정보 패널	
	JLabel foodNameL;		// 음식 이름 라벨
	JLabel foodPriceL;		// 음식 가격 라벨
	JLabel foodPointL;		// 음식 판매 장소 기준점 라벨
	JLabel foodShopL;		// 음식 판매점 라벨
	JLabel foodDistanceL;	// 음식 판매점 거리 라벨
	JButton closeInfoB;		// 상세 정보 패널 닫기 버튼
	
	JPanel argP;
	CardLayout argCL;
	
	Font font;				// 폰트 설정
	
	public void create(JPanel argP, CardLayout argCL, Food argFood){
		this.argP = argP;
		this.argCL = argCL;
		
		// 상세 정보 패널
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
		
		// 폰트 설정
		font = new Font("Dialog", Font.PLAIN, 20);
		
		// 음식 이름 라벨
		foodNameL = new JLabel("이름 : " + argFood.name);
		foodNameL.setBounds(280, 50, 300, 50);
		foodNameL.setFont(font);
		foodNameL.setForeground(Color.WHITE);
		infoP.add(foodNameL);
		
		// 음식 가격 라벨
		foodPriceL = new JLabel("가격 : " + Integer.toString(argFood.price));
		foodPriceL.setBounds(280, 100, 300, 50);
		foodPriceL.setFont(font);
		foodPriceL.setForeground(Color.WHITE);
		infoP.add(foodPriceL);
				
		// 음식 판매 장소 기준점 라벨
		foodPointL = new JLabel("위치 : " + argFood.point);
		foodPointL.setBounds(280, 150, 300, 50);
		foodPointL.setFont(font);
		foodPointL.setForeground(Color.WHITE);
		infoP.add(foodPointL);
		
		// 음식 판매점 라벨
		foodShopL = new JLabel("판매 : " + argFood.shop);
		foodShopL.setBounds(280, 200, 300, 50);
		foodShopL.setFont(font);
		foodShopL.setForeground(Color.WHITE);
		infoP.add(foodShopL);
		
		// 음식 판매점 거리 라벨
		foodDistanceL = new JLabel("거리 : " + argFood.distance);
		foodDistanceL.setBounds(280, 250, 300, 50);
		foodDistanceL.setFont(font);
		foodDistanceL.setForeground(Color.WHITE);
		infoP.add(foodDistanceL);
		
		// 상세 정보 패널 닫기 버튼
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
		
		// 배치관리자-상세 정보 화면 표시
		argCL.show(argP, "Info");
	}
	
	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// 상세 정보 패널 닫기
			argCL.show(argP, "Result");
		}
	}
}
