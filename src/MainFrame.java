import java.awt.*;
import javax.swing.*;

public class MainFrame {
	JFrame mainF;		// 메인 프레임
	JPanel mainP;		// 메인 패널
	CardLayout cards;	// 배치관리자
	
	Container ctp;		// 컨텐트펜을 저장할 변수
	Toolkit tk;
	Dimension screenSize;
	
	public MainFrame(){
		// 메인 프레임
		mainF = new JFrame("점심으로 무엇을 먹을까?");
		ctp = mainF.getContentPane();
		tk = Toolkit.getDefaultToolkit();				// 그래픽 자원 관련
														// 시스템 정보를 가진 객체
		screenSize = tk.getScreenSize();				// 화면 크기
		mainF.setBounds(screenSize.width/2 - 403,
				screenSize.height/2 - 239, 806, 478);	// 모니터의 중앙에 출력
		
		// 메인 패널 (CardLayout 배치관리자를 사용하기 위해)
		mainP = new JPanel();
		mainP.setBounds(0, 0, 800, 450);
		mainF.add(mainP);
		
		// CardLayout 배치관리자
		cards = new CardLayout();
		mainP.setLayout(cards);
		
		// 크기 조절 불가 & 창닫기-실행종료 설정
		// Visible 설정		
		mainF.setResizable(false);
		mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainF.setVisible(true);
	}
}