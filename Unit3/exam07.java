
public class exam07 {

	public static void main(String[] args) {
		Car myCar1=new Car("����",0);
		Car myCar2=new Car("�Ķ�",0);
		Car myCar3=new Car("�ʷ�",0);
		
		
		myCar1.upSpeed(50);
		System.out.println("�ڵ���1�� ������ "+myCar1.getColor()+"�̸�, �ӵ��� "+myCar1.getSpeed()+"km�Դϴ�.");
		myCar2.downSpeed(20);
		System.out.println("�ڵ���2�� ������ "+myCar2.getColor()+"�̸�, �ӵ��� "+myCar2.getSpeed()+"km�Դϴ�.");
		myCar3.upSpeed(250);
		System.out.println("�ڵ���3�� ������ "+myCar3.getColor()+"�̸�, �ӵ��� "+myCar3.getSpeed()+"km�Դϴ�.");
	}

}