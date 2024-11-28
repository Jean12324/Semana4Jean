/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.sesion4.controler;

import com.example.sesion4.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author Jeanc
 */
@Controller
public class FormControler {
    @GetMapping("/form")
    public String ShowForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }
    
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user, Model model){
        model.addAttribute("user", user);
        return "success";
    }
}
