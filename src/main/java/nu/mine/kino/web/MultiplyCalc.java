package nu.mine.kino.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
* @author Masatomi KINO
* @version $Revision$
*/
@RestController
@RequestMapping("/multiply")
public class MultiplyCalc {

   @RequestMapping(value = "/{param1}/{param2}", method = RequestMethod.GET)
   public Object add(@PathVariable int param1, @PathVariable int param2) {
       return param1 * param2;
   }

}