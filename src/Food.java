import javax.swing.*;

public class Food {	
	String name;		// ���� �̸�
	int price;			// ���� ����
	ImageIcon image;	// ���� �̹���
	String point;		// �������� �Ǵ� ��� (����, ����)
	String shop;		// �Ǹ���
	String distance;	// �Ǹ��������� �뷫���� �Ÿ�
	
	public Food(String argName, int argPrice, ImageIcon argImage,
			String argPoint, String argShop, String argDistance){
		name = argName;
		price = argPrice;
		image = argImage;
		point = argPoint;
		shop = argShop;
		distance = argDistance;
	}
}