package chapter08.Animal;

public abstract class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------------------");
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("---------------------");
		//�żҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();

	}

}