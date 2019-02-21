package horovyi.petclinic.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class BaseEntity implements Serializable {
    private Long id;
}
