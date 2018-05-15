/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.tercerapp.controller;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sistema.tercerapp.model.Usuarios;
import sistema.tercerapp.model.Pacientes;
import sistema.tercerapp.service.UsuariosService;
import sistema.tercerapp.service.PacientesService;


/**
 *
 * @author Francisco
 */
@Controller
@RequestMapping("/")
public class AppController {
    
        @Autowired
    UsuariosService usuarioService;
        @Autowired
        PacientesService pacienteService;
    
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
    
    	@RequestMapping(value = {"/modificarUsuarioC"},method = RequestMethod.GET)
	public String initForm(Model model) {
		Usuarios usuario= new Usuarios();
               	model.addAttribute("Usuario", usuario);
		List<Usuarios> usuarios = usuarioService.findAllUsuarios();
        
                List<String> usuariosLista = new ArrayList<String>();
        
                for(int i=0; i<usuarios.size();i++){
                    usuariosLista.add(Integer.toString(usuarios.get(i).getId())+"-"+usuarios.get(i).getNombre()+" "+usuarios.get(i).getApellidoPaterno()+" "+usuarios.get(i).getApellidoMaterno());
                }
        
                
                model.addAttribute("Usuarios", usuariosLista);		
                return "modificarUsuarioC";
	}
    
    @RequestMapping(value = {"/modificarUsuario"}, method = RequestMethod.POST)
    public String showModificarUsuarioPage(@RequestParam(value = "nombre", required = false) String pTexto,ModelMap model) {

        String[] resultados = pTexto.split("-");
        String idS = resultados[1];
        int id = Integer.parseInt(resultados[0]);
        
        Usuarios user = usuarioService.findById(id);
        
        model.addAttribute("usuario", user);
        
        return "ModificarUsuario";
    }
    
