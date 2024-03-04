package agence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgenceImpl implements IagenceCatalogue {
@Override
public List<voyage> getvoyagesParMotCle(String mc) {
List<voyage> prods= new ArrayList<voyage>();
Connection conn=SingletonConnection.getConnection();
try {
PreparedStatement ps= conn.prepareStatement("select * from PRODUITS where NOM_PRODUIT LIKE ?");
ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
voyage p = new voyage();
p.setIdvoyage(rs.getLong("ID_VOYAGE"));
p.setNomvoyage(rs.getString("NOM_VOYAGE"));
p.setPrix(rs.getDouble("PRIX"));
prods.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return prods;
}
@Override
public void addVoyage(voyage p) {
// TODO Auto-generated method stub
}
}