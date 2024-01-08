package com.tuempresa.gestorproyectos.modelo;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity
@Getter
@Setter
public class InformacionProyecto extends Identifiable {

    @Column(length = 100)
    private String tareas;

    @Column(length = 50)
    private String progreso;

    @Column(length = 50)
    private String eficacia;

}