      @RequestMapping(value = {"/modificarUsuarioParam"}, method = RequestMethod.GET)
    public String showModificarUsuarioParameters(@RequestParam(value = "usuario", required = false) String pTexto,ModelMap model) {

        String[] resultados = pTexto.split("-");
        String idS = resultados[1];
        int id = Integer.parseInt(resultados[0]);
        
        Usuarios user = usuarioService.findById(id);
        
        model.addAttribute("usuario", user);
        
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
    
    @RequestMapping(value = {"/pacienteCreado"})
    public String completeModification(@RequestParam( value ="nombre", required = false) String nombre,
        @RequestParam(value="aPaterno", required=false) String aPaterno, @RequestParam(value="afiliacionMedica", required=false) String afiMed,
        @RequestParam(value="escolaridadMax", required=false) String escolaridadMax, @RequestParam(value= "aMaterno", required=false) String aMaterno, 
        @RequestParam(value= "email", required=false) String email, @RequestParam(value="edad", required=false) String edad,
        @RequestParam(value="autoreportePadecimientos", required=false) String autoreportePadecimientos, 
        @RequestParam(value="escalaAMAI", required=false) String escalaAMAI, @RequestParam(value="estadoCivil", required=false) String estadoCivil,
        @RequestParam(value="cohabitacion", required=false) int cohabitacion, @RequestParam(value="telefono", required=false) String telefono,
        @RequestParam(value="domicilio", required=false) String domicilio, ModelMap model) {
        
        Pacientes p = new Pacientes();
        
        p.setCreacion(new LocalDate().toDateTimeAtStartOfDay().toDate());
        p.setLastUpdated(new LocalDate().toDateTimeAtStartOfDay().toDate());
        p.setNombre(nombre);
        p.setApellidoMaterno(aMaterno);
        p.setApellidoPaterno(aPaterno);
        p.setAfiliacion(afiMed);
        p.setEscolaridad(escolaridadMax);
        p.setEmail(email);
        p.setEscalaAMAI(escalaAMAI);
        p.setAutopadecimiento(autoreportePadecimientos);
        p.setEdad(edad);
        p.setEstadoCivil(estadoCivil);
        if(cohabitacion==0){
            p.setCohabitacion(false);
        }else{
            p.setCohabitacion(true);
        }
        p.setTelefono(telefono);
        p.setDireccion(domicilio);
        p.setActivo(true);
        
        pacienteService.savePacientes(p);
        return "adminDashboard";
    }
    
      @RequestMapping(value = {"/ModificarPaciente"})
    public String showModificarPaciente(ModelMap model) {
        return "ModificarPaciente";
    }
    
    @RequestMapping(value ="/pacienteModificado", method = RequestMethod.POST)
    public String modificarPaciente(@RequestParam(value="pacienteid", required=false) int Id, @RequestParam( value ="nombre", required = false) String nombre,
        @RequestParam(value="aPaterno", required=false) String aPaterno, @RequestParam(value="afiliacionMedica", required=false) String afiMed,
        @RequestParam(value="escolaridadMax", required=false) String escolaridadMax, @RequestParam(value= "aMaterno", required=false) String aMaterno, 
        @RequestParam(value= "email", required=false) String email, @RequestParam(value="edad", required=false) String edad,
        @RequestParam(value="autoreportePadecimientos", required=false) String autoreportePadecimientos, @RequestParam(value="estado", required=false) int estado,
        @RequestParam(value="escalaAMAI", required=false) String escalaAMAI, @RequestParam(value="estadoCivil", required=false) String estadoCivil,
        @RequestParam(value="cohabitacion", required=false) int cohabitacion, @RequestParam(value="telefono", required=false) String telefono,
        @RequestParam(value="domicilio", required=false) String domicilio, ModelMap model){
        
        Pacientes p = pacienteService.findById(Id);
        
        if(nombre != null){
            p.setNombre(nombre);
        }
        if(aPaterno != null){
            p.setApellidoPaterno(aPaterno);
        }
        if(afiMed != null){
            p.setAfiliacion(afiMed);
        }
        if(escolaridadMax != null){
            p.setEscolaridad(escolaridadMax);
        }
        if(aMaterno != null){
            p.setApellidoMaterno(aMaterno);
        }
        if(email != null){
            p.setEmail(email);
        }
        if(edad != null){
            p.setEdad(edad);
        }
        if(autoreportePadecimientos != null){
            p.setAutopadecimiento(autoreportePadecimientos);
        }
        if(escalaAMAI != null){
            p.setEscalaAMAI(escalaAMAI);
        }
        if(estadoCivil != null){
            p.setEstadoCivil(estadoCivil);
        }
        if(telefono != null){
            p.setTelefono(telefono);
        }
        if(domicilio != null){
            p.setDireccion(domicilio);
        }
         if(cohabitacion == 1){
            p.setCohabitacion(true);
        }else{p.setCohabitacion(false);}
         
         if(estado == 0){
            p.setActivo(true);
        }else{p.setActivo(false);}
        
         p.setLastUpdated(new LocalDate().toDateTimeAtStartOfDay().toDate());
                
        pacienteService.updatePacientes(p);
        
        
        return "adminDashboard";
    }
    
    @RequestMapping(value = {"/EliminarPaciente"})
    public String showEliminarPaciente(ModelMap model) {
        return "EliminarPaciente";
    }
    
        @RequestMapping(value = {"/pacienteEliminado"}/*, method = RequestMethod.POST*/)
    public String borrarPaciente(@RequestParam(value="pacienteId") int id,ModelMap model) {    
       pacienteService.deletePacientes(id);
        return "adminDashboard";
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
        u.setTipo("Usuario"); //agregar tipo de jefe de geriatria, etc...
        u.setActivo(true);
                
        usuarioService.saveUsuarios(u);

        return "adminDashboard";
    }
    
    @RequestMapping(value = "/usuarioModificado", method = RequestMethod.POST)
    public String completeModification(@RequestParam( value ="nombre", required = false) String nombre, @RequestParam( value ="domicilio", required = false) String domicilio, 
            @RequestParam(value="password", required=false) String password, @RequestParam(value="id", required=false) int Id,  @RequestParam(value= "aPaterno", required=false) String aPaterno,
            @RequestParam(value= "aMaterno", required=false) String aMaterno, @RequestParam(value= "email", required=false) String email, 
            @RequestParam(value="telefono", required=false) String telefono, @RequestParam(value="estado", required=false) int estado,
            @RequestParam(value="edad", required=false) String edad, @RequestParam(value="tipo", required=false) int tipo, ModelMap model) {
             
        Usuarios uM = usuarioService.findById(Id);
        
        if(nombre != null){
            uM.setNombre(nombre);
        }
        if(aPaterno != null){
            uM.setApellidoPaterno(aPaterno);
        }
        if(aMaterno != null){
            uM.setApellidoMaterno(aMaterno);
        }
        if(password != null || !password.equals("")){
            uM.setPass(password);
        }else{
            uM.setPass(nombre+aMaterno+aPaterno);
        }
        if(domicilio != null){
            uM.setDomicilio(domicilio);
        }
        if(email != null){
            uM.setEmail(email);
        }
        if(telefono != null){
            uM.setTelefono(telefono);
        }
        if(estado == 0){
            uM.setActivo(true);
        }else{uM.setActivo(false);}
        if(edad != null){
            uM.setEdad(edad);
        }
        if(tipo == 0 ){
            uM.setTipo("Usuario");
        }else{uM.setTipo("Administrador");}
        
        //terminar de llenar todos los campos
        
        uM.setLastUpdated(new LocalDate().toDateTimeAtStartOfDay().toDate());
                
        usuarioService.updateUsuarios(uM);

        return "adminDashboard";
    }

}
