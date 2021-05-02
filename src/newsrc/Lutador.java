/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsrc;

/**
 *
 * @author tbn
 */
public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public Lutador() {
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        System.out.println(this.vitorias + "x" + this.empates + "x" + this.derrotas);

    }

    public static void apresentar() {
        System.out.println();
    }

    public static void status() {

    }

    public static void ganharLuta() {

    }

    public void perderLuta() {

    }

    public void empatarLuta() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
