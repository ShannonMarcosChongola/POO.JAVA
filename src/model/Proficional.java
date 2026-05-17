package model;
import model.Paciente;
import java.util.*;

public class Proficional {
    private String especialidade;
    private int idProficional;
    private String departamento;
    private int contacto;
    private char genero;
    private String nome;
    private List<Paciente> pacientes;
    public String getEspecialidade() {
        return especialidade;
    }
    public int getIdProficional() {
        return idProficional;
    }
    public String getDepartamento() {
        return departamento;
    }
    public int getContacto() {
        return contacto;
    }
    public char getGenero() {
        return genero;
    }
    public String getNome() {
        return nome;
    }
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    public Profional(String especialidade, int idProficional, String departamento, int contacto, char genero,
            String nome) {
        this.especialidade = especialidade;
        this.idProficional = idProficional;
        this.departamento = departamento;
        this.contacto = contacto;
        this.genero = genero;
        this.nome = nome;
        this.pacientes = pacientes;
    }
    
    

}
