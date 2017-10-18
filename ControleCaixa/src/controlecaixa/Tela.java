package controlecaixa;

import bean.Caixa;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela extends JFrame implements ActionListener, WindowListener {
    
    //Definindo Atributos da Janela
    protected Dimension dFrame, dLabel, dTextField, dButton, dTextArea; //Dimension - Para posicionar os objetos na tela usando o construtor
    protected Label lblValor, lblSaldo; //Label - Componente para exibir texto simples na tela
    protected TextField txtValor, txtSaldo; //TextField - Componente para entrada de dados em forma de texto
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSaida;    //Button - Botão para usuário clicar e realizar uma ação
    protected TextArea txtMsg;  //TextArea - Campo de texto para retorno de mensagens
    private final Caixa caixa;  //Atributo do tipo caixa para utilização
    
    /**
     *  Método Construtor
     * 
     *  Esse método sera responsável por iniciar
     *  os componentes definidos para essa Tela.
     */
    public Tela(){
        
        //Instanciando um objeto do tipo caixa
        this.caixa = new Caixa();
        
        //Indicando qual o tamanho dos componentes em pixels
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);
        dTextArea = new Dimension(300, 140);
        
        //Definindo propriedades dessa janela
        this.setTitle("Controle de Caixa");
        this.setResizable(false);
        this.setSize(dFrame);
        this.setBackground(Color.lightGray);
        this.setLayout(null);
        
        //Definindo o Primeiro Label
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        
        //Definindo o Segundo Label
        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        
        //Definindo o Primeiro TextField
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        
        //Definindo o Segundo TextField
        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        
        //Definindo o Primeiro Botão
        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        
        //Definindo o Segundo Botão
        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        
        //Definindo o Terceiro Botão
        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180, 150);
        
        //Definindo o Quarto Botão
        cmdSaida = new Button("Sair");
        cmdSaida.setSize(dButton);
        cmdSaida.setLocation(180, 185);
        
        //Definindo a TextArea
        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        
        //Adicionando os Componentes a Janela
        this.add(this.lblValor);
        this.add(this.lblSaldo);
        this.add(this.txtValor);
        this.add(this.txtSaldo);
        this.add(this.cmdEntrada);
        this.add(this.cmdConsulta);
        this.add(this.cmdRetirada);
        this.add(this.cmdSaida);
        this.add(this.txtMsg);
        
        //Instanciando os Listeners
        ActionListener AL = this;
        WindowListener WL = this;
        
        //Adicionando Listeners
        cmdEntrada.addActionListener(AL);
        cmdRetirada.addActionListener(AL);
        cmdConsulta.addActionListener(AL);
        cmdSaida.addActionListener(AL);
        this.addWindowListener(WL);
        
    }
    
    /**
     * Esse Método Tratara ações de origem dos Botões
     * 
     * @param e
     *      - Recebe a ação realizada pelo usuário ao 
     *      clicar em algum dos botões da Tela
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == cmdSaida){
            
            //Ações para o botão Sair
            this.dispose();
            System.exit(0);
        }
        else if (e.getSource() == cmdEntrada){
            
            //Ações para o botão Entrada
            double valor = Double.parseDouble(txtValor.getText());
            txtValor.setText("");
            txtValor.requestFocus();
            txtSaldo.setText(null);
            
            if (this.caixa.depositar(valor)){
                
                JOptionPane.showMessageDialog(null, "Depósito efetuado com Sucesso");
                txtMsg.append("Deposito realizado com Sucesso: " + valor + " Reais \n");
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Valor Inválido!");
            }
        }
        else if (e.getSource() == cmdRetirada){
            
            //Ações para o botão Retirada
            double valor = Double.parseDouble(txtValor.getText());
            txtValor.setText("");
            txtValor.requestFocus();
            txtSaldo.setText(null);
            
            if (this.caixa.sacar(valor)){
                
                JOptionPane.showMessageDialog(null, "Saque efetuado com Sucesso");
                txtMsg.append("Saque realizado com Sucesso: " + valor + " Reais \n");
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Você não possui esse saldo!");
            }
        }
        else if (e.getSource() == cmdConsulta){
            
            txtSaldo.setText(null);
            txtSaldo.setText(String.valueOf(caixa.getSaldo()));
            txtMsg.append("Consulta Efetuada com Saldo Atual \n");
            txtValor.setText(null);
            txtValor.requestFocus();
        }
    }
    
    @Override
    public void windowOpened(WindowEvent e) {}
    
    @Override
    public void windowClosing(WindowEvent e) {
        
        //Ação do botão fechar da Janela
        this.dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}   
    
}
