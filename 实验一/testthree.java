import java.awt.event.*;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class testthree  extends JFrame {

    HashMap<Integer,Integer> kiss = new HashMap<Integer, Integer>(){
    };
    /**
     * @param args
     */
    public JTextField jTextField4;
    public testthree(){
        JFrame one = new JFrame("登录界面");
        one.setSize(300, 500);
        one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        one.setLayout(null);

        JLabel Jlabel1 = new JLabel("欢迎回来",JLabel.CENTER);
        Jlabel1.setBounds(10, 10, 160, 30);
        one.add(Jlabel1);

        JLabel Jlabel2 = new JLabel("用户名",JLabel.CENTER);
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

        JLabel Jlabel3 = new JLabel("密码",JLabel.CENTER);
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
//        JLabel Jlabel4 = new JLabel("日：",JLabel.CENTER);
//        Jlabel4.setBounds(40, 150, 50, 30);
//        one.add(Jlabel4);
//
//        final JTextField jTextField3 = new JTextField();
//        jTextField3.setBounds(100,156,100,20);
//        one.add(jTextField3);
//
//
//
//        jTextField3.addMouseListener(new MouseListener() {
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                // TODO Auto-generated method stub
//
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                // TODO Auto-generated method stub
//                jTextField3.setText("");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                // TODO Auto-generated method stub
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                // TODO Auto-generated method stub
//
//            }
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                // TODO Auto-generated method stub
//
//            }
//        });
//
//
//        JLabel Jlabel5 = new JLabel("下一天：",JLabel.CENTER);
//        Jlabel5.setBounds(30, 200, 60, 30);
//        one.add(Jlabel5);
//
//        jTextField4 = new JTextField();
//        jTextField4.setBounds(100,206,100,20);
//        one.add(jTextField4);

        JButton jButton = new JButton("登录");
        jButton.setBounds(20, 256, 110, 30);
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
                judge(a, b);
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
        jButton2.setBounds(160, 256, 90, 30);
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


    public void judge(String a,String b){
        char str1 =0;
        if(a.length() != 0) str1 = a.charAt(0);
        if(a.length() == 0 || b.length() == 0) creat("长度不能为空");
        else if( !((str1 >= 'a' && str1 <= 'z')  || (str1 >= 'A' && str1 <= 'Z'))) creat("用户名的格式输入不正确");
        else if(yaosuo(a,b)) creat("长度不规范");
        else if(!check(a))  creat("用户名只能为数字和字符组成");
        else if(!checkmima(b))  creat("密码只能为数字组成");
        else creat("合法");
    }
    public boolean yaosuo(String ass,String abb){
        if(ass.length()>=6 && ass.length()<=10 && abb.length() == 6) return  false;
        else return true;
    }
    public boolean checkmima(String prespect){
        char[] pret = prespect.toCharArray();
        for(int i = 0; i < pret.length; i++){
            if(!k(pret[i])) return false;
        }
        return  true;
    }

    public boolean check(String prespect){
        char[] pret = prespect.toCharArray();
        for(int i = 0; i < pret.length; i++){
            if(!kkkkkkkkk(pret[i])) return false;
        }
        return  true;
    }
    public Boolean k(char nice){
         if (nice >= '0' && nice <= '9') return  true;
        else return  false;
    }
    public Boolean kkkkkkkkk(char nice){
        if(nice >= 'a' && nice <='z') return true;
        else if (nice >= 'A' && nice <= 'Z') return  true;
        else if (nice >= '0' && nice <= '9') return  true;
        else return  false;
    }


    public void creat(String a){
        final JFrame jFrame = new JFrame();
        jFrame.setSize(200, 200);
        jFrame.setVisible(true);
        jFrame.setBounds(20,270,200,200);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setDefaultLookAndFeelDecorated(true);
        jFrame.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                jFrame.dispose();
            }
        });
        jFrame.setLayout(null);


        JLabel jLabel = new JLabel(a);
        jLabel.setBounds(50,10,150,30);
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
        testthree a = new testthree();

    }

}
