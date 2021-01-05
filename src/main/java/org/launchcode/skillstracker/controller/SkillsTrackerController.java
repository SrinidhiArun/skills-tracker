package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsTrackerController {

    @GetMapping("")
    public String programmingLanguages() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li> Java</li>" +
                "<li> Go</li>" +
                "<li> Javascript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }

    @GetMapping("form")
    public String formSubmit(){
        return "<html>" +
                "<body>" +
                "<form method= 'post' action= 'form'>" +
                "<label>Name: <br>"+
                "<input type= 'text' name= 'name'/></label><br>"+
                "<label for='firstLanguage'>My favorite language:</label><br>"+
                "<select name='firstLanguage' id='firstLanguage'>" +
                "    <option value='Java'>Java</option>" +
                "    <option value='Javascript'>Javascript</option>" +
                "    <option value='Go'>Go</option>" +
                "</select> " +
                "<br><label for='secondLanguage'>My second favorite language:</label><br>"+
                "<select name='secondLanguage' id='secondLanguage'>" +
                "    <option value='java'>Java</option>" +
                "    <option value='javascript'>Javascript</option>" +
                "    <option value='go'>Go</option>" +
                "</select>" +
                "<br><label for='thirdLanguage'>My third favorite language:</label><br>"+
                "<select name='thirdLanguage' id='thirdLanguage'>" +
                "    <option value='java'>Java</option>" +
                "    <option value='javascript'>Javascript</option>" +
                "    <option value='go'>Go</option>" +
                "</select>" +
                "<br><input type= 'submit' value= 'Submit'/>" +
                "</form>"+
                "</body>"+
                "</html>";
    }


    @PostMapping("form")
    public static String personalLanguagePreference(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage){
        return "<html>"+
                "<body>" +
                "<h1>" + name + "</h1>"+
                "<ol>"+
                "<li>"+ firstLanguage+ "</li>" +
                "<li>"+ secondLanguage+ "</li>" +
                "<li>"+ thirdLanguage + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
