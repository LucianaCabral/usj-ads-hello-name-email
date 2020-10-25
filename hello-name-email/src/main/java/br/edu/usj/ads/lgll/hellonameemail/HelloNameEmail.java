package br.edu.usj.ads.lgll.hellonameemail;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloNameEmail {
    @PostMapping(value="helloNameEmail")
    public ModelAndView postHelloNameEHtml(@RequestParam String nome,@RequestParam String email){
         
         ModelAndView modelAndView = new ModelAndView("hello-Name-E");
         modelAndView.addObject("nome", nome);
         modelAndView.addObject("email", email);
        
         System.out.println("passando lou");
         System.out.println(nome);
         System.out.println(email);
 
        return modelAndView;
    }
      
     }

