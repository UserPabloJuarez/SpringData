package edu.cibertec.capitulo4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SaludoController {
    
    @RequestMapping("controla")
    public ModelAndView saludar()
    {
        return new ModelAndView("saludo", "mensaje", "Bienvenido desde una línea");
    }
    
}
