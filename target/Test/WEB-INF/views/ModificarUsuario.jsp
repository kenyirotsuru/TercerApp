<%-- 
    Document   : ModificarUsuario
    Created on : 21-abr-2018, 17:25:08
    Author     : Francisco
--%>
<html>

            <head>
                <title>Modificar Usuario</title>

                <script type="text/javascript">
                    $(document).ready(function() {

                    });
                </script>
            </head>

            <body>
                <div class="container centerData">
                    <h1 class="well">Modifica al usuario con id</h1>
                    <div class="" id="">
                        <div class="row">
                            <form role="form" id="formR" method="post" action="usuarioModificado">
                                    <div class="row">
                                        <div class="col-4">
                                          <label>Usuario:</label>
                                            <input type="text" placeholder="id" class="form-control" id="usuarioID" name="usuarioid" >
                                        </div>
                                                            
                                        <div class="creationInfo">
                                            <p>Usuario creado:     Ultima modificación: </p>
                                        </div>
                                    </div>
                                    <div class="row top-buffer">
                                        <div class="col-4">
                                          <label>Nombre</label>
                                            <input type="text" placeholder="Nombre" class="form-control" id="nombreID" name="nombre" >
                                        </div>
                                        <div class="col-4">
                                           <label>Domicilio</label>
                                           <input type="text" placeholder="Domicilio" class="form-control" id="domicilioID" name="domicilio" >
                                        </div>
                                        <div class="col-4">
                                          <label>Contraseña</label>
                                          <input type="password" placeholder="Contraseña" class="form-control" id="passwordID" name="password" >
                                        </div>
                                    </div>
                                    <div class="row top-buffer">
                                        <div class="col-4">
                                          <label>Apellido Paterno</label>
                                            <input type="text" placeholder="Nombre" class="form-control" id="aPaternoID" name="aPaterno" >
                                        </div>
                                        <div class="col-4">
                                           <label>Teléfono</label>
                                           <input type="number" placeholder="Tel." class="form-control" id="telefonoID" name="telefono" >
                                        </div>
                                        <div class="col-4">
                                          <label>Estado</label>
                                          <select id="estadoID" name="estado" class="form-control">
                                              <option selected>Activo</option>
                                              <option>Inactivo</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="row top-buffer">
                                        <div class="col-4">
                                          <label>Apellido Materno</label>
                                            <input type="text" placeholder="Apellido Materno" class="form-control" id="aMaternoID" name="aMaterno" >
                                        </div>
                                        <div class="col-4">
                                           <label>Correo Electrónico</label>
                                           <input type="text" placeholder="Correo Electrónico" class="form-control" id="emailID" name="email" >
                                        </div>
                                    </div>
                                <div id="submitID">
                                <input type="submit" value="Registrar" id="" class="btn btn-info">
                                </div>
                            </form>
                        </div>
                    </div>

                </div>
            </body>

            </html>
