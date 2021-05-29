import java.awt.event.*;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class testtwo  extends JFrame {

    HashMap<Integer,Integer> kiss = new HashMap<Integer, Integer>(){
    };
    /**
     * @param args
     */
    public JTextField jTextField4;
    public testtwo(){
        JFrame one = new JFrame("日历");
        one.setSize(300, 500);
        one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        one.setLayout(null);

        JLabel Jlabel1 = new JLabel("请分别输入年、月、日",JLabel.CENTER);
        Jlabel1.setBounds(10, 10, 160, 30);
        one.add(Jlabel1);

        JLabel Jlabel2 = new JLabel("年：",JLabel.CENTER);
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

        JLabel Jlabel3 = new JLabel("月：",JLabel.CENTER);
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
        JLabel Jlabel4 = new JLabel("日：",JLabel.CENTER);
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


        JLabel Jlabel5 = new JLabel("下一天：",JLabel.CENTER);
        Jlabel5.setBounds(30, 200, 60, 30);
        one.add(Jlabel5);

        jTextField4 = new JTextField();
        jTextField4.setBounds(100,206,100,20);
        one.add(jTextField4);

        JButton jButton = new JButton("计算下一天");
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
                jTextField3.setText("");
                jTextField4.setText("");
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
    //判断字符串中是否有非法字符
    public Boolean rejudge(String a){

        char[] ans = a.toCharArray();
        for(int i = 0; i < ans.length; i++){
            if(ans[i] < '0' || ans[i] > '9') return false;
        }
        return true;
    }
    //判断日期是否合理
    public Boolean datajudge(Integer year,Integer mouth,Integer day){
        Integer ans1 = year % 4;
        Integer ans2 = year % 100;
        Integer ans3 = year % 400;
        if(year <= 0) return false;
        //System.out.println((ans1.equals(0) && !ans2.equals(0)) || ans3.equals(0));
        //map数组一一对应
        //闰年
        if( (ans1.equals(0) && !ans2.equals(0)) || ans3.equals(0)){
            kiss.put(1, 31);
            kiss.put(2, 29);
            kiss.put(3, 31);
            kiss.put(4, 30);
            kiss.put(5, 31);
            kiss.put(6, 30);
            kiss.put(7, 31);
            kiss.put(8, 31);
            kiss.put(9, 30);
            kiss.put(10, 31);
            kiss.put(11, 30);
            kiss.put(12, 31);
        }
        //平年
        else{
            kiss.put(1, 31);
            kiss.put(2, 28);
            kiss.put(3, 31);
            kiss.put(4, 30);
            kiss.put(5, 31);
            kiss.put(6, 30);
            kiss.put(7, 31);
            kiss.put(8, 31);
            kiss.put(9, 30);
            kiss.put(10, 31);
            kiss.put(11, 30);
            kiss.put(12, 31);
        }
        //System.out.println(kiss.containsKey(mouth));

        //
        if(!kiss.containsKey(mouth) || day <= 0) return false;
        else{
            Integer judegment = kiss.get(mouth);
            if(day > judegment)  return false;
            else return true;
        }

    }


    //计算下一天
    public void setnextday(Integer year,Integer mouth,Integer day){

        Integer comparsion = kiss.get(mouth);
        Integer daymin = (day + 1) / (comparsion + 1);   // 看是否可月份+1
        Integer daywhat = (day + 1) % (comparsion + 1);   //日期
        System.out.println(daywhat.equals(0));
        if(daywhat.equals(0)) day = 1;
        else day = daywhat;
        Integer mouthmin = (mouth + daymin) / (12 + 1);
        Integer mouthcase = (mouth + daymin) % (12 + 1);
        if(mouthcase.equals(0))  mouth = 1;
        else mouth = mouthcase;
        year = year + mouthmin;
        jTextField4.setText(year.toString() + '/' + mouth.toString() + '/' + day.toString());
    }


    public void judge(String a,String b,String c){
        Integer i = 0,j = 0,k=0;
        //字符串为空
        if(a.equals("") && b.equals("") && c.equals("")){
            creat("文本框不能为空");
        }
        else if(rejudge(a) && rejudge(b) && rejudge(c)){//判断输入是否合法
            i = new Integer(a);
            j = new Integer(b);
            k = new Integer(c);
            //日期中存在
            if(!datajudge(i, j, k)) jTextField4.setText("不可能");

                //尝试加1
            else  setnextday(i, j, k);
        }

        else {
            creat("参数输入非法");
        }
    }







    public void creat(String a){
        final JFrame jFrame = new JFrame();
        jFrame.setSize(200, 200);
        jFrame.setVisible(true);
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
        testtwo a = new testtwo();

    }

}
