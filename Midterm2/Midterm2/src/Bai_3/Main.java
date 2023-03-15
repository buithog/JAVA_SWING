package Bai_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame {
    JLabel jlbTitle;
    JLabel jlbName;
    JLabel jlbAge;
    JLabel jlbID;
    JLabel jlbSTT;
    JTextField jtfName;
    JTextField jtfAge;
    JTextField jtfID;
    JTextField jtfSTT;
    JButton jbtnAdd;
    JButton jbtnShow;
    JButton jb1;
    JButton jb2;

    int idx = 0;

    public static ArrayList <SinhVien> list;

    public Main(){
        JFrame f = new JFrame();
        f.setTitle("My Application");

        f.setSize(600, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setBackground(Color.GRAY);
        Container c = f.getContentPane();

        jlbTitle = new JLabel("HIỂN THỊ DANH SÁCH SINH VIÊN");
        jlbTitle.setBounds(180, 5, 250, 50);
        jlbTitle.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(jlbTitle);

        jlbName = new JLabel("Họ và tên:");
        jlbName.setBounds(80, 80, 100, 50);
        jlbName.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(jlbName);
        jlbAge = new JLabel("Tuổi:");
        jlbAge.setBounds(80, 140, 100, 50);
        jlbAge.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(jlbAge);
        jlbID = new JLabel("ID:");
        jlbID.setBounds(80, 200, 100, 50);
        jlbID.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(jlbID);
        jlbSTT = new JLabel("Số thứ tự:");
        jlbSTT.setBounds(80, 260, 100, 50);
        jlbSTT.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(jlbSTT);

        jtfName = new JTextField();
        jtfName.setBounds(250, 90, 200, 30);
        jtfName.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(jtfName);
        jtfAge = new JTextField();
        jtfAge.setBounds(250, 150, 200, 30);
        jtfAge.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(jtfAge);
        jtfID = new JTextField();
        jtfID.setBounds(250, 210, 200, 30);
        jtfID.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(jtfID);
        jtfSTT = new JTextField();
        jtfSTT.setBounds(250, 270, 200, 30);
        jtfSTT.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(jtfSTT);

        jbtnAdd = new JButton("Thêm");
        jbtnAdd.setBounds(120, 350, 80, 30);
        f.add(jbtnAdd);
        jbtnShow = new JButton("Xem");
        jbtnShow.setBounds(220, 350, 70, 30);
        f.add(jbtnShow);
        jb1 = new JButton("<<");
        jb1.setBounds(310, 350, 50, 30);
        f.add(jb1);
        jb2 = new JButton(">>");
        jb2.setBounds(380, 350, 50, 30);
        f.add(jb2);

        list = new ArrayList<>();

        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals("Thêm")){
                    String name = jtfName.getText();
                    int age = Integer.parseInt(jtfAge.getText());
                    String id = jtfID.getText();
                    int stt = Integer.parseInt(jtfSTT.getText());
                    SinhVien x = new SinhVien(name, age, id, stt);
                    list.add(x);
                    jtfName.setText("");
                    jtfAge.setText("");
                    jtfID.setText("");
                    jtfSTT.setText("");
                }
            }
        });

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals("<<")){
                    if (idx == 0){
                        JOptionPane.showConfirmDialog(f, "ArrayListIndexOutOfBounds", "WARNING", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                    }else{
                        --idx;
                    }
                }
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals(">>")){
                    if (idx == list.size() - 1){
                        JOptionPane.showConfirmDialog(f, "ArrayListIndexOutOfBounds", "WARNING", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                    }else{
                        ++idx;
                    }
                }
            }
        });

        jbtnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals("Xem")){
                    SinhVien x = list.get(idx);
                    jtfName.setText(x.getName());
                    jtfAge.setText(x.getAge() + "");
                    jtfID.setText(x.getId());
                    jtfSTT.setText(x.getStt() + "");
                }
            }
        });

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
        //System.out.println(list.size());
    }
}
