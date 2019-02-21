package horovyi.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by ihor.horovyi 2019-02-21
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Speciality extends BaseEntity {
    private String description;
}
