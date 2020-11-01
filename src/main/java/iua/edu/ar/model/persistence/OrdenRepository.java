package iua.edu.ar.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import iua.edu.ar.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Long> {

}
