<%-- 
    Document   : ModificarPaciente
    Created on : 22-abr-2018, 22:16:01
    Author     : Francisco
--%>

 <head>
                <title>Modificar paciente</title>

                <script type="text/javascript">
                    $(document).ready(function() {

                    });
                </script>
            </head>

            <body>
                <div class="container centerData">
                    <h1 class="well">Modifica los datos del paciente</h1>
                        <div class="row">
                            <form role="form" id="formR" method="post" action="usuarioModificado">
                                    <div class="row">
                                        <div class="col-4">
                                          <label>Paciente:</label>
                                            <input type="text" placeholder="id" class="form-control" id="pacienteID" name="pacienteid" >
                                        </div>
                                                            
                                        <div class="creationInfo">
                                            <p>Paciente creado:     Ultima modificación: </p>
                                        </div>
                                    </div>
                                    <div class="row top-buffer">
                                        <div class="col-4">
                                          <label>Nombre</label>
                                            <input type="text" placeholder="Nombre" class="form-control" id="nombreID" name="nombre" >
                                        </div>
                                        <div class="col-4">
                                           <label>Estado Civil</label>
                                            <select name="estadoCivil" form="formR">
                                            <option value="Casado">Casado</option>
                                            <option value="Divorciado">Divorciado</option>
                                            <option value="Soltero">Soltero</option>
                                          </select>
                                        </div>
                                        <div class="col-4">
                                          <label>Correo electrónico</label>
                                          <input type="text" placeholder="email" class="form-control" id="passwordID" name="email" >
                                        </div>
                                    </div>
                                    <div class="row top-buffer">
                                        <div class="col-4">
                                          <label>Apellido Paterno</label>
                                            <input type="text" placeholder="Nombre" class="form-control" id="aPaternoID" name="aPaterno" >
                                        </div>
                                        <div class="col-4">
                                           <label>Afiliación Médica</label>
                                           <input type="text" placeholder="afiliacion medica" class="form-control" id="afiliacionMedicaID" name="afiliacionMedica" >
                                        </div>
                                        <div class="col-4">
                                          <label>Escolaridad máxima alcanzada</label>
                                            <input type="text" placeholder="escolaridad" class="form-control" id="escolaridadMaxID" name="escolaridadMax" >
                                        </div>
                                    </div>
                                    <div class="row top-buffer">
                                        <div class="col-4">
                                          <label>Apellido Materno</label>
                                            <input type="text" placeholder="Apellido Materno" class="form-control" id="aMaternoID" name="aMaterno" >
                                        </div>
                                        <div class="col-4">
                                           <label>Autoreporte de padecimientos</label>
                                           <input type="text" placeholder="Autoreporte" class="form-control" id="autoreporteID" name="autoreportePadecimientos" >
                                        </div>
                                         <div class="col-4">
                                           <label>Cohabitación</label>
                                            <select name="cohabitacion" form="formR">
                                            <option value="Si">Si</option>
                                            <option value="No">No</option>
                                          </select>
                                        </div>
                                    </div>
                                    <div class="row top-buffer">
                                        <div class="col-4">
                                          <label>Edad</label>
                                            <input type="number" placeholder="Edad" class="form-control" id="edadID" name="edad" >
                                        </div>
                                        <div class="col-4">
                                           <label>Escala AMAI</label>
                                           <input type="text" placeholder="AMAI" class="form-control" id="escalaAMAID" name="escalaAMAI" >
                                        </div>
          
                                    </div>
                                <div id="submitID">
                                <input type="submit" value="Modificar" id="" class="btn btn-info">
                                </div>
                            </form>
                        </div>
                </div>
            </body>

            </html>
