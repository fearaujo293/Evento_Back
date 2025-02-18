package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entidades.Categoria_Domain;
@Repository
public interface Categoria_Repository extends JpaRepository <Categoria_Domain, Long>{

}
