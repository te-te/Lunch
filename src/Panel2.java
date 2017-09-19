import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel2 {
	JPanel inputP;					// 입력 화면 패널
	JComboBox<String> pointCmBx;	// 기준점이 되는 장소 (동문, 서문)
	JCheckBox noodleCkBx;			// 면류
	JCheckBox breadCkBx;			// 빵
	JCheckBox riceCkBx;				// 밥류
	JTextField priceTF;				// 가격 입력칸
	JButton inputB;					// 입력 버튼	
	
	JButton selectDongGateB;		// 동문 선택 버튼
	JButton selectSeoGateB;			// 서문 선택 버튼
	JButton selectNoodleB;			// 면류 선택 버튼
	JButton selectBreadB;			// 빵 선택 버튼
	JButton selectRiceB;			// 밥류 선택 버튼
	
	JPanel argP;
	CardLayout argCL;
	
	Food selectedFood;				// 최종적으로 선택된 음식
	
	public void create(JPanel argP, CardLayout argCL){
		this.argP = argP;
		this.argCL = argCL;
		
		// 입력 화면 패널
		inputP = new JPanel(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon inputImage =
						new ImageIcon("img/screen/input.png");
				g.drawImage(inputImage.getImage(), 0, 0, 800, 450, null);
			}
		};
		inputP.setBounds(0, 0, 500, 500);
		inputP.setLayout(null);
		argP.add(inputP, "Input");
		
		// 동문 선택 버튼
		selectDongGateB = new JButton(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon nullImage =
						new ImageIcon("img/button/null.png");
				g.drawImage(nullImage.getImage(), 0, 0, 0, 0, null);
			}
		};
		selectDongGateB.addActionListener(new ButtonHandler());
		selectDongGateB.setBounds(43, 20, 150, 148);
		selectDongGateB.setBorder(null);
		selectDongGateB.setOpaque(false);
		inputP.add(selectDongGateB);
		
		// 서문 선택 버튼
		selectSeoGateB = new JButton(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon nullImage =
						new ImageIcon("img/button/null.png");
				g.drawImage(nullImage.getImage(), 0, 0, 0, 0, null);
			}
		};
		selectSeoGateB.addActionListener(new ButtonHandler());
		selectSeoGateB.setBounds(275, 20, 150, 148);
		selectSeoGateB.setBorder(null);
		selectSeoGateB.setOpaque(false);
		inputP.add(selectSeoGateB);
		
		// 면류 선택 버튼
		selectNoodleB = new JButton(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon nullImage =
						new ImageIcon("img/button/null.png");
				g.drawImage(nullImage.getImage(), 0, 0, 0, 0, null);
			}
		};
		selectNoodleB.addActionListener(new ButtonHandler());
		selectNoodleB.setBounds(447, 300, 112, 112);
		selectNoodleB.setBorder(null);
		selectNoodleB.setOpaque(false);
		inputP.add(selectNoodleB);
		
		// 빵 선택 버튼
		selectBreadB = new JButton(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon nullImage =
						new ImageIcon("img/button/null.png");
				g.drawImage(nullImage.getImage(), 0, 0, 0, 0, null);
			}
		};
		selectBreadB.addActionListener(new ButtonHandler());
		selectBreadB.setBounds(502, 160, 112, 112);
		selectBreadB.setBorder(null);
		selectBreadB.setOpaque(false);
		inputP.add(selectBreadB);
		
		// 밥류 선택 버튼
		selectRiceB = new JButton(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon nullImage =
						new ImageIcon("img/button/null.png");
				g.drawImage(nullImage.getImage(), 0, 0, 0, 0, null);
			}
		};
		selectRiceB.addActionListener(new ButtonHandler());
		selectRiceB.setBounds(642, 84, 112, 112);
		selectRiceB.setBorder(null);
		selectRiceB.setOpaque(false);
		inputP.add(selectRiceB);
		
		// 기준점(동문, 서문) 콤보박스
		pointCmBx = new JComboBox<String>();
		pointCmBx.addItem("동문");
		pointCmBx.addItem("서문");
		pointCmBx.setBounds(280, 220, 130, 40);
		pointCmBx.setBackground(Color.WHITE);
		inputP.add(pointCmBx);
		
		// 면류 체크박스
		noodleCkBx = new JCheckBox("면류");
		noodleCkBx.setBounds(50, 290, 100, 40);
		noodleCkBx.setBackground(Color.WHITE);
		inputP.add(noodleCkBx);
		
		// 빵 체크박스
		breadCkBx = new JCheckBox("빵");
		breadCkBx.setBounds(180, 290, 100, 40);
		breadCkBx.setBackground(Color.WHITE);
		inputP.add(breadCkBx);
		
		// 밥류 체크박스
		riceCkBx = new JCheckBox("밥류");	
		riceCkBx.setBounds(310, 290, 100, 40);
		riceCkBx.setBackground(Color.WHITE);
		inputP.add(riceCkBx);
		
		// 가격 입력 텍스트필드
		priceTF = new JTextField();
		priceTF.setBounds(50, 360, 230, 40);
		inputP.add(priceTF);
		
		// 입력 버튼
		inputB = new JButton(){
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				ImageIcon inputBImage =
						new ImageIcon("img/button/inputB.png");
				g.drawImage(inputBImage.getImage(), 0, 0, 100, 40, null);
			}
		};
		inputB.addActionListener(new ButtonHandler());
		inputB.setBounds(310, 360, 100, 40);
		inputP.add(inputB);
		
		// 배치관리자-입력 화면 표시
		argCL.show(argP, "Input");
	}
	
	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// 동문 선택 버튼 처리
			if(ae.getSource() == selectDongGateB){
				pointCmBx.setSelectedItem("동문");
			}
			
			// 서문 선택 버튼 처리
			if(ae.getSource() == selectSeoGateB){
				pointCmBx.setSelectedItem("서문");
			}
			
			// 면류 선택 버튼 처리
			if(ae.getSource() == selectNoodleB){
				if(noodleCkBx.isSelected()){
					noodleCkBx.setSelected(false);
				}
				else{
					noodleCkBx.setSelected(true);
				}				
			}
			
			// 빵 선택 버튼 처리
			if(ae.getSource() == selectBreadB){
				if(breadCkBx.isSelected()){
					breadCkBx.setSelected(false);
				}
				else{
					breadCkBx.setSelected(true);
				}
			}
			
			// 밥류 선택 버튼 처리
			if(ae.getSource() == selectRiceB){
				if(riceCkBx.isSelected()){
					riceCkBx.setSelected(false);
				}
				else{
					riceCkBx.setSelected(true);
				}
			}
			
			// 입력 버튼 처리
			if(ae.getSource() == inputB){
				// 유저 선택값 객체 생성
				UserSelection objUS = new UserSelection();
				
				// 기준점 선택값 저장
				objUS.getSelection1(pointCmBx);
				
				// 음식군 선택값 저장
				objUS.getSelection2(noodleCkBx, breadCkBx, riceCkBx);
				
				// 가격대 선택값 저장
				objUS.getSelection3(priceTF);
				
				// log1
				//---------------저장된 값 콘솔에 출력------------------
				System.out.println("기준점 : " + objUS.selection1);
				System.out.println("음식군 : " + objUS.selection2);
				System.out.println("가격대 : " + objUS.selection3);
				System.out.println("------------------------------------------");
				//-----------------------------------------------
				
				// 음식 콜렉션 객체 생성
				FoodManager objFC = new FoodManager();
				
				// 음식 종류군에 따라 음식 생성
				if(objUS.selection2.contains("면류")){
					objFC.addNoddle();
				}
				if(objUS.selection2.contains("빵")){
					objFC.addBread();
				}
				if(objUS.selection2.contains("밥류")){
					objFC.addRice();
				}
				
				// 기타 음식군 생성
				objFC.addElse();
				
				// log2
				//------------음식 콜렉션 최초 사이즈 출력 & 콜렉션 안의 음식 확인----------------
				System.out.println("음식 콜렉션 최초 사이즈 : " + objFC.foodList.size());
				System.out.println();
				objFC.viewObj();
				System.out.println("------------------------------------------");
				//---------------------------------------------------------------
				
				// 기준점에 맞지 않는 음식 제거
				if(objUS.selection1 == "동문"){
					objFC.removeWest();
				}
				else if(objUS.selection1 == "서문"){
					objFC.removeEast();
				}
				
				// log3
				//----------기준점 적용 후 음식 콜렉션 사이즈 출력 & 콜렉션 안의 음식 확인---------------
				System.out.println("기준점 적용 후 콜렉션 사이즈 : " + objFC.foodList.size());
				System.out.println();
				objFC.viewObj();
				System.out.println("------------------------------------------");
				//-------------------------------------------------------------------
				
				// 가격(+-500)에 맞지않는 음식 제거
				objFC.removeOverPrice(objUS.selection3);
				
				//log4
				//----------가격대 적용 후 음식 콜렉션 사이즈 출력 & 콜렉션 안의 음식 확인---------------
				System.out.println("가격대 적용 후 콜렉션 사이즈 : " + objFC.foodList.size());
				System.out.println();
				objFC.viewObj();
				System.out.println("------------------------------------------");
				//-------------------------------------------------------------------
				
				// 콜라를 제외한 음식이 있을 경우 콜라 제거
				objFC.removeCoke();
				
				//log5
				//----------콜라 제거 후 음식 콜렉션 사이즈 출력 & 콜렉션 안의 음식 확인---------------
				System.out.println("콜라 제거 후 콜렉션 사이즈 : " + objFC.foodList.size());
				System.out.println();
				objFC.viewObj();
				System.out.println("------------------------------------------");
				//-------------------------------------------------------------------
				
				// 남은 음식중 랜덤하게 하나 선택		
				selectedFood = objFC.randomFoodSelect();
				
				// 결과 화면 패널 생성&출력
				CountDown objCD = new CountDown();
				objCD.start();
			}
		}
	}
	
	public class CountDown extends Thread{		
		JPanel countP;			// 카운트다운 화면 패널
		JLabel countImageL;		// 카운트다운 이미지 라벨
		
		ImageIcon count1Image;	// 카운트1 이미지
		ImageIcon count2Image;	// 카운트2 이미지
		ImageIcon count3Image;	// 카운트3 이미지
		
		public void run(){
			// 카운트다운 화면 패널
			countP = new JPanel();
			countP.setBounds(0, 0, 800, 450);
			countP.setLayout(null);
			argP.add(countP, "Count");
			
			// 카운트다운 이미지 라벨
			countImageL = new JLabel();
			countImageL.setBounds(0, 0, 800, 450);
			countP.add(countImageL);
			
			// 카운트 이미지들
			count1Image = new ImageIcon("img/count/1.png");
			count2Image = new ImageIcon("img/count/2.png");
			count3Image = new ImageIcon("img/count/3.png");
			
			// 이미지 교체
			for(int i = 3; i > 0; i--){
				if(i == 3){
					countImageL.setIcon(count3Image);
				}
				if(i == 2){
					countImageL.setIcon(count2Image);	
				}
				if(i == 1){
					countImageL.setIcon(count1Image);
				}
				
				argCL.show(argP, "Count");
				
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			Panel3 objP3 = new Panel3();
			objP3.create(argP, argCL, selectedFood);
		}
	}
}