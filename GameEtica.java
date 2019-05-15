/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameetica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.border.LineBorder;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameEtica extends JFrame {
    
    Ambient img = new Ambient();
    JLabel Persona = img.ImportImg("persona-stack.png",0,0,80,110);
    JLabel Boneco1 = img.ImportImg("Boneco1.png",980,310,80,110);
    JLabel Boneco2 = img.ImportImg("Boneco2.png",1020,310,80,110);
    JLabel Boneco3 = img.ImportImg("boneco4.png",970,310,80,110);
    JLabel Pergunta1 = img.Pergunta("Olá me chamo Francisco e gostaria sabe a diferença");
    JLabel Pergunta12 = img.Pergunta("\" entre a 'moral' e a 'ética' ? \"");
    JLabel Pergunta2 = img.Pergunta("Olá, estou meio ansioso, porque me disseram que nós mudamos nossos valores. Diante disso");
    JLabel Pergunta22 = img.Pergunta("\" de que forma: \"");
    JLabel Pergunta3 = img.Pergunta("Olá, tenho milhões de duvidas sobre o ato imoral e amoral, já que você esta aqui");
    JLabel Pergunta33 = img.Pergunta("\" Sabe me dizer o que é imoral: \"");
    
    JButton BtnEscolha1 = img.ImportButton("Sim",100,280,560,90);
    JButton BtnEscolha2 = img.ImportButton("Sim",100,380,560,90);
    JButton BtnEscolha3 = img.ImportButton("Sim",810,280,520,90);
    JButton BtnEscolha4 = img.ImportButton("Sim",810,380,520,90);
    JPanel middleBloco = new JPanel();
    JPanel topBloco = new JPanel();
    JPanel footerBloco = new JPanel();
    JButton btnEscolha = new JButton();
    Container mainContainer = this.getContentPane();
    boolean parado = false;
    boolean acao = true;
    boolean time = false;
    int id = 0;
    int cenario = 1;
    
    
    public GameEtica(){
        setSize(700,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new MovimentoStart().start();
        controlePersona();
        mainContainer.setLayout(new BorderLayout(8,6));
        mainContainer.setBackground(Color.black);
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.black));
        mainContainer.add(PanelTop(),BorderLayout.NORTH);
        mainContainer.add(PanelMiddle(10),BorderLayout.CENTER);
        
        
    }
    public void controlePersona(){
        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {}
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 39 && parado == false){
                    Persona.setIcon(img.setImg("persona-walk1.png"));
                    Persona.setBounds(Persona.getX()+5,310,80,110);
                }else if(e.getKeyCode() == 37 && parado == false){
                    Persona.setIcon(img.setImg("persona-walk2.png"));
                    Persona.setBounds(Persona.getX()-5,310,80,110);
                }
            }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == 39 && parado == false){
                    Persona.setIcon(img.setImg("persona-stack.png"));
                }else if(e.getKeyCode() == 37 && parado == false){
                    Persona.setIcon(img.setImg("persona-stack.png"));
                }
            }
        });
        BtnEscolha3.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {
                if(cenario == 2){
                    acao = false;
                    parado = false;
                    time = true;
                    Pergunta1.setVisible(false);
                    Pergunta12.setVisible(false);
                    topBloco.remove(Pergunta1);
                    topBloco.remove(Pergunta12);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
                if(cenario == 3){
                    acao = false;
                    parado = false;
                    time = true;
                    Pergunta2.setVisible(false);
                    Pergunta22.setVisible(false);
                    topBloco.remove(Pergunta2);
                    topBloco.remove(Pergunta22);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
                if(cenario == 4){
                    acao = false;
                    parado = false;
                    time = true;
                    Pergunta3.setVisible(false);
                    Pergunta33.setVisible(false);
                    topBloco.remove(Pergunta3);
                    topBloco.remove(Pergunta33);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
            }
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        BtnEscolha2.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {
                if(cenario == 2){
                    acao = false;
                    parado = false;
                    time = true;
                    
                    Pergunta1.setVisible(false);
                    Pergunta12.setVisible(false);
                    topBloco.remove(Pergunta1);
                    topBloco.remove(Pergunta12);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
                if(cenario == 3){
                    acao = false;
                    parado = false;
                    time = true;
                    
                    Pergunta2.setVisible(false);
                    Pergunta22.setVisible(false);
                    topBloco.remove(Pergunta2);
                    topBloco.remove(Pergunta22);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
                if(cenario == 4){
                    acao = false;
                    parado = false;
                    time = true;
                    
                    Pergunta3.setVisible(false);
                    Pergunta33.setVisible(false);
                    topBloco.remove(Pergunta3);
                    topBloco.remove(Pergunta33);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
            }
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        BtnEscolha1.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {
                if(cenario == 2){
                    acao = false;
                    parado = false;
                    time = true;
                    
                    Pergunta1.setVisible(false);
                    Pergunta12.setVisible(false);
                    topBloco.remove(Pergunta1);
                    topBloco.remove(Pergunta12);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
                if(cenario == 3){
                    acao = false;
                    parado = false;
                    time = true;
                    
                    Pergunta2.setVisible(false);
                    Pergunta22.setVisible(false);
                    topBloco.remove(Pergunta2);
                    topBloco.remove(Pergunta22);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
                if(cenario == 4){
                    acao = false;
                    parado = false;
                    time = true;
                    
                    Pergunta3.setVisible(false);
                    Pergunta33.setVisible(false);
                    topBloco.remove(Pergunta3);
                    topBloco.remove(Pergunta33);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
            }
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        BtnEscolha4.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {
                if(cenario == 2){
                    acao = false;
                    parado = false;
                    time = true;
                    
                    Pergunta1.setVisible(false);
                    Pergunta12.setVisible(false);
                    topBloco.remove(Pergunta1);
                    topBloco.remove(Pergunta12);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
                if(cenario == 3){
                    acao = false;
                    parado = false;
                    time = true;
                    
                    Pergunta2.setVisible(false);
                    Pergunta22.setVisible(false);
                    topBloco.remove(Pergunta2);
                    topBloco.remove(Pergunta22);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
                if(cenario == 4){
                    acao = false;
                    parado = false;
                    time = true;
                    
                    Pergunta3.setVisible(false);
                    Pergunta33.setVisible(false);
                    topBloco.remove(Pergunta3);
                    topBloco.remove(Pergunta33);
                    BtnEscolha1.setVisible(false);
                    BtnEscolha2.setVisible(false);
                    BtnEscolha3.setVisible(false);
                    BtnEscolha4.setVisible(false);
                }
            }
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }
    public JPanel PanelTop(){
        topBloco.setBackground(Color.white);
        topBloco.setLayout(new GridLayout(4,4,4,4));
        topBloco.setBorder(new LineBorder(Color.black,3));
        topBloco.add(Pergunta1);
        topBloco.add(Pergunta12);
        topBloco.add(Pergunta2);
        topBloco.add(Pergunta22);
        topBloco.add(Pergunta3);
        topBloco.add(Pergunta33);
        return topBloco;
    }
    public JPanel PanelMiddle(int id){
        middleBloco.setBorder(new LineBorder(Color.BLACK,3));
        middleBloco.setLayout(null);
        int cont = 0;
        int distancia_piso = 0;
        int distancia_piso_mochila = 0;
        int distancia_fundo = id*278;
        
        middleBloco.add(BtnEscolha1);
        middleBloco.add(BtnEscolha2);
        middleBloco.add(BtnEscolha3);
        middleBloco.add(BtnEscolha4);
        middleBloco.add(Persona);
        middleBloco.add(Boneco1);
        middleBloco.add(Boneco2);
        middleBloco.add(Boneco3);
        Boneco1.setVisible(false);
        Boneco2.setVisible(false);
        while(cont <= id){
            middleBloco.add(img.ImportImg("mochila.png",distancia_piso_mochila,618,307,111));
            middleBloco.add(img.ImportImg("mochila.png",distancia_piso_mochila,520,307,111));
            middleBloco.add(img.ImportImg("piso.png",distancia_piso,420,307,111));
            distancia_piso += 307;
            distancia_piso_mochila += 298;
            middleBloco.add(img.ImportImg("fundo.png", distancia_fundo, 3, 287, 508));
            distancia_fundo -= 280;
            cont++;
        }
        
        
        return middleBloco;
    }
    public JPanel PanelFooter(){
        footerBloco.setBorder(new LineBorder(Color.BLACK,3));
        footerBloco.setLayout(null);
        footerBloco.setBackground(Color.cyan);
        btnEscolha.setBounds(100, 100, 120, 60);
        footerBloco.add(btnEscolha);
        return footerBloco;
    }
    class MovimentoStart extends Thread{
        int seg=100;
        int cont=2;
        int result;
        int passatempo=3;
        public void run(){
            while(true){
                try{sleep(seg);}catch(Exception erro){}
                movimentoInicial();
                movimentoCenario();
                actionP();
                if(passatempo == cenario){
                    passatempo++;
                    acao = true;
                }
            }
        }
        
        public void movimentoInicial(){
            result = cont%2;
            if(result == 0 && Persona.getX() <= 1350 && parado == false){
                Persona.setBounds(Persona.getX()+10,310,80,110);
                Persona.setIcon(img.setImg("persona-walk1.png"));
                cont++;
            }else if(result == 1 && Persona.getX() <= 1350 && parado == false){
                Persona.setBounds(Persona.getX()+10,310,80,110);
                Persona.setIcon(img.setImg("persona-walk2.png"));
                cont++;
            }else{
                Persona.setIcon(img.setImg("persona-stack.png"));
            }
            
        }
        public void movimentoCenario(){
            if(Persona.getX() > 1350 && cenario == 1){
                Persona.setBounds(-30,310,80,110);
                cenario = 2;
            }
            if(Persona.getX() < -40 && cenario == 2){
                Persona.setBounds(1350,310,80,110);
                cenario = 1;
            }
            if(Persona.getX() > 1350 && cenario == 2){
                Persona.setBounds(-30,310,80,110);
                cenario = 3;
            }
            if(Persona.getX() > 1350 && cenario == 3){
                Persona.setBounds(-30,310,80,110);
                cenario = 4;
            }
            if(Persona.getX() < -40 && cenario == 3){
                Persona.setBounds(1350,310,80,110);
                cenario = 2;                
            }
            if(Persona.getX() < -40 && cenario == 4){
                Persona.setBounds(1350,310,80,110);
                cenario = 3;                
            }
            if(cenario == 2){
                Boneco1.setVisible(true);
            }else{
                Boneco1.setVisible(false);
            }
            if(cenario == 3){
                Boneco2.setVisible(true);
            }else{
                Boneco2.setVisible(false);
            }
            if(cenario == 4){
                Boneco3.setVisible(true);
            }else{
                Boneco3.setVisible(false);
            }
        }
        public void actionP(){
            if(Persona.getX() > 940 && Persona.getX() < 1000 && cenario == 2 && acao == true){
                Persona.setIcon(img.setImg("persona-flow.png"));
                Pergunta1.setVisible(true);
                Pergunta12.setVisible(true);
                BtnEscolha1.setVisible(true);
                BtnEscolha1.setText("Não podemos diferenciar, são palavras sinônimas.");
                BtnEscolha2.setVisible(true);
                BtnEscolha2.setText("Moral é um conjunto de valores, e Ética é a reflexão sobre esses valores.");
                BtnEscolha3.setVisible(true);
                BtnEscolha3.setText("Moral é a prática da Ética no nosso dia a dia.");
                BtnEscolha4.setVisible(true);
                BtnEscolha4.setText("Moral é sinônimo de 'ética aplicada'.");
                parado = true;
            }
            if(Persona.getX() > 990 && Persona.getX() < 1020 && cenario == 3 && acao == true){
                Persona.setIcon(img.setImg("persona-flow.png"));
                Pergunta2.setVisible(true);
                Pergunta22.setVisible(true);
                BtnEscolha1.setVisible(true);
                BtnEscolha1.setText("Através da relexão dos nossos convivios morais.");
                BtnEscolha2.setVisible(true);
                BtnEscolha2.setText("Com o uso da ética com os grupos sociais a que pertence");
                BtnEscolha3.setVisible(true);
                BtnEscolha3.setText("Apenas com o modelo prático.");
                BtnEscolha4.setVisible(true);
                BtnEscolha4.setText("Na verdade, só pode ser atribuido valores para sí com a reflexão");
                parado = true;
            }
            if(Persona.getX() > 940 && Persona.getX() < 970 && cenario == 4 && acao == true){
                Persona.setIcon(img.setImg("persona-flow.png"));
                Pergunta3.setVisible(true);
                Pergunta33.setVisible(true);
                BtnEscolha1.setVisible(true);
                BtnEscolha1.setText("Imoral é tudo aquilo que vai contra os termos morais.");
                BtnEscolha2.setVisible(true);
                BtnEscolha2.setText("Imoral é quando se interfere nos ideias da ética de outro individuo");
                BtnEscolha3.setVisible(true);
                BtnEscolha3.setText("Imoral é o mesmo que Amoral");
                BtnEscolha4.setVisible(true);
                BtnEscolha4.setText("Imoral é como um ato inrregular em um certo grupo social");
                parado = true;
            }
            if(time == true && id < 40 && cenario == 2){
                BtnEscolha2.setVisible(true);
                BtnEscolha2.setBackground(Color.GREEN);
                id++;
            }
            if(id >= 40 && cenario == 2){
                BtnEscolha2.setVisible(false);
                BtnEscolha2.setBackground(Color.white);
                time = false;
                id =0;
            }
            if(time == true && id < 40 && cenario == 3){
                BtnEscolha1.setVisible(true);
                BtnEscolha1.setBackground(Color.GREEN);
                id++;
            }
            if(id >= 40 && cenario == 3){
                BtnEscolha1.setVisible(false);
                BtnEscolha1.setBackground(Color.white);
                time = false;
                id =0;
            }
            if(time == true && id < 40 && cenario == 4){
                BtnEscolha1.setVisible(true);
                BtnEscolha4.setVisible(true);
                BtnEscolha1.setBackground(Color.GREEN);
                BtnEscolha4.setBackground(Color.GREEN);
                id++;
            }
            if(id >= 40 && cenario == 4){
                BtnEscolha1.setVisible(false);
                BtnEscolha4.setVisible(false);
                BtnEscolha1.setBackground(Color.white);
                BtnEscolha4.setBackground(Color.white);
                time = false;
                id =0;
            }
        }
    }
    public static void main(String[] args) {
        new GameEtica();
    }
    
}
