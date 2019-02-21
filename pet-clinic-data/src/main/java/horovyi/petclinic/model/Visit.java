package horovyi.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by ihor.horovyi 2019-02-21
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Visit extends BaseEntity {

    private LocalDate date;
    private String description;
    private Pet pet;

}
