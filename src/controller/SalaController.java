/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.JanelaCrud;
import view.sala.SalaPainelFormulario;

/**
 *
 * @author marcus.rodrigues
 */
public class SalaController {
    
    private final static int TABELA = 0;
    private final static int FORMCADASTRO = 1;
    private final static int FORMEDICAO = 2;
    private final static int FORMVISUALIZACAO = 3;

    private int telaAtual = 0;
    private int linhaSelecionada = -1;
    
    private JanelaCrud janela;
    
    public SalaController(){
        telaAtual = TABELA;
    }
    
    public void setJanela(JanelaCrud janela) {
        this.janela = janela;
    }
    
    public void inserirSala(){
        SalaPainelFormulario salaPainelFormulario = this.janela.
    }
    
    public void editarSala(){
        
    }
    public void visualizarSala(){
        
    }
    public void removerSala(){
        
    }
    
     public void voltarPrincipal() {
        telaAtual = TABELA;
        this.atualizaTabela();
        this.janela.mostrarPainel(JanelaCrud.PAINELTABELA);
    }
     
    public void atualizaTabela(){
        
    }
    
}
