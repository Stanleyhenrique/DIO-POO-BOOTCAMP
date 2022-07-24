/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Curso;

/**
 *
 * @author stanl
 */
public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Muito Aprendizado");
        curso1.setCargaHoraria(53);
        System.out.println(curso1);
    }
}
