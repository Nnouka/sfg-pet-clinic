package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author nouks
 * @date 09 Oct 2019
 */
@Controller
@RequestMapping("/vets")
public class VetsController {
    @RequestMapping({"", "/", "index", "index.html"})
    public String listVets(){
        return "vets/index";
    }
}
