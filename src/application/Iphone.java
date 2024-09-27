/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

/**
 *
 * @author Little Chikita
 */
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Chamada não atendida, encaminhando para a caixa postal");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Qual musica você deseja?");
    }
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("6212345678");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
    }
    
}
