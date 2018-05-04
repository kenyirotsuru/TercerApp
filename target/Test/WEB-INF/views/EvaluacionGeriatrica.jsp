<%-- 
    Document   : EvaluacionGeriatrica
    Created on : 22-abr-2018, 13:53:33
    Author     : Francisco
--%>

 <html>

            <head>
                <title>Evaluacion Geriatrica</title>

                <script type="text/javascript">
                    $(document).ready(function() {

                    });
                </script>
                
              

            </head>

            <body>
                <form method="post" action="evaluacionGeriatricaSubmit">
                <div class="container ">
                    <h1 class="well">Evaluaci�n geri�trica del paciente</h1>
                    <table class="table table-striped table-hover table-bordered">
                    <thead>
                      <tr>
                        <th scope="col">Pruebas Aplicadas</th>
                        <th scope="col">Resultado</th>
                        <th scope="col">Interpretaci�n</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                          <td>Evaluaci�n de Katz</td>
                          <td><input type="number" name="evalKatzRes" value="2.43"/></td>
                          <td><input type="number" name="evalKatzIntr" value="3.43"/></td>
                      </tr>
                      <tr>
                        <td>Escala de Borthel</td>
                        <td><input type="number" name="escalaBorthelRes" value="2.43"/></td>
                        <td><input type="number" name="escalaBorthelIntr" value="2.43"/></td>
                      </tr>
                      <tr>
                        <td>Escala de Lawton-Brady</td>
                        <td><input type="number" name="lawtonRes" value="2.43"/></td>
                        <td><input type="number" name="lawtonIntr" value="2.43"/></td>
                      </tr>
                      <tr>
                        <td>Examen m�nimo del estado mental</td>
                        <td><input type="number" name="exMinRes" value="2.43"/></td>
                        <td><input type="number" name="exMinIntr" value="2.43"/></td>
                      </tr>
                                            <tr>
                        <td>Escala de Depresi�n Geri�trica</td>
                        <td><input type="number" name="depresionRes" value="2.43"/></td>
                        <td><input type="number" name="depresionIntr" value="2.43"/></td>
                      </tr>
                      <tr>
                        <td>Cribado nutricional</td>
                        <td><input type="number" name="cribadoRes" value="2.43"/></td>
                        <td><input type="number" name="cribadoIntr" value="2.43"/></td>
                      </tr>
                       <tr>
                        <td>Prueba corta de desempe�o f�sico</td>
                        <td><input type="number" name="pruebaFisicoRes" value="2.43"/></td>
                        <td><input type="number" name="pruebaFisicoIntr" value="2.43"/></td>
                      </tr>
                      <tr>
                        <td>Prueba lev�ntate y anda</td>
                        <td><input type="number" name="levantateAndaRes" value="2.43"/></td>
                        <td><input type="number" name="levantateAndaIntr" value="2.43"/></td>
                      </tr>
                    </tbody>
                  </table>
                <table class="table table-striped table-hover table-bordered top-buffer">
                    <thead>
                      <tr>
                        <th scope="col">Evaluaci�n de fragilidad </th>
                        <th scope="col">Resultado</th>
                        <th scope="col">Interpretaci�n</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>Perdida de peso</td>
                        <td><input type="number" name="perdidaPesoRes" value="2.43"/></td>
                        <td><input type="number" name="perdidaPesoIntr" value="2.43"/></td>
                      </tr>
                      <tr>
                        <td>Pobre resistencia y energ�a disminuida</td>
                        <td><input type="number" name="pobreResistenciaYEnergiaRes" value="2.43"/></td>
                        <td><input type="number" name="pobreResistenciaYEnergiaIntr" value="2.43"/></td>
                      </tr>
                      <tr>
                        <td>Velocidad de la marcha</td>
                        <td><input type="number" name="velocidadDeMarchaRes" value="2.43"/></td>
                        <td><input type="number" name="velocidadDeMarchaIntr" value="2.43"/></td>
                      </tr>
                      <tr>
                        <td>Debilitamiento(Fuerza de Prensi�n)</td>
                        <td><input type="number" name="debilitamientoRes" value="2.43"/></td>
                        <td><input type="number" name="debilitamientoIntr" value="2.43"/></td>
                      </tr>
                                            <tr>
                        <td>Actividad F�sica</td>
                        <td><input type="number" name="actividadFisicaRes" value="2.43"/></td>
                        <td><input type="number" name="actividadFisicaIntr" value="2.43"/></td>
                      </tr>
                      <tr>
                        <td>Diagn�stico</td>
                        <td><input type="number" name="diagnosticoRes" value="2.43"/></td>
                        <td><input type="number" name="diagnosticoIntr" value="2.43"/></td>
                      </tr>
                    </tbody>
                  </table>
                  </div>
                <input type="submit" value="Guardar" class="btn btn-success" />
            </form>
                <input type="submit" value="Salir sin guardar" class="btn btn-primary top-buffer" />
            </body>

            </html>
