/******************************************************************************
 * Copyright (c) 2014 Masatomi KINO and others. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *      Masatomi KINO - initial API and implementation
 * $Id$
 ******************************************************************************/
//�쐬��: 2017/02/10

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
@RequestMapping("/calc")
public class Calc {

    @RequestMapping(value = "/{param1}/{param2}/add.json", method = RequestMethod.GET)
    public Object add(@PathVariable int param1, @PathVariable int param2) {
        return param1 + param2;
    }

    @RequestMapping(value = "/{param1}/{param2}/subtract.json", method = RequestMethod.GET)
    public Object subtract(@PathVariable int param1, @PathVariable int param2) {
        return param1 + param2;
    }

    @RequestMapping(value = "/{param1}/{param2}/multiply.json", method = RequestMethod.GET)
    public Object multiply(@PathVariable int param1, @PathVariable int param2) {
        return param1 + param2;
    }

    @RequestMapping(value = "/{param1}/{param2}/divide.json", method = RequestMethod.GET)
    public Object divide(@PathVariable int param1, @PathVariable int param2) {
        return param1 + param2;
    }

}
