package view;

import view.filme.FilmePainelTabela;
import view.filme.FilmePainelFormulario;
import controller.FilmeController;
import controller.SalaController;

import javax.swing.*;
import java.awt.*;
import view.sala.SalaPainelFormulario;
import view.sala.SalaPainelTabela;

/**
 * Created by marcus.rodrigues on 20/06/2015.
 */
public class JanelaCrud extends  JFrame{

        private FilmeController filmeController;
        private SalaController salaController;

        public final static String PAINELFORM = "Formulario";
        public final static String PAINELTABELA = "Tabela";
        private JPanel painelPrincipal;
        private FilmePainelFormulario filmePainelFormulario;
        private FilmePainelTabela filmePainelTabela;
        private SalaPainelFormulario salaPainelFormulario;
        private SalaPainelTabela salaPainelTabela;

        public JanelaCrud(FilmeController filmeController, SalaController salaController) {
            this.filmeController = filmeController;
            this.filmeController.setJanela(this);
            this.salaController = salaController;
            this.salaController.setJanela(this);
            iniciaComponentes();
            filmeController.atualizaTabela();
            salaController.atualizaTabela();
            this.setTitle("Aplicação CRUD CineUP");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.pack();
            this.setVisible(true);
        }

        private void iniciaComponentes() {
            painelPrincipal = new JPanel(new CardLayout());
            filmePainelTabela = new FilmePainelTabela(filmeController);//filmeController);
            salaPainelTabela = new SalaPainelTabela(salaController);
            
            painelPrincipal.add(filmePainelTabela, PAINELTABELA);
            painelPrincipal.add(salaPainelTabela, PAINELTABELA);
            
            filmePainelFormulario = new FilmePainelFormulario(filmeController);
            salaPainelFormulario = new SalaPainelFormulario(salaController);
            
            painelPrincipal.add(filmePainelFormulario, PAINELFORM);
            painelPrincipal.add(salaPainelFormulario, PAINELFORM);

            this.add(painelPrincipal);
        }

        public void mostrarPainel(String painel) {
            CardLayout card = (CardLayout) (painelPrincipal.getLayout());
            card.show(painelPrincipal, painel);

        }

        public FilmePainelFormulario getFilmePainelFormulario() {
            return filmePainelFormulario;
        }

        public FilmePainelTabela getFilmePainelTabela() {
            return filmePainelTabela;
        }

        public void setFilmeController(FilmeController filmeController) {
            this.filmeController = filmeController;
        }
        
        
        public SalaPainelFormulario getSalaPainelFormulario() {
            return salaPainelFormulario;
        }

        public SalaPainelTabela getSalaPainelTabela() {
            return salaPainelTabela;
        }

        public void setSalaController(SalaController salaController) {
            this.salaController = salaController;
        }
        
        

}
