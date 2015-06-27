/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Sala;
import view.JanelaCrud;
import view.PrintUtil;
import view.sala.SalaPainelFormulario;
import view.sala.SalaPainelTabela;
import view.sala.SalaTabelaModel;

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
        SalaPainelFormulario salaPainelFormulario = this.janela.getSalaPainelFormulario();
        salaPainelFormulario.zerarCampos();
        
        salaPainelFormulario.getjButtonCadastra().setVisible(true);
        salaPainelFormulario.getjButtonCadastra().setText("Cadastrar");
        salaPainelFormulario.habilitaEdicaoFormSala(true);
        
        telaAtual = FORMCADASTRO;
        this.janela.mostrarPainel(JanelaCrud.PAINELFORM);
    }
    
    public void editarSala(){
        SalaPainelTabela salaPainelTabela = this.janela.getSalaPainelTabela();
        SalaPainelFormulario salaPainelFormulario = this.janela.getSalaPainelFormulario();
        SalaTabelaModel salaTabelaModel = (SalaTabelaModel) salaPainelTabela.getTableSala().getModel();

        linhaSelecionada = salaPainelTabela.getTableSala().getSelectedRow();
        if(linhaSelecionada < 0)
        {
            PrintUtil.printMessageError(janela, "Não há nenhum elemento selecionado na tabela");
            return;
        }
        Sala sala = salaTabelaModel.getSala(linhaSelecionada);
        
        String qtdCadeiras = String.valueOf(sala.getQtdAssentos());
        salaPainelFormulario.carregaDados(sala.getNumero(), qtdCadeiras);
        
        salaPainelFormulario.getjButtonCadastra().setVisible(true);
        salaPainelFormulario.getjButtonCadastra().setText("Editar");
        salaPainelFormulario.habilitaEdicaoFormSala(true);

        telaAtual = FORMEDICAO;
        this.janela.mostrarPainel(JanelaCrud.PAINELFORM);
    }
    public void visualizarSala(){
        SalaPainelTabela salaPainelTabela = this.janela.getSalaPainelTabela();
        SalaPainelFormulario salaPainelFormulario = this.janela.getSalaPainelFormulario();
        SalaTabelaModel salaTabelaModel = (SalaTabelaModel) salaPainelTabela.getTableSala().getModel();

        linhaSelecionada = salaPainelTabela.getTableSala().getSelectedRow();
        if(linhaSelecionada < 0)
        {
            PrintUtil.printMessageError(janela, "Não há nenhum elemento selecionado na tabela");
            return;
        }
         Sala sala = salaTabelaModel.getSala(linhaSelecionada);
         
        String qtdCadeiras = String.valueOf(sala.getQtdAssentos());
        salaPainelFormulario.carregaDados(sala.getNumero(), qtdCadeiras);
        
        salaPainelFormulario.getjButtonCadastra().setVisible(false);
        salaPainelFormulario.getjButtonCadastra().setText("");
        salaPainelFormulario.habilitaEdicaoFormSala(false);

        telaAtual = FORMVISUALIZACAO;
        this.janela.mostrarPainel(JanelaCrud.PAINELFORM);
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
