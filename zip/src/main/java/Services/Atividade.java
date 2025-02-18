//package Services;
//
//import org.springframework.stereotype.Service;
//
//import Repository.Atividade_Repository;
//
//@Service
//public class Atividade {
//
//	private final Atividade_Repository atividadeRepository;
//
//    public Atividade(Atividade_Repository atividadeRepository) {
//        this.atividadeRepository = atividadeRepository;
//    }
//
//    public Atividade criarAtividade(Atividade atividade) {
//        return atividadeRepository.save(atividade);
//    }
//
//    public Atividade obterAtividade(Long id) {
//        return atividadeRepository.findById(id).orElseThrow();
//    }
//}
//
