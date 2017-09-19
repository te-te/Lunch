import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel1 {
	JPanel startP;			// ��ŸƮ ȭ�� �г�
	JButton programStartB;	// ���α׷� ��ŸƮ ��ư
	ImageIcon startImage;
	
	JPanel argP;
	CardLayout argCL;
	
	int flag = 1;			// ������ ���� �÷���

	public void create(JPanel argP, CardLayout argCL){
		this.argP = argP;
		this.argCL = argCL;
		
		// ��ŸƮ ȭ�� �г�
		startP = new JPanel();
		startP.setBounds(0, 0, 800, 450);
		startP.setLayout(null);
		argP.add(startP, "Start");
		
		// ��ŸƮ ȭ�� ������ ������ ����
		Flashing objFsh = new Flashing();
		objFsh.start();
		
		// ��ġ������-��ŸƮ ȭ�� ǥ��
		argCL.show(argP, "Start");
	}
	
	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			flag = 0;	// ������ ����
			
			// �Է� ȭ�� �г� ����&���			
			Panel2 objP2 = new Panel2();
			objP2.create(argP, argCL);
		}
	}
	
	public class Flashing extends Thread{	
		ImageIcon startImage1 =
				new ImageIcon("img/screen/start1.png");	// ��ŸƮ ȭ�� �̹���1
		ImageIcon startImage2 =
				new ImageIcon("img/screen/start2.png");	// ��ŸƮ ȭ�� �̹���2
		
		public void run(){			
			while(flag == 1){
				startP.setVisible(false);
				
				// �̹����� �����ư��� ���
				if(startImage == null){
					startImage = startImage1;
				}
				else if(startImage.equals(startImage1)){
					startImage = startImage2;
				}
				else if(startImage.equals(startImage2)){
					startImage = startImage1;
				}
				
				System.out.println("Flashing ������ on");	// ������ ���� Ȯ�ο�
				
				// ���α׷� ��ŸƮ ��ư
				programStartB = new JButton(){
					private static final long serialVersionUID = 1L;

					public void paintComponent(Graphics g){
						g.drawImage(startImage.getImage(), 0, 0, 800, 450, null);
					}
				};
				programStartB.addActionListener(new ButtonHandler());
				programStartB.setBounds(0, 0, 800, 450);
				programStartB.setBorder(null);
				startP.add(programStartB);
				
				startP.setVisible(true);
				
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}