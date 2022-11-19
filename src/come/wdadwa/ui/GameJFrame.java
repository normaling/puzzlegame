package come.wdadwa.ui;
import javax.swing.*;
import java.awt.*;
import java.util.Random;


//游戏主界面
public class GameJFrame extends JFrame {
    //管理图片位置信息的数据（已经打乱好的）
    int[][] data=new int[4][4];
    public GameJFrame() {
        //初始化界面
        initJFrame();
        //初始化菜单栏
        initJMenuBar();
        //初始化数据(打乱图片)
        initData();
        //初始化图片
        initImage();
        //让界面显示出来，这个要放到最后写
        this.setVisible(true);
    }

    private void initData() {
        int[] tmpArr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r=new Random();
        for (int i = 0; i < tmpArr.length; i++) {
            int index=r.nextInt(tmpArr.length);
            int tmp=tmpArr[i];
            tmpArr[i]=tmpArr[index];
            tmpArr[index]=tmp;
        }
        for (int i = 0; i <tmpArr.length ; i++) {
            data[i/4][i%4]=tmpArr[i];
        }
    }

    private void initImage() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                int num=data[i][j];
                JLabel jLabel=new JLabel(new ImageIcon("image/animal/animal2/"+num+".jpg"));
                jLabel.setBounds(105*j,105*i,105,105);
                this.getContentPane().add(jLabel);
            }
        }
    }
    private void initJMenuBar() {
        JMenuBar jMenuBar=new JMenuBar();//创建菜单栏对象
        JMenu functionJMenu=new JMenu("功能");//创建菜单栏中的功能选项
        JMenu aboutJMenu=new JMenu("关于我们");//创建菜单栏中的关于我们选项
        //创建菜单选项下面的条目对象
        JMenuItem replayItem=new JMenuItem("重新游戏");
        JMenuItem reLoginItem=new JMenuItem("重新登录");
        JMenuItem closeItem=new JMenuItem("关闭游戏");

        JMenuItem accountItem=new JMenuItem("公众号");

        //将每一个选项下面的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //将菜单的俩个选项添加到菜单栏当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);


        this.setJMenuBar(jMenuBar);//给整个界面设置菜单
    }
    private void initJFrame() {
        this.setSize(603,680);//设置界面的宽高
        this.setTitle("拼图单机版 V1.0");//设置界面标题
        this.setAlwaysOnTop(true);//设置界面是否一直在最上方,盖住其他界面
        this.setLocationRelativeTo(null);//设置界面居中
        this.setDefaultCloseOperation(3);//设置界面关闭模式

        //取消默认居中放置，只有取消了才会以xy轴形式添加组件
        this.setLayout(null);

    }
}
