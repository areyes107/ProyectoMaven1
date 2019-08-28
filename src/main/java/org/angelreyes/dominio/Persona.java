package org.angelreyes.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Personas")
public class Persona {
    @Id
    @Column(name="codigoPersona")
    private int codigoPersona;
    @Column
    private String nombres;
    @Column
    private String apellidos;

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigoPersona=" + codigoPersona + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }

    
            
    
    
}
