/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor.Entidades;

import java.util.List;
/**
 *
 * @author KELVIN VR
 */
public class Medico {
    private String nombre;
    private String CMP;
    private List<Especialidad> especialidades;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return  "Nombre: "+nombre + "       CMP: " + CMP ;
    }
    
    
}
