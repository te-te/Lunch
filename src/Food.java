import javax.swing.*;

public class Food {	
	String name;		// 음식 이름
	int price;			// 음식 가격
	ImageIcon image;	// 음식 이미지
	String point;		// 기준점이 되는 장소 (동문, 서문)
	String shop;		// 판매점
	String distance;	// 판매점까지의 대략적인 거리
	
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