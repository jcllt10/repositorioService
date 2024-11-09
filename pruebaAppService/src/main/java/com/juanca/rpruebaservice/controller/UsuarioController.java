/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanca.rpruebaservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/v1/users")
public class UsuarioController {
    
    @RequestMapping
    public String mostrarFormUsuariuo()
    {
       return "formUsuario";
    }
    
}
