import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel1 {
	JPanel startP;			// 스타트 화면 패널
	JButton programStartB;	// 프로그램 스타트 버튼
	ImageIcon startImage;
	
	JPanel argP;
	CardLayout argCL;
	
	int flag = 1;			// 쓰레드 종료 플래그

	public void create(JPanel argP, CardLayout argCL){
		this.argP = argP;
		this.argCL = argCL;
		
		// 스타트 화면 패널
		startP = new JPanel();
		startP.setBounds(0, 0, 800, 450);
		startP.setLayout(null);
		argP.add(startP, "Start");
		
		// 스타트 화면 깜빡임 쓰레드 실행
		Flashing objFsh = new Flashing();
		objFsh.start();
		
		// 배치관리자-스타트 화면 표시
		argCL.show(argP, "Start");
	}
	
	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			flag = 0;	// 쓰레드 종료
			
			// 입력 화면 패널 생성&출력			
			Panel2 objP2 = new Panel2();
			objP2.create(argP, argCL);
		}
	}
	
	public class Flashing extends Thread{	
		ImageIcon startImage1 =
				new ImageIcon("img/screen/start1.png");	// 스타트 화면 이미지1
		ImageIcon startImage2 =
				new ImageIcon("img/screen/start2.png");	// 스타트 화면 이미지2
		
		public void run(){			
			while(flag == 1){
				startP.setVisible(false);
				
				// 이미지를 번갈아가며 출력
				if(startImage == null){
					startImage = startImage1;
				}
				else if(startImage.equals(startImage1)){
					startImage = startImage2;
				}
				else if(startImage.equals(startImage2)){
					startImage = startImage1;
				}
				
				System.out.println("Flashing 쓰레드 on");	// 쓰레드 생존 확인용
				
				// 프로그램 스타트 버튼
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