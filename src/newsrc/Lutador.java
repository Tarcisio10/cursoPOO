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
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public Lutador(String no, String na, int id, float al, float p, int wins, int loses, int draws) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = p;
        this.vitorias = wins;
        this.derrotas = loses;
        this.empates = draws;
    }

    public void apresentar() {
        System.out.println(this.getNome());
        System.out.println(this.getNacionalidade());
        System.out.println(this.getIdade());
        System.out.println(this.getAltura());
        System.out.println(this.getPeso());
    }

    public void status() {
        System.out.println(this.getCategoria());
        System.out.println(this.getVitorias()+"x"+this.getEmpates()+""+this.getDerrotas());
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);

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

    public float getAltura() {
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
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso >= 50) {
            categoria = setCategoria("Invalido");
        }
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
