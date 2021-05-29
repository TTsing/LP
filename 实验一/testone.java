import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


@SuppressWarnings({"ALL", "AlibabaUndefineMagicConstant"})
public class testone  extends JFrame {

    /**
     * @param args
     */
    public JTextField jTextField4;
    public testone(){
        JFrame one = new JFrame("判断三角形");
        one.setSize(300, 500);
        one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        one.setLayout(null);

        JLabel Jlabel1 = new JLabel("请输入1至200的整数:",JLabel.CENTER);
        Jlabel1.setBounds(10, 10, 160, 30);
        one.add(Jlabel1);

        JLabel Jlabel2 = new JLabel("边长A：",JLabel.CENTER);
        Jlabel2.setBounds(40, 50, 50, 30);
        one.add(Jlabel2);

        final JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(100,56,100,20);
        one.add(jTextField1);

        jTextField1.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                jTextField1.setText("");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });

        JLabel Jlabel3 = new JLabel("边长B：",JLabel.CENTER);
        Jlabel3.setBounds(40, 100, 50, 30);
        one.add(Jlabel3);

        final JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(100,106,100,20);
        one.add(jTextField2);
        jTextField2.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                jTextField2.setText("");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });
        JLabel Jlabel4 = new JLabel("边长C：",JLabel.CENTER);
        Jlabel4.setBounds(40, 150, 50, 30);
        one.add(Jlabel4);

        final JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(100,156,100,20);
        one.add(jTextField3);



        jTextField3.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                jTextField3.setText("");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });


        JLabel Jlabel5 = new JLabel("形状：",JLabel.CENTER);
        Jlabel5.setBounds(40, 200, 50, 30);
        one.add(Jlabel5);

        jTextField4 = new JTextField();
        jTextField4.setBounds(100,206,100,20);
        one.add(jTextField4);

        JButton jButton = new JButton("判断形状");
        jButton.setBounds(20, 256, 90, 20);
        one.add(jButton);

        jButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                String a = jTextField1.getText();
                String b = jTextField2.getText();
                String c = jTextField3.getText();
                judge(a, b, c);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });


        JButton jButton2 = new JButton("重新输入");
        jButton2.setBounds(160, 256, 90, 20);
        one.add(jButton2);

        jButton2.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });

        one.setVisible(true);

    }
    public Boolean check(String a,String b,String c){
        char[]al =  a.toCharArray();
        char[]bl = b.toCharArray();
        char[]cl = c.toCharArray();

        for(int i = 0; i < al.length;i++){
            if(al[i] <= '0' || al[i] >= '9') return false;
        }
        for(int i = 0; i < bl.length;i++){
            if(bl[i] <= '0' || bl[i] >= '9') return false;
        }
        for(int i = 0; i < cl.length;i++){
            if(cl[i] <= '0' || cl[i] >= '9') return false;
        }
        return true;
    }

    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public void judge(String a, String b, String c){
//    	System.out.println(i);
//    	System.out.println(j);
//    	System.out.println(k);
        Integer i = 0,j = 0,k=0;
        if(!a.equals("") && !b.equals("") && !c.equals("") && check(a,b,c)) {
             i = new Integer(a);
             j = new Integer(b);
             k = new Integer(c);
            System.out.println(i+ "   " + j +"   " + k);
        }
        if(a.equals("") && b.equals("") && c.equals("")){
            creat("边长不能为空");
            jTextField4.setText("");
        }

        else if (i > 0 && i <= 200 && k > 0 && k <= 200 && j > 0 && j <= 200){
            //一般三角形
            if(i + j > k && i + k > j && k + j > i){
//    			System.out.println(i == j && j == k);
                if(i.equals(j) && j.equals(k))  jTextField4.setText("等边三角形");
                else if(i.equals(j) || j.equals(k) || i.equals(k))  jTextField4.setText("等腰三角形");
                else jTextField4.setText("普通三角形");
            }
            else jTextField4.setText("不能构成三角形");
        }

        else {
            creat("参数输入非法");
            jTextField4.setText("");
        }
    }



    public void creat(String a){
        JFrame jFrame = new JFrame();
        jFrame.setSize(200, 200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setDefaultLookAndFeelDecorated(true);
        jFrame.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                jFrame.dispose();
            }
        });
        jFrame.setLayout(null);


        JLabel jLabel = new JLabel(a);
        jLabel.setBounds(50,10,100,30);
        jFrame.add(jLabel);

        JButton jButton = new JButton("确定");
        jButton.setBounds(50,70,70,20);
        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                jFrame.dispose();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jFrame.add(jButton);


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        testone a = new testone();

    }

}
