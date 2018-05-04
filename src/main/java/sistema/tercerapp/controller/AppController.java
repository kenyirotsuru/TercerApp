/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.tercerapp.controller;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sistema.tercerapp.model.Usuarios;
import sistema.tercerapp.service.UsuariosService;

/**
 *
 * @author Francisco
 */
@Controller
@RequestMapping("/")
public class AppController {
    
        @Autowired
    UsuariosService usuarioService;
    
    @RequestMapping(value = {"/"})
    public String showMainPage(ModelMap model) {
        return "adminDashboard";
    }
    
    @RequestMapping(value = {"/login"})
    public String showLoginPage(ModelMap model) {
        return "LoginScreen";
    }
    
    @RequestMapping(value = {"/registrarUsuario"})
    public String showRegistrarPage(ModelMap model) {
        return "RegistrarUsuario";
    }
    
    @RequestMapping(value = {"/modificarUsuario"})
    public String showModificarUsuarioPage(ModelMap model) {
        return "ModificarUsuario";
    }
    
    @RequestMapping(value = {"/verPaciente"})
    public String showVerPacientePage(ModelMap model) {
        return "VerPaciente";
    }
    @RequestMapping(value = {"/ResultadosFitbit"})
    public String showResultadosFitbit(ModelMap model) {
        return "ResultadosFitbit";
    }
    
    @RequestMapping(value = {"/EvaluacionGeriatrica"})
    public String showEvaluacionGeriatrica(ModelMap model) {
        return "EvaluacionGeriatrica";
    }
    @RequestMapping(value = {"/ValoracionGerontologica"})
    public String showValoracionGerontologica(ModelMap model) {
        return "ValoracionGerontologica";
    }
    
     @RequestMapping(value = {"/CrearPaciente"})
    public String showCrearPaciente(ModelMap model) {
        return "CrearPaciente";
    }
    
      @RequestMapping(value = {"/ModificarPaciente"})
    public String showModificarPaciente(ModelMap model) {
        return "ModificarPaciente";
    }
    
        @RequestMapping(value = {"/EliminarPaciente"})
    public String showEliminarPaciente(ModelMap model) {
        return "EliminarPaciente";
    }
         @RequestMapping(value = {"/GenerarReporte"})
    public String showGenerarReporte(ModelMap model) {
        return "GenerarReporte";
    }
    
    @RequestMapping(value = "/usuarioAgregado", method = RequestMethod.POST)
    public String completeRegistration(@RequestParam("nombre") String nombre, @RequestParam("aPaterno") String aPaterno, 
    @RequestParam("aMaterno") String aMaterno, ModelMap model) {
                 
        Usuarios u = new Usuarios();
        
        u.setCreacion(new LocalDate().toDateTimeAtStartOfDay().toDate());
        u.setLastUpdated(new LocalDate().toDateTimeAtStartOfDay().toDate());
        u.setEmail(nombre+"."+aPaterno+String.valueOf(aMaterno.charAt(0))+"@email.com");
        u.setNombre(nombre);
        u.setApellidoMaterno(aMaterno);
        u.setApellidoPaterno(aPaterno);
        u.setPass(nombre+aMaterno+aPaterno);
        u.setTipo("user");
        u.setActivo(true);
                
        usuarioService.saveUsuarios(u);

        return "adminDashboard";
    }
}
