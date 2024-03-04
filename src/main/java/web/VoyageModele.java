package web;


import java.util.ArrayList;
import java.util.List;
import agence.voyage;
public class VoyageModele {
private String motCle;
List<voyage> voyages = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<voyage> getProduits() {
return voyages;
}
public void setProduits(List<voyage> voyages) {
this.voyages = voyages;
}
}