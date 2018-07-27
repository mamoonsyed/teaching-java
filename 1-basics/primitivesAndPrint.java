//main class
class BasicsDemo {
	
	// print examples
	static void print() {
		System.out.println("\n\nInside print ...");
		System.out.println("Hellow, world!!");
		System.out.println();
		System.out.println("Hello, World!!");
		System.out.println("Hello,");
		System.out.println(" ");
		System.out.println("world!!");
	}

	// primitive datatypes
	static void primitives() {

		// literals demo
		System.out.println("\n\nInside primitives ...");

		// integer examples
		byte b = 100;
		short s = 1000;
		int i = -10000;
		long l = 1000000L; // L required when value above int range.

		// number 65 in different forms
		int intHex = 0x0041;
		int intBinary = 0b01000001;
		int intUnderscore = 1_23_456; // new feature of java7 for readability

		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);

		System.out.println("intHex: " + intHex);
		System.out.println("intBinary: " + intBinary);
		System.out.println("intUnderscore: " + intUnderscore)
	}

	// This is the main test harness
	public static void main(String[] args) {
		print();
		primitives();
	}

}