/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframeestacionamento;

/**
 *
 * @author LABORATORIO_INFO
 */
public class RodaSplash {

    public static void main(String[] args) {
        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);

        JFLoginNovo pr = new JFLoginNovo();

        try {

            for (int i = 0; i <= 100;
                    i++) {
                Thread.sleep(10);
                splash.lblporcentagem.setText(Integer.toString(i) + "%");
                splash.brProgressBar.setValue(i);
                if (i == 100) {

                    splash.dispose();
                    pr.setVisible(true);
                }

            }
        } catch (Exception e) {

        }
    }

}
