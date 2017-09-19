import java.util.*;
import javax.swing.*;

public class UserSelection {
	Object selection1;					// ������ ���ð� (����, ����)
	ArrayList<String> selection2 =
			new ArrayList<String>();	// ���� ���� ���ð� (���, ��, ���)	
	int selection3;						// ���� �Է°�
	
	// ���ð�1 Getter
	public void getSelection1(JComboBox<String> argCmBx){
		selection1 = argCmBx.getSelectedItem();
	}
	
	// ���ð�2 Getter
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
	
	// ���ð�3 Getter
	public void getSelection3(JTextField argTF){
		String tempValue;
		
		// �Է°��� ���� ��� 0 ó��
		if(argTF.getText().equals("")){
			tempValue = "0";
		}
		else{
			tempValue = argTF.getText(); 
		}
		
		// ���� ������ �ʰ��ϰų� �ϸ� 0���� ó��
		try{
			selection3 = Integer.parseInt(tempValue);
		}
		catch(NumberFormatException e){
			selection3 = 0;
		}
	}
}
