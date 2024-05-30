public class DemoMethod {

	public void print() {
		System.out.println("Playing football");
	}
	
	public int sum() {
		return 2+78;
	}
	public String printWord(String name) {
		return name;
	}
	public static void main(String[] args) {
		DemoMethod dem = new DemoMethod();
		dem.print();
		System.out.println(dem.sum());
		System.out.println(dem.printWord("Mahadev"));
		
	}
}