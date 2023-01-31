package bingo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Stack;
/**
 *
 * @author ashah04
 */
public class MainFrame extends javax.swing.JFrame {

    private PriorityQueue <Integer> BQueue;
    private PriorityQueue <Integer> IQueue;
    private PriorityQueue <Integer> NQueue;
    private PriorityQueue <Integer> GQueue;
    private PriorityQueue <Integer> OQueue;
    
    List <Integer> Bcolumn = new ArrayList <> ();
    List <Integer> Icolumn = new ArrayList <> ();
    List <Integer> Ncolumn = new ArrayList <> ();
    List <Integer> Gcolumn = new ArrayList <> ();
    List <Integer> Ocolumn = new ArrayList <> ();
    
    private int [] BArray = new int [5];
    private int [] IArray = new int [5];
    private int [] NArray = new int [5];
    private int [] GArray = new int [5];
    private int [] OArray = new int [5];
    private Stack CardsDrawn = new Stack ();
    
    public MainFrame() {
        initComponents();
        BQueue = new PriorityQueue ();
        IQueue = new PriorityQueue ();
        NQueue = new PriorityQueue ();
        GQueue = new PriorityQueue ();
        OQueue = new PriorityQueue ();
        
        for (int i = 1; i < 16; i++) {
            Bcolumn.add(i);
        }
        for (int i = 16; i < 31; i++) {
            Icolumn.add(i);
        }
        for (int i = 31; i < 46; i++) {
            Ncolumn.add(i);
        }
        for (int i = 46; i < 61; i++) {
            Gcolumn.add(i);
        }
        for (int i = 61; i < 76; i++) {
            Ocolumn.add(i);
        }
        
        Collections.shuffle(Bcolumn);
        Collections.shuffle(Icolumn);
        Collections.shuffle(Ncolumn);
        Collections.shuffle(Gcolumn);
        Collections.shuffle(Ocolumn);
        
        for (int i = 0; i < 5; i++) {
            BArray[i] = Bcolumn.get(i);
            System.out.println(BArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            IArray[i] = Icolumn.get(i);
        }
        for (int i = 0; i < 5; i++) {
            NArray[i] = Ncolumn.get(i);
        }
        for (int i = 0; i < 5; i++) {
            GArray[i] = Gcolumn.get(i);
        }
        for (int i = 0; i < 5; i++) {
            OArray[i] = Ocolumn.get(i);
        }
        
        for (int i = 0; i < 5; i++) {
            BQueue.add(BArray[i]);
            System.out.println(BQueue);
        }
        for (int i = 0; i < 5; i++) {
            IQueue.add(IArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            NQueue.add(NArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            GQueue.add(GArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            OQueue.add(OArray[i]);
        }
        
        setBButton();
        setIButton();
        setNButton();
        setGButton();
        setOButton();
    }   
    
    private void setBButton(){
        Button1.setText(BQueue.remove().toString());
        Button6.setText(BQueue.remove().toString());
        Button11.setText(BQueue.remove().toString());
        Button16.setText(BQueue.remove().toString());
        Button21.setText(BQueue.remove().toString());
    }
    
    private void setIButton(){
        Button2.setText(IQueue.remove().toString());
        Button7.setText(IQueue.remove().toString());
        Button12.setText(IQueue.remove().toString());
        Button17.setText(IQueue.remove().toString());
        Button22.setText(IQueue.remove().toString());
    }
    
    private void setNButton(){
        Button3.setText(NQueue.remove().toString());
        Button8.setText(NQueue.remove().toString());
        Button13.setText(NQueue.remove().toString());
        Button18.setText(NQueue.remove().toString());
        Button23.setText(NQueue.remove().toString());
    }
    
    private void setGButton(){
        Button4.setText(GQueue.remove().toString());
        Button9.setText(GQueue.remove().toString());
        Button14.setText(GQueue.remove().toString());
        Button19.setText(GQueue.remove().toString());
        Button24.setText(GQueue.remove().toString());
    }
    
    private void setOButton(){
        Button5.setText(OQueue.remove().toString());
        Button10.setText(OQueue.remove().toString());
        Button15.setText(OQueue.remove().toString());
        Button20.setText(OQueue.remove().toString());
        Button25.setText(OQueue.remove().toString());
    }
    
    private void Random(){
        BQueue = new PriorityQueue ();
        IQueue = new PriorityQueue ();
        NQueue = new PriorityQueue ();
        GQueue = new PriorityQueue ();
        OQueue = new PriorityQueue ();
        
        for (int i = 1; i < 16; i++) {
            Bcolumn.add(i);
        }
        for (int i = 16; i < 31; i++) {
            Icolumn.add(i);
        }
        for (int i = 31; i < 46; i++) {
            Ncolumn.add(i);
        }
        for (int i = 46; i < 61; i++) {
            Gcolumn.add(i);
        }
        for (int i = 61; i < 76; i++) {
            Ocolumn.add(i);
        }
        
        Collections.shuffle(Bcolumn);
        Collections.shuffle(Icolumn);
        Collections.shuffle(Ncolumn);
        Collections.shuffle(Gcolumn);
        Collections.shuffle(Ocolumn);
        
        for (int i = 0; i < 5; i++) {
            BArray[i] = Bcolumn.get(i);
            System.out.println(BArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            IArray[i] = Icolumn.get(i);
        }
        for (int i = 0; i < 5; i++) {
            NArray[i] = Ncolumn.get(i);
        }
        for (int i = 0; i < 5; i++) {
            GArray[i] = Gcolumn.get(i);
        }
        for (int i = 0; i < 5; i++) {
            OArray[i] = Ocolumn.get(i);
        }
        
        for (int i = 0; i < 5; i++) {
            BQueue.add(BArray[i]);
            System.out.println(BQueue);
        }
        for (int i = 0; i < 5; i++) {
            IQueue.add(IArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            NQueue.add(NArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            GQueue.add(GArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            OQueue.add(OArray[i]);
        }
        
        setBButton();
        setIButton();
        setNButton();
        setGButton();
        setOButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BingoTopPanel = new javax.swing.JPanel();
        B = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        O = new javax.swing.JLabel();
        BoardPanel = new javax.swing.JPanel();
        Button1 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button11 = new javax.swing.JButton();
        Button16 = new javax.swing.JButton();
        Button21 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button12 = new javax.swing.JButton();
        Button17 = new javax.swing.JButton();
        Button22 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button13 = new javax.swing.JButton();
        Button18 = new javax.swing.JButton();
        Button23 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button14 = new javax.swing.JButton();
        Button19 = new javax.swing.JButton();
        Button24 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button10 = new javax.swing.JButton();
        Button15 = new javax.swing.JButton();
        Button20 = new javax.swing.JButton();
        Button25 = new javax.swing.JButton();
        SideBallPanel = new javax.swing.JPanel();
        UndoButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        BingoButton = new javax.swing.JButton();
        FirstNumber = new javax.swing.JLabel();
        NextButton = new javax.swing.JButton();
        SecondNumber = new javax.swing.JLabel();
        ThirdNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BingoTopPanel.setLayout(new java.awt.GridLayout(1, 0));

        B.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        B.setForeground(new java.awt.Color(255, 102, 0));
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.setText("B");
        B.setPreferredSize(new java.awt.Dimension(10, 15));
        B.setVerifyInputWhenFocusTarget(false);
        B.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BingoTopPanel.add(B);

        I.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        I.setForeground(new java.awt.Color(255, 204, 0));
        I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I.setText("I");
        I.setPreferredSize(new java.awt.Dimension(10, 15));
        I.setVerifyInputWhenFocusTarget(false);
        I.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BingoTopPanel.add(I);

        N.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        N.setForeground(new java.awt.Color(204, 0, 0));
        N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N.setText("N");
        N.setPreferredSize(new java.awt.Dimension(10, 15));
        N.setVerifyInputWhenFocusTarget(false);
        N.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BingoTopPanel.add(N);

        G.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        G.setForeground(new java.awt.Color(51, 51, 255));
        G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G.setText("G");
        G.setPreferredSize(new java.awt.Dimension(10, 15));
        G.setVerifyInputWhenFocusTarget(false);
        G.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BingoTopPanel.add(G);

        O.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        O.setForeground(new java.awt.Color(204, 0, 204));
        O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        O.setText("O");
        O.setPreferredSize(new java.awt.Dimension(10, 15));
        O.setVerifyInputWhenFocusTarget(false);
        O.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BingoTopPanel.add(O);

        BoardPanel.setBackground(new java.awt.Color(204, 204, 204));
        BoardPanel.setForeground(new java.awt.Color(204, 204, 0));

        Button1.setBackground(new java.awt.Color(0, 0, 0));
        Button1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 102, 0));
        Button1.setText("[1]");
        Button1.setPreferredSize(new java.awt.Dimension(10, 15));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(0, 0, 0));
        Button6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 102, 0));
        Button6.setText("[6]");
        Button6.setPreferredSize(new java.awt.Dimension(10, 15));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button11.setBackground(new java.awt.Color(0, 0, 0));
        Button11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button11.setForeground(new java.awt.Color(255, 102, 0));
        Button11.setText("[11]");
        Button11.setPreferredSize(new java.awt.Dimension(10, 15));
        Button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });

        Button16.setBackground(new java.awt.Color(0, 0, 0));
        Button16.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button16.setForeground(new java.awt.Color(255, 102, 0));
        Button16.setText("[16]");
        Button16.setPreferredSize(new java.awt.Dimension(10, 15));
        Button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button16ActionPerformed(evt);
            }
        });

        Button21.setBackground(new java.awt.Color(0, 0, 0));
        Button21.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button21.setForeground(new java.awt.Color(255, 102, 0));
        Button21.setText("[21]");
        Button21.setPreferredSize(new java.awt.Dimension(10, 15));
        Button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button21ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(0, 0, 0));
        Button2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 204, 0));
        Button2.setText("[2]");
        Button2.setPreferredSize(new java.awt.Dimension(10, 15));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button7.setBackground(new java.awt.Color(0, 0, 0));
        Button7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 204, 0));
        Button7.setText("[7]");
        Button7.setPreferredSize(new java.awt.Dimension(10, 15));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button12.setBackground(new java.awt.Color(0, 0, 0));
        Button12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button12.setForeground(new java.awt.Color(255, 204, 0));
        Button12.setText("[12]");
        Button12.setPreferredSize(new java.awt.Dimension(10, 15));
        Button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button12ActionPerformed(evt);
            }
        });

        Button17.setBackground(new java.awt.Color(0, 0, 0));
        Button17.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button17.setForeground(new java.awt.Color(255, 204, 0));
        Button17.setText("[17]");
        Button17.setPreferredSize(new java.awt.Dimension(10, 15));
        Button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button17ActionPerformed(evt);
            }
        });

        Button22.setBackground(new java.awt.Color(0, 0, 0));
        Button22.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button22.setForeground(new java.awt.Color(255, 204, 0));
        Button22.setText("[22]");
        Button22.setPreferredSize(new java.awt.Dimension(10, 15));
        Button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button22ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(0, 0, 0));
        Button3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button3.setForeground(new java.awt.Color(204, 0, 0));
        Button3.setText("[3]");
        Button3.setPreferredSize(new java.awt.Dimension(10, 15));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(0, 0, 0));
        Button8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button8.setForeground(new java.awt.Color(204, 0, 0));
        Button8.setText("[8]");
        Button8.setPreferredSize(new java.awt.Dimension(10, 15));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button13.setBackground(new java.awt.Color(0, 0, 0));
        Button13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button13.setForeground(new java.awt.Color(204, 0, 0));
        Button13.setText("[13]");
        Button13.setPreferredSize(new java.awt.Dimension(10, 15));
        Button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button13ActionPerformed(evt);
            }
        });

        Button18.setBackground(new java.awt.Color(0, 0, 0));
        Button18.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button18.setForeground(new java.awt.Color(204, 0, 0));
        Button18.setText("[18]");
        Button18.setPreferredSize(new java.awt.Dimension(10, 15));
        Button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button18ActionPerformed(evt);
            }
        });

        Button23.setBackground(new java.awt.Color(0, 0, 0));
        Button23.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button23.setForeground(new java.awt.Color(204, 0, 0));
        Button23.setText("[23]");
        Button23.setPreferredSize(new java.awt.Dimension(10, 15));
        Button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button23ActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(0, 0, 0));
        Button4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button4.setForeground(new java.awt.Color(51, 51, 255));
        Button4.setText("[4]");
        Button4.setPreferredSize(new java.awt.Dimension(10, 15));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(0, 0, 0));
        Button9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button9.setForeground(new java.awt.Color(51, 51, 255));
        Button9.setText("[9]");
        Button9.setPreferredSize(new java.awt.Dimension(10, 15));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button14.setBackground(new java.awt.Color(0, 0, 0));
        Button14.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button14.setForeground(new java.awt.Color(51, 51, 255));
        Button14.setText("[14]");
        Button14.setPreferredSize(new java.awt.Dimension(10, 15));
        Button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button14ActionPerformed(evt);
            }
        });

        Button19.setBackground(new java.awt.Color(0, 0, 0));
        Button19.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button19.setForeground(new java.awt.Color(51, 51, 255));
        Button19.setText("[19]");
        Button19.setPreferredSize(new java.awt.Dimension(10, 15));
        Button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button19ActionPerformed(evt);
            }
        });

        Button24.setBackground(new java.awt.Color(0, 0, 0));
        Button24.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button24.setForeground(new java.awt.Color(51, 51, 255));
        Button24.setText("[24]");
        Button24.setPreferredSize(new java.awt.Dimension(10, 15));
        Button24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button24ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(0, 0, 0));
        Button5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button5.setForeground(new java.awt.Color(204, 0, 204));
        Button5.setText("[5]");
        Button5.setPreferredSize(new java.awt.Dimension(10, 15));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button10.setBackground(new java.awt.Color(0, 0, 0));
        Button10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button10.setForeground(new java.awt.Color(204, 0, 204));
        Button10.setText("[10]");
        Button10.setPreferredSize(new java.awt.Dimension(10, 15));
        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });

        Button15.setBackground(new java.awt.Color(0, 0, 0));
        Button15.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button15.setForeground(new java.awt.Color(204, 0, 204));
        Button15.setText("[15]");
        Button15.setPreferredSize(new java.awt.Dimension(10, 15));
        Button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button15ActionPerformed(evt);
            }
        });

        Button20.setBackground(new java.awt.Color(0, 0, 0));
        Button20.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button20.setForeground(new java.awt.Color(204, 0, 204));
        Button20.setText("[20]");
        Button20.setPreferredSize(new java.awt.Dimension(10, 15));
        Button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button20ActionPerformed(evt);
            }
        });

        Button25.setBackground(new java.awt.Color(0, 0, 0));
        Button25.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Button25.setForeground(new java.awt.Color(204, 0, 204));
        Button25.setText("[25]");
        Button25.setPreferredSize(new java.awt.Dimension(10, 15));
        Button25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BoardPanelLayout = new javax.swing.GroupLayout(BoardPanel);
        BoardPanel.setLayout(BoardPanelLayout);
        BoardPanelLayout.setHorizontalGroup(
            BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BoardPanelLayout.createSequentialGroup()
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BoardPanelLayout.createSequentialGroup()
                        .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BoardPanelLayout.createSequentialGroup()
                                .addComponent(Button23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BoardPanelLayout.createSequentialGroup()
                                .addComponent(Button18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BoardPanelLayout.createSequentialGroup()
                                .addComponent(Button13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BoardPanelLayout.createSequentialGroup()
                                .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BoardPanelLayout.setVerticalGroup(
            BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button19, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button24, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button25, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SideBallPanel.setBackground(new java.awt.Color(153, 153, 153));

        UndoButton.setBackground(new java.awt.Color(102, 102, 102));
        UndoButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        UndoButton.setText("Undo");
        UndoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoButtonActionPerformed(evt);
            }
        });

        ResetButton.setBackground(new java.awt.Color(153, 153, 153));
        ResetButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(255, 0, 0));
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        BingoButton.setBackground(new java.awt.Color(153, 153, 153));
        BingoButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BingoButton.setForeground(new java.awt.Color(0, 153, 0));
        BingoButton.setText("Bingo");
        BingoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BingoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideBallPanelLayout = new javax.swing.GroupLayout(SideBallPanel);
        SideBallPanel.setLayout(SideBallPanelLayout);
        SideBallPanelLayout.setHorizontalGroup(
            SideBallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBallPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SideBallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UndoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BingoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SideBallPanelLayout.setVerticalGroup(
            SideBallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBallPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BingoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(UndoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FirstNumber.setBackground(new java.awt.Color(153, 153, 153));
        FirstNumber.setText("       ");
        FirstNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NextButton.setBackground(new java.awt.Color(102, 102, 102));
        NextButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        NextButton.setText("Call");
        NextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FirstNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ThirdNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(SecondNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BingoTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SideBallPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BingoTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(BoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(SideBallPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(FirstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(SecondNumber)
                .addGap(33, 33, 33)
                .addComponent(ThirdNumber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        Button6.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        Button9.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button11ActionPerformed
        Button11.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button11ActionPerformed

    private void Button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button12ActionPerformed
        Button12.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button12ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        Button2.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        Button7.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        Button8.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        Button1.setBackground(Color.GREEN);
       
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        Button3.setBackground(Color.GREEN);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        Button4.setBackground(Color.GREEN);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        Button5.setBackground(Color.GREEN);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10ActionPerformed
        Button10.setBackground(Color.GREEN);
    }//GEN-LAST:event_Button10ActionPerformed

    private void Button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button13ActionPerformed
        Button13.setBackground(Color.GREEN);
    }//GEN-LAST:event_Button13ActionPerformed

    private void Button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button14ActionPerformed
        Button14.setBackground(Color.GREEN);
    }//GEN-LAST:event_Button14ActionPerformed

    private void Button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button15ActionPerformed
        Button15.setBackground(Color.GREEN);
    }//GEN-LAST:event_Button15ActionPerformed

    private void Button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button16ActionPerformed
        Button16.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button16ActionPerformed

    private void Button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button17ActionPerformed
        Button17.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button17ActionPerformed

    private void Button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button18ActionPerformed
        Button18.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button18ActionPerformed

    private void Button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button19ActionPerformed
        Button19.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button19ActionPerformed

    private void Button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button20ActionPerformed
        Button20.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button20ActionPerformed

    private void Button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button21ActionPerformed
       Button21.setBackground(Color.GREEN); // TODO add your handling code here:
    }//GEN-LAST:event_Button21ActionPerformed

    private void Button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button22ActionPerformed
        Button22.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button22ActionPerformed

    private void Button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button23ActionPerformed
        Button23.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button23ActionPerformed

    private void Button24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button24ActionPerformed
        Button24.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button24ActionPerformed

    private void Button25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button25ActionPerformed
        Button25.setBackground(Color.GREEN);// TODO add your handling code here:
    }//GEN-LAST:event_Button25ActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        Random();
        Button1.setBackground(Color.BLACK);
        Button2.setBackground(Color.BLACK);
        Button3.setBackground(Color.BLACK);
        Button4.setBackground(Color.BLACK);
        Button5.setBackground(Color.BLACK);
        Button6.setBackground(Color.BLACK);
        Button7.setBackground(Color.BLACK);
        Button8.setBackground(Color.BLACK);
        Button9.setBackground(Color.BLACK);
        Button10.setBackground(Color.BLACK);
        Button11.setBackground(Color.BLACK);
        Button12.setBackground(Color.BLACK);
        Button13.setBackground(Color.BLACK);
        Button14.setBackground(Color.BLACK);
        Button15.setBackground(Color.BLACK);
        Button16.setBackground(Color.BLACK);
        Button17.setBackground(Color.BLACK);
        Button18.setBackground(Color.BLACK);
        Button19.setBackground(Color.BLACK);
        Button20.setBackground(Color.BLACK);
        Button21.setBackground(Color.BLACK);
        Button22.setBackground(Color.BLACK);
        Button23.setBackground(Color.BLACK);
        Button24.setBackground(Color.BLACK);
        Button25.setBackground(Color.BLACK);
        
        
        
         
        
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        BingoCard ball = new BingoCard();      
        CardsDrawn.add(ball.getRandomNumbers());
        for (int i=0; i<=75; i++){
            FirstNumber.setText("         " +(String) CardsDrawn.get(i));
        if (i == 1){
            FirstNumber.setText("         " + (String) CardsDrawn.get(i));
            SecondNumber.setText("         " + (String) CardsDrawn.get(i-1));
        }
        if (i>=2) {
            FirstNumber.setText("         "  + (String) CardsDrawn.get(i));
            SecondNumber.setText("         " +(String) CardsDrawn.get(i-1));
            ThirdNumber.setText("         " + (String) CardsDrawn.get(i-2));
        }
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    private void UndoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoButtonActionPerformed
     
        Button1.setBackground(Color.BLACK);
        Button2.setBackground(Color.BLACK);
        Button3.setBackground(Color.BLACK);
        Button4.setBackground(Color.BLACK);
        Button5.setBackground(Color.BLACK);
        Button6.setBackground(Color.BLACK);
        Button7.setBackground(Color.BLACK);
        Button8.setBackground(Color.BLACK);
        Button9.setBackground(Color.BLACK);
        Button10.setBackground(Color.BLACK);
        Button11.setBackground(Color.BLACK);
        Button12.setBackground(Color.BLACK);
        Button13.setBackground(Color.BLACK);
        Button14.setBackground(Color.BLACK);
        Button15.setBackground(Color.BLACK);
        Button16.setBackground(Color.BLACK);
        Button17.setBackground(Color.BLACK);
        Button18.setBackground(Color.BLACK);
        Button19.setBackground(Color.BLACK);
        Button20.setBackground(Color.BLACK);
        Button21.setBackground(Color.BLACK);
        Button22.setBackground(Color.BLACK);
        Button23.setBackground(Color.BLACK);
        Button24.setBackground(Color.BLACK);
        Button25.setBackground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_UndoButtonActionPerformed

    private void BingoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BingoButtonActionPerformed
        //int array = array [];
    }//GEN-LAST:event_BingoButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B;
    private javax.swing.JButton BingoButton;
    private javax.swing.JPanel BingoTopPanel;
    private javax.swing.JPanel BoardPanel;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button11;
    private javax.swing.JButton Button12;
    private javax.swing.JButton Button13;
    private javax.swing.JButton Button14;
    private javax.swing.JButton Button15;
    private javax.swing.JButton Button16;
    private javax.swing.JButton Button17;
    private javax.swing.JButton Button18;
    private javax.swing.JButton Button19;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button20;
    private javax.swing.JButton Button21;
    private javax.swing.JButton Button22;
    private javax.swing.JButton Button23;
    private javax.swing.JButton Button24;
    private javax.swing.JButton Button25;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JLabel FirstNumber;
    private javax.swing.JLabel G;
    private javax.swing.JLabel I;
    private javax.swing.JLabel N;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel O;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel SecondNumber;
    private javax.swing.JPanel SideBallPanel;
    private javax.swing.JLabel ThirdNumber;
    private javax.swing.JButton UndoButton;
    // End of variables declaration//GEN-END:variables
}
