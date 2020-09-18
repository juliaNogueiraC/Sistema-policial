package sistema_policial.pega_ladrao.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
 public class Usuario{
     Long id;
     String nome;
     String senha;
     Telefone telefone;

      

     private List<Ocorrencia> ocorrencias = new ArrayList<>();
     
 
 }



