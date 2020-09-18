package sistema_policial.pega_ladrao.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data @NoArgsConstructor @AllArgsConstructor
public class Horario {

    Date dataHorario;
    Long id;

}