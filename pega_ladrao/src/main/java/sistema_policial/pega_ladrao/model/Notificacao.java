package sistema_policial.pega_ladrao.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name ="Notificacao")
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class Notificacao{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @EqualsAndHashCode.Exclude
    String descricao;


  }