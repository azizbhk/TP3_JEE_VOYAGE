package agence;
import java.util.List;
public class TestAgence {

	public static void main(String[] args) {
		AgenceImpl agence= new AgenceImpl();
		List<voyage> voyageurs = voyage.getvoyagesParMotCle("PARIS");
		for (voyage v : voyageurs)
		System.out.println(v.getNomvoyage());
		}
		}