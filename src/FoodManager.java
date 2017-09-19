import java.util.*;
import javax.swing.*;

public class FoodManager {
	ArrayList<Food> foodList =
			new ArrayList<Food>();	// ���� ��ü�� ���� �ݷ���
	Iterator<Food> Itr;

	// ��� �߰� �޼���
	public void addNoddle(){
		Food ramenbab = new Food("��� + ��", 2500, new ImageIcon("img/food/ramenbab.jpg"),
				"����", "�����н�", "���� 1��");
		foodList.add(ramenbab);
	}
	
	// �� �߰� �޼���
	public void addBread(){
		Food hamburger = new Food("���̹��� ��Ʈ", 5400, new ImageIcon("img/food/psy.jpg"),
				"����", "������ġ", "���� 3��");
		foodList.add(hamburger);
	}
	
	// ��� �߰� �޼���
	public void addRice(){
		Food dosirac = new Food("��� ���ô� ���ö�", 3400, new ImageIcon("img/food/ddd.jpg"),
				"����", "�Ѽ�", "���� 5��");
		foodList.add(dosirac);
		
		Food babbg = new Food("��ġ ���� �����", 2600, new ImageIcon("img/food/babbg.jpg"),
				"����", "������ �����", "���� 3��");
		foodList.add(babbg);
	}
	
	// ��Ÿ ���� �߰� �޼���
	public void addElse(){
		Food cola = new Food("�ݶ�", 900, new ImageIcon("img/food/cola.jpg"),
				"����", "���Ǳ�", "���� 1��");
		foodList.add(cola);
	}
	
	// ���� ���� ���� �޼���
	public void removeWest(){
		Itr = foodList.iterator();
		
		while(Itr.hasNext()){
			Food objFood = (Food)Itr.next();
			if(objFood.point == "����"){
				foodList.remove(objFood);
				Itr = foodList.iterator();
			}
		}
	}
	
	// ���� ���� ���� �޼���
	public void removeEast(){
		Itr = foodList.iterator();
		
		while(Itr.hasNext()){
			Food objFood = (Food)Itr.next();
			if(objFood.point == "����"){
				foodList.remove(objFood);
				Itr = foodList.iterator();
			}
		}
	}
	
	// ����(+-500) �̸�, �ʰ� ���� ���� �޼��� (�� �ݶ� ����)
	public void removeOverPrice(int argPrice){		
		Itr = foodList.iterator();
		
		while(Itr.hasNext()){
			Food objFood = (Food)Itr.next();
			if(objFood.name != "�ݶ�" &&
					(objFood.price < (argPrice - 500) ||
							objFood.price > (argPrice + 500))){
				foodList.remove(objFood);
				Itr = foodList.iterator();
			}			
		}
	}
	
	// �ݶ� ������ ������ ���� ��� �ݶ� ����
	public void removeCoke(){
		if(foodList.size() != 1){
			Itr = foodList.iterator();
			
			while(Itr.hasNext()){
				Food objFood = (Food)Itr.next();
				if(objFood.name == "�ݶ�"){
					foodList.remove(objFood);
					Itr = foodList.iterator();
				}
			}			
		}
	}
	
	// ���� ���� �� ������ ���� ���� �޼���
	public Food randomFoodSelect(){		
		int randomIndex = (int)(Math.random() * foodList.size());		
		Food selectedFood = foodList.get(randomIndex);
		
		return selectedFood;
	}
	
	// �ݷ��� ���� ���� Ȯ��
	public void viewObj(){
		for(int i = 0; i < foodList.size(); i++){
			Food objFood = foodList.get(i);
			System.out.println(objFood.name + " / " +
					objFood.price + " / " + objFood.point);
		}
	}
}