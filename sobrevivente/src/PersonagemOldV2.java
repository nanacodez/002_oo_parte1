import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class PersonagemOldV2 {
  private String nome;
 @Builder.Default private int energia = 10;
  private int fome;
  private int sono;

  
}
