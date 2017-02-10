package nu.mine.kino.web;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Masatomi KINO
 * @version $Revision$
 */
@Data
@AllArgsConstructor
public class User {
    private String name;

    private int age;

}