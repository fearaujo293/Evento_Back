package Services;

import org.springframework.stereotype.Service;

import Repository.Participante_Repository;

@Service
public class ParticipanteService {
    private final ParticipanteRepository participanteRepository;

    public ParticipanteService(ParticipanteRepository participanteRepository) {
        this.participanteRepository = participanteRepository;
    }

    public Participante obterParticipante(Long id) {
        return participanteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Participante não encontrado"));
    }
}


