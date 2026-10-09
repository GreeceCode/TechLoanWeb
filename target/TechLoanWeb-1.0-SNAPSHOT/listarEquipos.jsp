<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>TechLoan - Listado de Equipos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="card shadow">
            <div class="card-header bg-dark text-white">
                <h3>TechLoan - Gestión de Equipos Tecnológicos</h3>
            </div>
            <div class="card-body">
                <table class="table table-striped table-bordered">
                    <thead class="table-dark">
                        <tr>
                            <th>ID</th>
                            <th>Código Interno</th>
                            <th>Marca</th>
                            <th>Modelo</th>
                            <th>Nº Serie</th>
                            <th>Estado</th>
                            <th>Acciones</th> <!-- Nueva columna -->
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="e" items="${equipos}">
                            <tr>
                                <td>${e.id}</td>
                                <td>${e.codigoInterno}</td>
                                <td>${e.marca}</td>
                                <td>${e.modelo}</td>
                                <td>${e.numeroSerie}</td>
                                <td>
                                    <span class="badge bg-secondary">${e.estado}</span>
                                </td>
                                <td>
                                    <a href="equipos?accion=editar&id=${e.id}" class="btn btn-warning btn-sm">✏️ Editar</a>
                                    <a href="equipos?accion=eliminar&id=${e.id}" class="btn btn-danger btn-sm"
                                       onclick="return confirm('¿Estás seguro de eliminar este equipo?');">🗑️ Eliminar</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <!-- Botones al final -->
                <div class="d-flex justify-content-between mt-4">
                    <a href="registrarEquipo.jsp" class="btn btn-primary">➕ Registrar Equipo</a>
                    <a href="index.jsp" class="btn btn-secondary">⬅️ Salir</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
