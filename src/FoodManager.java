import java.util.*;
import javax.swing.*;

public class FoodManager {
	ArrayList<Food> foodList =
			new ArrayList<Food>();	// 음식 객체를 담을 콜렉션
	Iterator<Food> Itr;

	// 면류 추가 메서드
	public void addNoddle(){
		Food ramenbab = new Food("라면 + 밥", 2500, new ImageIcon("img/food/ramenbab.jpg"),
				"본관", "본관학식", "도보 1분");
		foodList.add(ramenbab);
	}
	
	// 빵 추가 메서드
	public void addBread(){
		Food hamburger = new Food("싸이버거 세트", 5400, new ImageIcon("img/food/psy.jpg"),
				"동문", "맘스터치", "도보 3분");
		foodList.add(hamburger);
	}
	
	// 밥류 추가 메서드
	public void addRice(){
		Food dosirac = new Food("돈까스 도련님 도시락", 3400, new ImageIcon("img/food/ddd.jpg"),
				"서문", "한솥", "도보 5분");
		foodList.add(dosirac);
		
		Food babbg = new Food("김치 제육 밥버거", 2600, new ImageIcon("img/food/babbg.jpg"),
				"동문", "봉구스 밥버거", "도보 3분");
		foodList.add(babbg);
	}
	
	// 기타 음식 추가 메서드
	public void addElse(){
		Food cola = new Food("콜라", 900, new ImageIcon("img/food/cola.jpg"),
				"본관", "자판기", "도보 1분");
		foodList.add(cola);
	}
	
	// 서문 음식 제거 메서드
	public void removeWest(){
		Itr = foodList.iterator();
		
		while(Itr.hasNext()){
			Food objFood = (Food)Itr.next();
			if(objFood.point == "서문"){
				foodList.remove(objFood);
				Itr = foodList.iterator();
			}
		}
	}
	
	// 동문 음식 제거 메서드
	public void removeEast(){
		Itr = foodList.iterator();
		
		while(Itr.hasNext()){
			Food objFood = (Food)Itr.next();
			if(objFood.point == "동문"){
				foodList.remove(objFood);
				Itr = foodList.iterator();
			}
		}
	}
	
	// 가격(+-500) 미만, 초과 음식 제거 메서드 (※ 콜라 제외)
	public void removeOverPrice(int argPrice){		
		Itr = foodList.iterator();
		
		while(Itr.hasNext()){
			Food objFood = (Food)Itr.next();
			if(objFood.name != "콜라" &&
					(objFood.price < (argPrice - 500) ||
							objFood.price > (argPrice + 500))){
				foodList.remove(objFood);
				Itr = foodList.iterator();
			}			
		}
	}
	
	// 콜라를 제외한 음식이 있을 경우 콜라 제거
	public void removeCoke(){
		if(foodList.size() != 1){
			Itr = foodList.iterator();
			
			while(Itr.hasNext()){
				Food objFood = (Food)Itr.next();
				if(objFood.name == "콜라"){
					foodList.remove(objFood);
					Itr = foodList.iterator();
				}
			}			
		}
	}
	
	// 남은 음식 중 랜덤한 음식 선택 메서드
	public Food randomFoodSelect(){		
		int randomIndex = (int)(Math.random() * foodList.size());		
		Food selectedFood = foodList.get(randomIndex);
		
		return selectedFood;
	}
	
	// 콜렉션 안의 음식 확인
	public void viewObj(){
		for(int i = 0; i < foodList.size(); i++){
			Food objFood = foodList.get(i);
			System.out.println(objFood.name + " / " +
					objFood.price + " / " + objFood.point);
		}
	}
}