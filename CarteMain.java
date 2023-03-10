
public class CarteMain {
//Ex2
	public static void main(String[] args) {
  Carte c1 = new Carte(20);
  Carte c2= new Carte(20);
	
	if (c1.equals(c2))
		   System.out.println("Cartele sunt identice");
	   else
		   System.out.println("Cartele nu sunt identice");

}
}