package polymorphism;

public class Main {

	public static void main(String[] args) {

		Duck d = new Duck();
		Sparrow s = new Sparrow();
		Eagle e = new Eagle();

		Object mas[] = new Object[3];
		mas[0] = d;
		mas[1] = s;
		mas[2] = e;

		d.fly();
		s.fly();
		e.fly();
	}

}
