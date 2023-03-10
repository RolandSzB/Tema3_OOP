
public class Suma {
	
	private int a;
	private int b;
	private int c;
	private int d;
	
   public Suma(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public static int suma(int a, int b) {
		System.out.println(a+b);
		return a+b;
		}
	public static int suma(int a, int b,int c) {
		System.out.println(a+b+c);
		return a+b+c;
		}
	public static int suma(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
		return a+b+c+d;
		}
	
}
