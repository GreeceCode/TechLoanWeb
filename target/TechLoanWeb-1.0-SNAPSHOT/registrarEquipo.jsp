<%-- 
    Document   : registrarEquipo
    Created on : 9 oct. 2026, 12:21:07 p. m.
    Author     : Grecia
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>TechLoan - Registrar Equipo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="card shadow">
            <div class="card-header bg-dark text-white">
                <h3>Registrar Nuevo Equipo Tecnológico</h3>
            </div>
            <div class="card-body">
                <form action="equipos" method="POST">
                    <div class="mb-3">
                        <label class="form-label">Código Interno:</label>
                        <input type="text" class="form-control" name="codigoInterno" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Tipo ID (1: Laptop, 2: Proyector, 3: Tablet):</label>
                        <input type="number" class="form-control" name="tipoId" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Marca:</label>
                        <input type="text" class="form-control" name="marca" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Modelo:</label>
                        <input type="text" class="form-control" name="modelo" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Nº de Serie:</label>
                        <input type="text" class="form-control" name="numeroSerie" required>
                    </div>
                    <button type="submit" class="btn btn-success">Guardar Equipo</button>
                    <a href="index.jsp" class="btn btn-secondary">Cancelar</a>
                </form>
            </div>
        </div>
    </div>
</body>
</html>