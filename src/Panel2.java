import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel2 {
	JPanel inputP;					// �Է� ȭ�� �г�
	JComboBox<String> pointCmBx;	// �������� �Ǵ� ��� (����, ����)
	JCheckBox noodleCkBx;			// ���
	JCheckBox breadCkBx;			// ��
	JCheckBox riceCkBx;				// ���
	JTextField priceTF;				// ���� �Է�ĭ
	JButton inputB;					// �Է� ��ư	
	
	JButton selectDongGateB;		// ���� ���� ��ư
	JButton selectSeoGateB;			// ���� ���� ��ư
	JButton selectNoodleB;			// ��� ���� ��ư
	JButton selectBreadB;			// �� ���� ��ư
	JButton selectRiceB;			// ��� ���� ��ư
	
	JPanel argP;
	CardLayout argCL;
	
	Food selectedFood;				// ���������� ���õ� ����
	
	public void create(JPanel argP, CardLayout argCL){
		this.argP = argP;
		this.argCL = argCL;
		
		// �Է� ȭ�� �г�
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
		
		// ���� ���� ��ư
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
		
		// ���� ���� ��ư
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
		
		// ��� ���� ��ư
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
		
		// �� ���� ��ư
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
		
		// ��� ���� ��ư
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
		
		// ������(����, ����) �޺��ڽ�
		pointCmBx = new JComboBox<String>();
		pointCmBx.addItem("����");
		pointCmBx.addItem("����");
		pointCmBx.setBounds(280, 220, 130, 40);
		pointCmBx.setBackground(Color.WHITE);
		inputP.add(pointCmBx);
		
		// ��� üũ�ڽ�
		noodleCkBx = new JCheckBox("���");
		noodleCkBx.setBounds(50, 290, 100, 40);
		noodleCkBx.setBackground(Color.WHITE);
		inputP.add(noodleCkBx);
		
		// �� üũ�ڽ�
		breadCkBx = new JCheckBox("��");
		breadCkBx.setBounds(180, 290, 100, 40);
		breadCkBx.setBackground(Color.WHITE);
		inputP.add(breadCkBx);
		
		// ��� üũ�ڽ�
		riceCkBx = new JCheckBox("���");	
		riceCkBx.setBounds(310, 290, 100, 40);
		riceCkBx.setBackground(Color.WHITE);
		inputP.add(riceCkBx);
		
		// ���� �Է� �ؽ�Ʈ�ʵ�
		priceTF = new JTextField();
		priceTF.setBounds(50, 360, 230, 40);
		inputP.add(priceTF);
		
		// �Է� ��ư
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
		
		// ��ġ������-�Է� ȭ�� ǥ��
		argCL.show(argP, "Input");
	}
	
	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// ���� ���� ��ư ó��
			if(ae.getSource() == selectDongGateB){
				pointCmBx.setSelectedItem("����");
			}
			
			// ���� ���� ��ư ó��
			if(ae.getSource() == selectSeoGateB){
				pointCmBx.setSelectedItem("����");
			}
			
			// ��� ���� ��ư ó��
			if(ae.getSource() == selectNoodleB){
				if(noodleCkBx.isSelected()){
					noodleCkBx.setSelected(false);
				}
				else{
					noodleCkBx.setSelected(true);
				}				
			}
			
			// �� ���� ��ư ó��
			if(ae.getSource() == selectBreadB){
				if(breadCkBx.isSelected()){
					breadCkBx.setSelected(false);
				}
				else{
					breadCkBx.setSelected(true);
				}
			}
			
			// ��� ���� ��ư ó��
			if(ae.getSource() == selectRiceB){
				if(riceCkBx.isSelected()){
					riceCkBx.setSelected(false);
				}
				else{
					riceCkBx.setSelected(true);
				}
			}
			
			// �Է� ��ư ó��
			if(ae.getSource() == inputB){
				// ���� ���ð� ��ü ����
				UserSelection objUS = new UserSelection();
				
				// ������ ���ð� ����
				objUS.getSelection1(pointCmBx);
				
				// ���ı� ���ð� ����
				objUS.getSelection2(noodleCkBx, breadCkBx, riceCkBx);
				
				// ���ݴ� ���ð� ����
				objUS.getSelection3(priceTF);
				
				// log1
				//---------------����� �� �ֿܼ� ���------------------
				System.out.println("������ : " + objUS.selection1);
				System.out.println("���ı� : " + objUS.selection2);
				System.out.println("���ݴ� : " + objUS.selection3);
				System.out.println("------------------------------------------");
				//-----------------------------------------------
				
				// ���� �ݷ��� ��ü ����
				FoodManager objFC = new FoodManager();
				
				// ���� �������� ���� ���� ����
				if(objUS.selection2.contains("���")){
					objFC.addNoddle();
				}
				if(objUS.selection2.contains("��")){
					objFC.addBread();
				}
				if(objUS.selection2.contains("���")){
					objFC.addRice();
				}
				
				// ��Ÿ ���ı� ����
				objFC.addElse();
				
				// log2
				//------------���� �ݷ��� ���� ������ ��� & �ݷ��� ���� ���� Ȯ��----------------
				System.out.println("���� �ݷ��� ���� ������ : " + objFC.foodList.size());
				System.out.println();
				objFC.viewObj();
				System.out.println("------------------------------------------");
				//---------------------------------------------------------------
				
				// �������� ���� �ʴ� ���� ����
				if(objUS.selection1 == "����"){
					objFC.removeWest();
				}
				else if(objUS.selection1 == "����"){
					objFC.removeEast();
				}
				
				// log3
				//----------������ ���� �� ���� �ݷ��� ������ ��� & �ݷ��� ���� ���� Ȯ��---------------
				System.out.println("������ ���� �� �ݷ��� ������ : " + objFC.foodList.size());
				System.out.println();
				objFC.viewObj();
				System.out.println("------------------------------------------");
				//-------------------------------------------------------------------
				
				// ����(+-500)�� �����ʴ� ���� ����
				objFC.removeOverPrice(objUS.selection3);
				
				//log4
				//----------���ݴ� ���� �� ���� �ݷ��� ������ ��� & �ݷ��� ���� ���� Ȯ��---------------
				System.out.println("���ݴ� ���� �� �ݷ��� ������ : " + objFC.foodList.size());
				System.out.println();
				objFC.viewObj();
				System.out.println("------------------------------------------");
				//-------------------------------------------------------------------
				
				// �ݶ� ������ ������ ���� ��� �ݶ� ����
				objFC.removeCoke();
				
				//log5
				//----------�ݶ� ���� �� ���� �ݷ��� ������ ��� & �ݷ��� ���� ���� Ȯ��---------------
				System.out.println("�ݶ� ���� �� �ݷ��� ������ : " + objFC.foodList.size());
				System.out.println();
				objFC.viewObj();
				System.out.println("------------------------------------------");
				//-------------------------------------------------------------------
				
				// ���� ������ �����ϰ� �ϳ� ����		
				selectedFood = objFC.randomFoodSelect();
				
				// ��� ȭ�� �г� ����&���
				CountDown objCD = new CountDown();
				objCD.start();
			}
		}
	}
	
	public class CountDown extends Thread{		
		JPanel countP;			// ī��Ʈ�ٿ� ȭ�� �г�
		JLabel countImageL;		// ī��Ʈ�ٿ� �̹��� ��
		
		ImageIcon count1Image;	// ī��Ʈ1 �̹���
		ImageIcon count2Image;	// ī��Ʈ2 �̹���
		ImageIcon count3Image;	// ī��Ʈ3 �̹���
		
		public void run(){
			// ī��Ʈ�ٿ� ȭ�� �г�
			countP = new JPanel();
			countP.setBounds(0, 0, 800, 450);
			countP.setLayout(null);
			argP.add(countP, "Count");
			
			// ī��Ʈ�ٿ� �̹��� ��
			countImageL = new JLabel();
			countImageL.setBounds(0, 0, 800, 450);
			countP.add(countImageL);
			
			// ī��Ʈ �̹�����
			count1Image = new ImageIcon("img/count/1.png");
			count2Image = new ImageIcon("img/count/2.png");
			count3Image = new ImageIcon("img/count/3.png");
			
			// �̹��� ��ü
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