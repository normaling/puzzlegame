import come.wdadwa.ui.GameJFrame;
import come.wdadwa.ui.LoginJFrame;
import come.wdadwa.ui.RegisterJFrame;

public class APP {
    public static void main(String[] args) {
        //程序启动入口
        //如果想开启一个界面，就创建谁的对象即可
        new LoginJFrame();
        new RegisterJFrame();
        new GameJFrame();
    }
}
