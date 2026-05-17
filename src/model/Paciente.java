package model;
import model.Consulta;
import java.util.*;
import model.Exame;
import model.Tratamento;
import model.Internamento;


public class Paciente {
    private int idPaciente;
    private int idade;
    public int getIdade() {
        return idade;
    }
    private String nome;
    private String dataNacimento;
    private char genero;
    private String endereco;
    private int contacto;
    private int contactoEmergencia;
    private List<Consulta> consultas;
    private List<Exame> exames;
    private List<Tratamento> tratamentos;
    private List<Internamento> internamentos;

    public int getIdPaciente() {
        return idPaciente;
    }
    public String getNome() {
        return nome;
    }
    public String getDataNacimento() {
        return dataNacimento;
    }
    public char getGenero() {
        return genero;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getContacto() {
        return contacto;
    }
    public int getContactoEmergencia() {
        return contactoEmergencia;
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }
    public List<Exame> getExames() {
        return exames;
    }
    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }
    public List<Internamento> getInternamentos() {
        return internamentos;
    }
   
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    public void setContactoEmergencia(int contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }
    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }
    public void setInternamentos(List<Internamento> internamentos) {
        this.internamentos = internamentos;
    }

    public Paciente(int idPaciente, int idade, String nome, String dataNacimento, char genero, String endereco,
            int contacto, int contactoEmergencia) {
        this.idPaciente = idPaciente;
        this.idade = idade;
        this.nome = nome;
        this.dataNacimento = dataNacimento;
        this.genero = genero;
        this.endereco = endereco;
        this.contacto = contacto;
        this.contactoEmergencia = contactoEmergencia;
        this.consultas = consultas;
        this.exames = exames;
        this.tratamentos = tratamentos;
        this.internamentos = internamentos;
    }
    
    

}
