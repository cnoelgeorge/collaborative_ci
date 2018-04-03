package collab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {



    @GetMapping("/home")
    public String homePage(@RequestParam(name="location", required=false, defaultValue="Bangalore") String location, Model model) {
        model.addAttribute("location", location);
        return "home";
    }
}
