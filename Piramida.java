
public class Piramida {

	private int n;
	private int m;

	public Piramida ( int n) {
		this.n=n;
		this.m=n;
		}
		
	public void afisare() {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m ;j++)
		System.out.print(i + " ");
		System.out.println(); m--;
			}  
	}
}
