
public class StartManager {	
	public static void main(String[] args){
		// ���� ������ ����&���
		MainFrame objMF = new MainFrame();
		
		// ��ŸƮ ȭ�� �г� ����&���
		Panel1 objP1 = new Panel1();
		objP1.create(objMF.mainP, objMF.cards);
	}	
}