package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author nouks
 * @date 09 Oct 2019
 */
@Controller
@RequestMapping("/owners")
public class OwnersController {
    @RequestMapping({"", "/", "index", "index.html"})
    public String listVets(){
        return "owners/index";
    }
}
