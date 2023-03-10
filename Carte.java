import java.util.Objects;
//ex2
public class Carte {

private float nrPagini;

public Carte(int nrPagini) {
	this.nrPagini = nrPagini;
}

public Carte(float nrPagini) {
	this.nrPagini = nrPagini;
}

public boolean equals(Carte p) {
	if(this.nrPagini==p.nrPagini) return true;
	else return false;}

}
