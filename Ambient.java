/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameetica;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
/**
 *
 * @author toscano
 */
public class Ambient {
    Font fonteButton = new Font("Courier New",Font.ITALIC | Font.BOLD,12);
    public JLabel ImportImg(String img, int width,int height,int wdimg,int heimg){
        ImageIcon image = new ImageIcon(getClass().getResource(img));
        JLabel importe = new JLabel(image);
        importe.setBounds(width,height,wdimg,heimg);
        return importe;
    }
    public JLabel ImportText(String text){
        JLabel importText = new JLabel(text,SwingConstants.CENTER);
        importText.setOpaque(true);
        importText.setBorder(new LineBorder(Color.black,3));
        importText.setBackground(Color.cyan);
        return importText;
    }
    public JLabel Pergunta(String pergunta){
        JLabel importPergunta = new JLabel(pergunta);
        importPergunta.setFont(new Font("Courier New",Font.ITALIC | Font.BOLD,20));
        importPergunta.setVisible(false);
        return importPergunta;
    }
    public ImageIcon setImg(String text){
        ImageIcon image = new ImageIcon(getClass().getResource(text));
        return image;
    }
    public JButton ImportButton(String Text,int width,int height,int wdimg,int heimg){
        JButton button = new JButton(Text);
        button.setBounds(width,height,wdimg,heimg);
        button.setFont(fonteButton);
        button.setBackground(Color.white);
        button.setVisible(false);
        return button;
    }
}
