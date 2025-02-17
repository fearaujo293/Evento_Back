package Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Bloco_Horario;
import Services.Horário;

@RestController
@RequestMapping("/blocos-horarios")
public class HorarioController {
    private final Horário blocoHorarioService;

    public HorarioController(Horário blocoHorarioService) {
        this.blocoHorarioService = blocoHorarioService;
    }

    @PostMapping
    public ResponseEntity<Horário> criarBlocoHorario(@RequestBody Bloco_Horario blocoHorario) {
        Horário criado = blocoHorarioService.criarBlocoHorario(blocoHorario);
        return ResponseEntity.status(HttpStatus.CREATED).body(criado);
    }
}
