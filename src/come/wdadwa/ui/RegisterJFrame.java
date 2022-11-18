package come.wdadwa.ui;

import javax.swing.*;
//注册界面
public class RegisterJFrame extends JFrame {
    public RegisterJFrame(){
        this.setSize(488,500);//界面的宽高
        this.setTitle("拼图 注册 V1.0");//设置界面标题
        this.setAlwaysOnTop(true);//设置界面是否一直在最上方,盖住其他界面
        this.setLocationRelativeTo(null);//设置界面居中
        this.setDefaultCloseOperation(3);//设置界面关闭模式
        this.setVisible(true);//界面是否可视化
    }
}
