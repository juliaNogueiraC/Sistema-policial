package sistema_policial.pega_ladrao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sistema_policial.pega_ladrao.services.OcorrenciaService;

@SpringBootApplication
public class PegaLadraoApplication {


	@Autowired
	private OcorrenciaService service;

	public static void main(String[] args) {
		SpringApplication.run(PegaLadraoApplication.class, args);
	}

	@Override
	 public void run(String... args)throws Exception {
	 
		System.out.println(service.lista()).size());// listagem do service 
}
