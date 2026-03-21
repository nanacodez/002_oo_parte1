import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoOld {
  
  @Getter
  @Setter
  private String modelo;

  @Getter
  @Setter
  private String placa;

}
