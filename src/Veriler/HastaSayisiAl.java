
package Veriler;

import javax.swing.JOptionPane;

class HastaSayisiAl implements HastaSayisiGoster{
   
    int hastaSayisi;

    public void goster() {
        JOptionPane.showMessageDialog(null,"Güncel Hasta: "+hastaSayisi);
    }
    
}
