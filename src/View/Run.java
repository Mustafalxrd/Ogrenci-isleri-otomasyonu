package View;

import Model.Model_Yonetici;

public class Run {

    public static void main(String[] args) {
       new Controller.Controller_Veritabani().TabloOlustur();
       new View_AnaPencere().setVisible(true);
    }
}
