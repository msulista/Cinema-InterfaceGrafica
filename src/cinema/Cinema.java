/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import controller.FilmeController;
import view.JanelaCrud;

/**
 *
 * @author marcus.rodrigues
 */
public class Cinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FilmeController filmeController = new FilmeController();
        JanelaCrud janelaCrud = new JanelaCrud(filmeController);
        filmeController.setJanela(janelaCrud);
      
    }
    
}
