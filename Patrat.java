
public class Patrat {
//Ex3
	private int latura;
	private int aria;

public  Patrat() {
	this.latura = 0;
}

public Patrat(int latura) {
	this.latura = latura;
}

@Override
public String toString() {
	aria= 4*latura;
	System.out.println("Patrat =" + latura + " Aria "+aria);
return "Patrat =" + latura + " Aria "+aria;
}


}
