abstract class Pen{
    // we can't create static and final methods in java
	protected abstract void write();    // protected method
	abstract void refil();  // by default public and abstract methods
}

class Main extends Pen {
	protected void write(){
		System.out.println("Iam pen ,on work iam writing.");
	}
	void refil(){
		System.out.println("iam pen,my ink as b compleled so refil me");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main p = new Main();
		p.write();
		p.refil();
	}
}
