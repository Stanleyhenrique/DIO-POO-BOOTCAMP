/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.desafio.dominio;

/**
 *
 * @author stanl
 */
public class Curso {

    private String Titulo;
    private String Descricao;
    private int CargaHoraria;

    public Curso() {
    }
    
    
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "Titulo=" + Titulo + ", Descricao=" + Descricao + ", CargaHoraria=" + CargaHoraria + '}';
    }
    
}
