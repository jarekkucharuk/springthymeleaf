package pl.dominisz.springthymeleaf.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * http://dominisz.pl
 * 13.06.2018
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonForm {

    private String firstName;
    private String lastName;

}
