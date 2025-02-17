package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Services.Horário;

@Repository
public interface Horario_Repository extends JpaRepository<Horário, Long> {

	static Horário save(Horario_Repository horariorepository) {
		// TODO Auto-generated method stub
		return null;
	}}
