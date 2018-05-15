<%-- 
    Document   : ValoracionGerontologica
    Created on : 24-abr-2018, 13:33:14
    Author     : Francisco
--%>

<html>

            <head>
                <title>Evaluacion Gerontologica</title>

                <script type="text/javascript">
                    $(document).ready(function() {

                    });
                </script>
                
              

            </head>

            <body>
                <form method="post" action="evaluacionGerontologicaSubmit">
                <div class="container ">
                    <h1 class="well">Evaluación gerontológica del paciente</h1>
                    <table class="table table-striped table-hover table-bordered">
                    <thead>
                      <tr>
                        <th scope="col">Nombre</th>
                        <th scope="col"></th>
                        <th scope="col">Edad</th>
                        <th scope="col"></th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <th scope="row">1</th>
                        <td colspan="2">Dispositivos en uso: </td>
                        <td colspan="2"><input type="text" name="" value="Lap-top, tableta teléfono inteligente y cámara fotográfica"/></td>
                        
                      </tr>
                      <tr>
                        <th scope="row">2</th>
                        <td colspan="2">Dispositivo de mayor uso: </td>
                        <td colspan="2"><input type="text" name="" value="Lap-top y teléfono inteligente"/></td>

                      </tr>
                      <tr>
                        <th scope="row">3</th>
                        <td colspan="2">Frecuencia de uso: </td>
                        <td colspan="2"><input type="text" name="" value="Diario entre 1 y 3 horas"/></td>
                      </tr>
                      <tr>
                        <th scope="row">4</th>
                        <td colspan="2">Actividades de uso:</td>
                        <td colspan="2"><input type="text" name="" value="Búsqueda y obtención de información"/></td>
                      </tr>
                      <tr>
                        <th scope="row">5</th>
                        <td colspan="2">Usos a favorecer: </td>
                        <td colspan="2"><input type="text" name="" value="Realización de trámites, pagos, compras y servicios (farmacia, súper, etc.)"/></td>
                      </tr>
                      <tr>
                        <th scope="row">6</th>
                        <td colspan="2">Apoyo social percibido (prueba Duke - corta): </td>
                        <td colspan="2"><input type="text" name="" value="41 puntos ? cuenta con buenas redes de apoyo social "/></td>
                      </tr>
                      <tr>
                        <th scope="row">7</th>
                        <td colspan="2">Actividades comunitarias a favorecer:</td>
                        <td colspan="2"><input type="text" name="" value="Asistir a actividades socio-culturales fuera de su entorno primario"/></td>
                      </tr>
                    </tbody>
                  </table>
               
                  </div>
                <input type="submit" value="Guardar" class="btn btn-success" />
            </form>
                <input type="submit" onclick="location.href='/TercerApp'" value="Salir sin guardar" class="btn btn-primary top-buffer" />
            </body>

            </html>

