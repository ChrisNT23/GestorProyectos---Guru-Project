package com.tuempresa.gestorproyectos.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(members = "proyecto; nombre, descripcion, miembros, fechaConclusionEstimada, objetivo, asignarA")
public class Tarea extends Identifiable {

    @Column(length = 50)
    @Required
    private String nombre;

    @Stereotype("TEXT_AREA")
    private String descripcion;

    @ElementCollection
    @ListProperties("miembro")
    private List<TareaMember> miembros;

    private LocalDate fechaConclusionEstimada;

    private String objetivo;

    private String asignarA;

    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList(
        descriptionProperties = "nombre",
        order = "nombre asc"
        
    )
    private Proyecto proyecto;

}
