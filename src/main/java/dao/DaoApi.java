package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("daiAPI")  // Déclare cette classe comme un bean Spring avec l'identifiant "dao2"
@Profile("api")  // Ce bean sera actif uniquement avec le profil "dev"
public class DaoApi implements IDao {
    @Override
    public double getValue() {
        // Cette implémentation alternative retourne 150.0
        return 220.0;
    }
}