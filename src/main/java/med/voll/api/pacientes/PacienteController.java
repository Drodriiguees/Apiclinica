package med.voll.api.pacientes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("pacientes")
public class PacienteController {

    @PostMapping
    public void cadatrar(DadosCadastroPacientes dados){
        System.out.println("dados recebido:"+ dados);
    }
}
