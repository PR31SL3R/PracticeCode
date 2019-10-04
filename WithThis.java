public class WithThis {

	int coin;

//Constructor
	WithThis() {
		this(100);
		System.out.print("This is the non-parameter constructor\n");
	}

//Constructor
	private WithThis(int coin) {
		this.coin += coin;
		System.out.print("This is the parameter constructor\n");
	}

//Piggybank method
	public void piggyBank(int coin) {
		this.coin += coin;
		System.out.println("Piggybank now holds a avalue of " + this.coin);
	}

	public static void main(String[] args) {

		WithThis piggyBank = new WithThis();
		piggyBank.piggyBank(10);
		piggyBank.piggyBank(20);
		piggyBank.piggyBank(5);
		piggyBank.piggyBank(2);

	}
}