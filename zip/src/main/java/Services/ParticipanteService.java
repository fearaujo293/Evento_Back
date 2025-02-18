//package Services;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import Model.Participante;
//import Repository.Participante_Repository;
//
//@Service
//public class ParticipanteService {
//	 private final Participante_Repository participanteRepository;
//
//	    public ParticipanteService(Participante_Repository participanteRepository) {
//	        this.participanteRepository = participanteRepository;
//	    }
//
//
//	    public List<Participante> listarTodos() {
//	        return participanteRepository.findAll();
//	    }
//
//	    public Participante buscarPorId(Integer id) {
//	        return Participante_Repository.findById(id)
//	            .orElseThrow(() -> new RuntimeException("Participante não encontrado!"));
//	    }
//
//	    // ✅ Criar um novo participante
//	    public Participante salvar(Participante participante) {
//	        return participanteRepository.save(participante);
//	    }
//
//	    // ✅ Atualizar um participante existente
//	    public Participante atualizar(Integer id, Participante participanteAtualizado) {
//	        Participante participanteExistente = buscarPorId(id);
//	        
//	        participanteExistente.setNome(participanteAtualizado.getNome());
//	        participanteExistente.setEmail(participanteAtualizado.getEmail());
//
//	        return participanteRepository.save(participanteExistente);
//	    }
//}
//
//
