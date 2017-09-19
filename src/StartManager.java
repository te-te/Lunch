
public class StartManager {	
	public static void main(String[] args){
		// 메인 프레임 생성&출력
		MainFrame objMF = new MainFrame();
		
		// 스타트 화면 패널 생성&출력
		Panel1 objP1 = new Panel1();
		objP1.create(objMF.mainP, objMF.cards);
	}	
}