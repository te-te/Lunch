import java.util.*;
import javax.swing.*;

public class UserSelection {
	Object selection1;					// 기준점 선택값 (동문, 서문)
	ArrayList<String> selection2 =
			new ArrayList<String>();	// 음식 종류 선택값 (면류, 빵, 밥류)	
	int selection3;						// 가격 입력값
	
	// 선택값1 Getter
	public void getSelection1(JComboBox<String> argCmBx){
		selection1 = argCmBx.getSelectedItem();
	}
	
	// 선택값2 Getter
	public void getSelection2(JCheckBox argCkBx1, JCheckBox argCkBx2, JCheckBox argCkBx3){
		if(argCkBx1.isSelected()){
			selection2.add(argCkBx1.getText());
		}
		if(argCkBx2.isSelected()){
			selection2.add(argCkBx2.getText());				
		}
		if(argCkBx3.isSelected()){
			selection2.add(argCkBx3.getText());
		}
	}
	
	// 선택값3 Getter
	public void getSelection3(JTextField argTF){
		String tempValue;
		
		// 입력값이 없을 경우 0 처리
		if(argTF.getText().equals("")){
			tempValue = "0";
		}
		else{
			tempValue = argTF.getText(); 
		}
		
		// 숫자 범위를 초과하거나 하면 0으로 처리
		try{
			selection3 = Integer.parseInt(tempValue);
		}
		catch(NumberFormatException e){
			selection3 = 0;
		}
	}
}
