/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class SpringController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        return printHelloWhitParam(model, 1);
    }

    @RequestMapping(method = RequestMethod.GET, params = {"x"})
    public String printHelloWhitParam(ModelMap model, @RequestParam("x") int number) {
        model.addAttribute("x", number);
        return "hello";
    }

}
