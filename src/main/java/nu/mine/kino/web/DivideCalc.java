
package nu.mine.kino.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/divide") で、
//@RequestMapping(value = "/{param1}/{param2}", method = RequestMethod.GET)
//なメソッドの作成。

@RestController
@RequestMapping("/divide") 
public class DivideCalc {
		
    @RequestMapping(value = "/{param1}/{param2}/divide.json", method = RequestMethod.GET)
    public Object divide(@PathVariable int param1, @PathVariable int param2) {
        return param1 / param2;

	}

}
