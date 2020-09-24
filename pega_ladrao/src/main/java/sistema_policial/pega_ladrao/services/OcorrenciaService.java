
package sistema_policial.pega_ladrao.services;

import java.util.List;

import org.springframework.stereotype.Service;

import sistema_policial.pega_ladrao.model.Ocorrencia;
import sistema_policial.pega_ladrao.repositories.OcorrenciaRepository;


@Service
public class OcorrenciaService {

    @Autowired 
    OcorrenciaRepository repository;

  public List<Ocorrencia> lista(){
    return repository.findAll();
  }   

  public Ocorrencia busca(Long id){

    Optional<Ocorrencia> ocorrencia = repository.findById(id);
   
     return ocorrencia.orElse(null);
  }

  public void adiciona(Ocorrencia ocorrencia){
    repository.save( ocorrencia);
 
  }
  public void atualiza(Ocorrencia ocorrencia){

    repository.save(ocorrencia);


  }

  public void remove(Ocorrencia ocorrencia){
    repository.delete(ocorrencia);
  }
}
