<%-- 
    Document   : index
    Created on : 9 oct. 2026, 3:37:15 p. m.
    Author     : Grecia
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- http://localhost:8080/TechLoanWeb-1.0-SNAPSHOT/ -->
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>TechLoan - Sistema de Gestión</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8 text-center">
                <div class="card shadow p-4">
                    <h1 class="mb-3 text-dark">TechLoan 🚀</h1>
                    <p class="text-muted">Sistema Web de Préstamo de Equipos Tecnológicos</p>
                    <hr>
                    <div class="d-grid gap-3 col-6 mx-auto mt-4">
                        <!-- Botón para ir al Listado de Equipos -->
                        <a href="equipos" class="btn btn-dark btn-lg">📦 Gestionar Equipos</a>
                        
                        <!-- Botón para ir directo al Formulario de Registro -->
                        <a href="registrarEquipo.jsp" class="btn btn-outline-primary btn-lg">➕ Registrar Nuevo Equipo</a>
                        
                        <!-- Espacio reservado para futuros módulos -->
                        <button class="btn btn-outline-secondary btn-lg" disabled>👥 Empleados (Próximamente)</button>
                        <button class="btn btn-outline-secondary btn-lg" disabled>📋 Préstamos (Próximamente)</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>