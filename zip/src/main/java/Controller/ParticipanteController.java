package Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Services.Participante;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {
    private final Participante participanteService;

    public ParticipanteController(Participante participanteService) {
        this.participanteService = participanteService;
    }

    @PostMapping
    public ResponseEntity<Participante> criarParticipante(@RequestBody Participante participante) {
        Participante criado = participanteService.criarParticipante(participante);
        return ResponseEntity.status(HttpStatus.CREATED).body(criado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Participante> obterParticipante(@PathVariable Long id) {
        Participante participante = participanteService.obterParticipante(id);
        return ResponseEntity.ok(participante);
    }
}