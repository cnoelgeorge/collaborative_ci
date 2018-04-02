package collab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @RequestMapping("/")
   public @ResponseBody String greeting() {
     return "End Point";
   }

    @GetMapping("/home")
    public String homePage(@RequestParam(name="name", required=false, defaultValue="Testing") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}