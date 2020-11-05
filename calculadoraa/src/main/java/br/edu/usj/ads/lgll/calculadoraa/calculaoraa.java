package br.edu.usj.ads.lgll.calculadoraa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class calculaoraa {
    
    @PostMapping(value="/calcular")
    public ModelAndView postCalcular(@RequestParam String numero1, @RequestParam String numero2, @RequestParam String operador) {
         
     ModelAndView modelAndView = new ModelAndView ("index");
     Double resultado = 0.0;
  
     switch(operador) {
         case "+": resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2); break;
         case "-": resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2); break;
         case "*": resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2); break;
         case "/": resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2); break;
       
     }
     
     String texto = "Resultado: " + resultado;
     modelAndView.addObject("mensagem", texto);
 
         return modelAndView;
     }
 }
