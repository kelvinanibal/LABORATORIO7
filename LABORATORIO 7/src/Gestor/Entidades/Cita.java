/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor.Entidades;
/**
 *
 * @author KELVIN VR
 */
public class Cita {
    private String fecha;
    private String hora ;
    private Paciente paciente;
    private Medico medico;
    private Especialidad especialida;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    @Override
    public String toString(){
      return    this.getFecha()+"       "+this.getHora()+"     "
                +this.getPaciente().getNombre()+"     "
                +this.getMedico().getNombre()+"     "
                +this.getEspecialida().getNombre();     
                
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Especialidad getEspecialida() {
        return especialida;
    }

    public void setEspecialida(Especialidad especialida) {
        this.especialida = especialida;
    }
    
}
