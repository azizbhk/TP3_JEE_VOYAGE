package agence;

import java.util.List;
public interface IagenceCatalogue {
public List<voyage> getvoyagesParMotCle(String mc);
public void addVoyage(voyage v);
}