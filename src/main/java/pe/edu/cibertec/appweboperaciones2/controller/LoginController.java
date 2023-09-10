package pe.edu.cibertec.appweboperaciones2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pe.edu.cibertec.appweboperaciones2.Model.LoginForm;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("loginform",
                new LoginForm());
        return "login";
    }

    @PostMapping("/login")
    public String login(
           @ModelAttribute("loginform") LoginForm login,
                        Model model){
        if(login.getUsuario().equals("AngeloGuio")
            && login.getPassword().equals("123")
        ){
            return "index";
        }
        return "login";
    }
}
