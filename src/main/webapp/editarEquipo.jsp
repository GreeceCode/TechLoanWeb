<%-- 
    Document   : editarEquipo
    Created on : 9 oct. 2026, 4:39:10 p. m.
    Author     : Grecia
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>TechLoan - Editar Equipo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="card shadow">
            <div class="card-header bg-dark text-white">
                <h3>Editar Equipo Tecnológico</h3>
            </div>
            <div class="card-body">
                <form action="equipos" method="POST">
                    <!-- Campo oculto para enviar el ID -->
                    <input type="hidden" name="id" value="${equipo.id}">
                    
                    <div class="mb-3">
                        <label class="form-label">Código Interno:</label>
                        <input type="text" class="form-control" name="codigoInterno" value="${equipo.codigoInterno}" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Tipo ID:</label>
                        <input type="number" class="form-control" name="tipoId" value="${equipo.tipoId}" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Marca:</label>
                        <input type="text" class="form-control" name="marca" value="${equipo.marca}" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Modelo:</label>
                        <input type="text" class="form-control" name="modelo" value="${equipo.modelo}" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Nº de Serie:</label>
                        <input type="text" class="form-control" name="numeroSerie" value="${equipo.numeroSerie}" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Estado:</label>
                        <select class="form-control" name="estado">
                            <option value="Disponible" ${equipo.estado == 'Disponible' ? 'selected' : ''}>Disponible</option>
                            <option value="Prestado" ${equipo.estado == 'Prestado' ? 'selected' : ''}>Prestado</option>
                        </select>
                    </div>
                    <button type="submit" class="btn btn-success">Actualizar Equipo</button>
                    <a href="equipos" class="btn btn-secondary">Cancelar</a>
                </form>
            </div>
        </div>
    </div>
</body>
</html>