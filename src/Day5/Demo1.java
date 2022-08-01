package Day5;

class A {

	void m1() {

		System.out.println("m1 of A");
	}

}

class B extends A {

	void m1() {

		System.out.println("m1 of B");
	}

}

public class Demo1 {

	public static void main(String[] args) {

		A a1 = new B();
		a1.m1();

	}

}
