package come.wdadwa.ui;

import javax.swing.*;
//登陆界面
public class LoginJFrame extends JFrame {

    public LoginJFrame(){
        //在创建登录界面的时候，给界面设置宽高，直接展示等
        this.setSize(603,680);
        this.setTitle("拼图 登录 V1.0");//设置界面标题
        this.setAlwaysOnTop(true);//设置界面是否一直在最上方,盖住其他界面
        this.setLocationRelativeTo(null);//设置界面居中
        this.setDefaultCloseOperation(3);//设置界面关闭模式
        this.setVisible(true);
    }
}
