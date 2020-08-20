package controllers;

import model.SimpleDic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class Dictionary {
    SimpleDic simpleDic = new SimpleDic();

    Map<String,String> myMap = simpleDic.getMinidic();
    @GetMapping("/translate")
    public String search(){
        return "inputForm";
    }

    @GetMapping("/doTranslate")
    public String translate(@RequestParam String word, Model input, Model output){
        String result = myMap.get(word);
        if (result != null){
            input.addAttribute("input",word);
            output.addAttribute("output",result);
        }else {
            input.addAttribute("input",word);
            output.addAttribute("output","Do not found");
        }

        return "outputForm";
    }
}
