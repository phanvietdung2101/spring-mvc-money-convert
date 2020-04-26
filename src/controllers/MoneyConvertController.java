package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

@Controller
public class MoneyConvertController {
    @GetMapping("/convert")
    public ModelAndView showConvertForm(){
        ModelAndView modelAndView = new ModelAndView("convert");
        return modelAndView;
    }

    @PostMapping("/convert")
    public ModelAndView convertMoney(@RequestParam float rate,float amount, ModelAndView modelAndView){
        float convertedAmount = amount * rate;
        modelAndView.addObject("convertedAmount",convertedAmount);
        return modelAndView;
    }
}
