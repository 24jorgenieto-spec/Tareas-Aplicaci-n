package com.example.Tareas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TareasRepositorio extends JpaRepository<Tarea,Long> {
}