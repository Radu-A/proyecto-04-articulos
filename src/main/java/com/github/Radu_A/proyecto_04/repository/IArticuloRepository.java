package com.github.Radu_A.proyecto_04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.Radu_A.proyecto_04.entity.Articulo;

@Repository
public interface IArticuloRepository extends JpaRepository<Articulo, Long> {

}
