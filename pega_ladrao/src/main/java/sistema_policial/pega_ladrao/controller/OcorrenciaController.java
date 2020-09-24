package sistema_policial.pega_ladrao.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sistema_policial.pega_ladrao.model.Ocorrencia;
import sistema_policial.pega_ladrao.services.OcorrenciaService;

@RestController
public class OcorrenciaController {
    
    @Autowired
    private OcorrenciaService service;


    @GetMapping("/ocorrencias")
    public List<Ocorrencia> lista(){
      return service.lista();
      
     
    }
    
    
    @GetMapping("/ocorrencias/{id}")
    public Ocorrencia get(@PathVariable Long id){
     
     return  service.busca(id);
    
    
    
    }
    
    
    @PostMapping("/ocorrencias")
    public String post(@RequestBody Ocorrencia ocorrencia){
       
    

        service.adiciona(ocorrencia);
        return "Ocorrencia adicionada com sucesso!";
    }
    
    @PutMapping("/ocorrencias")
    public String put(@RequestBody Ocorrencia ocorrencia) {
       
    
    
        service.atualiza(ocorrencia);
        return "ocorrencia atualizada com sucesso";
    }
    
    @DeleteMapping("/ocorrencias")
    public String delete(@RequestBody  Ocorrencia ocorrencia) {
        

         service.remove(ocorrencia);
        return " ocorrencia removida com sucesso";
    }
    
    }
}
