package guru.springframework.sfgpetclinic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nouks 09 10 19
 */
@Controller
public class IndexController {
    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }
}
