interface iAnimal{
	abstract void eat();
}
public class exam12 {
 public static void main(String args[]) {
	 iCat cat=new iCat();
	 cat.eat();
	 
	 iTiger tiger = new iTiger();
	 tiger.move();
	 tiger.eat();
 }
 static class iCat implements iAnimal{
	 public void eat() {
		 System.out.println("������ �Դ´�.");
	 }
 }
 static class iTiger extends Animal implements iAnimal {
	 void move() {
		 System.out.println("�� �߷� �̵��Ѵ�.");
	 }
	 public void eat() {
		 System.out.println("������� ��ƸԴ´�.");
	 }
 }
}
