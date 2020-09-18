package sistema_policial.pega_ladrao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data @NoArgsConstructor @AllArgsConstructor
public class Localidade{
    String bairro;
    String cidade;
    String estado;
    String rua;


}