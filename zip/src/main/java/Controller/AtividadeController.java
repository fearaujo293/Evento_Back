package Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Services.Atividade;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {
    private final Atividade atividadeService;

    public AtividadeController(Atividade atividadeService) {
        this.atividadeService = atividadeService;
    }

    @PostMapping
    public ResponseEntity<Atividade> criarAtividade(@RequestBody Atividade atividade) {
        Atividade criada = atividadeService.criarAtividade(atividade);
        return ResponseEntity.status(HttpStatus.CREATED).body(criada);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Atividade> obterAtividade(@PathVariable Long id) {
        Atividade atividade = atividadeService.obterAtividade(id);
        return ResponseEntity.ok(atividade);
    }
}
