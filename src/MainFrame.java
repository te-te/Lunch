import java.awt.*;
import javax.swing.*;

public class MainFrame {
	JFrame mainF;		// ���� ������
	JPanel mainP;		// ���� �г�
	CardLayout cards;	// ��ġ������
	
	Container ctp;		// ����Ʈ���� ������ ����
	Toolkit tk;
	Dimension screenSize;
	
	public MainFrame(){
		// ���� ������
		mainF = new JFrame("�������� ������ ������?");
		ctp = mainF.getContentPane();
		tk = Toolkit.getDefaultToolkit();				// �׷��� �ڿ� ����
														// �ý��� ������ ���� ��ü
		screenSize = tk.getScreenSize();				// ȭ�� ũ��
		mainF.setBounds(screenSize.width/2 - 403,
				screenSize.height/2 - 239, 806, 478);	// ������� �߾ӿ� ���
		
		// ���� �г� (CardLayout ��ġ�����ڸ� ����ϱ� ����)
		mainP = new JPanel();
		mainP.setBounds(0, 0, 800, 450);
		mainF.add(mainP);
		
		// CardLayout ��ġ������
		cards = new CardLayout();
		mainP.setLayout(cards);
		
		// ũ�� ���� �Ұ� & â�ݱ�-�������� ����
		// Visible ����		
		mainF.setResizable(false);
		mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainF.setVisible(true);
	}
}