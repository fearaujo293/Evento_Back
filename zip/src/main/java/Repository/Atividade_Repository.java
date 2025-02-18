package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entidades.Atividade_Domain;
@Repository
public interface Atividade_Repository extends JpaRepository<Atividade_Domain, Long> {

}
