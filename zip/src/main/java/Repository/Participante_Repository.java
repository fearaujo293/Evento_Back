package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entidades.Participante_Domain;
@Repository
public interface Participante_Repository extends JpaRepository<Participante_Domain, Long>  {

}
