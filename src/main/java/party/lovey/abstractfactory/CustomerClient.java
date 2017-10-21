package party.lovey.abstractfactory;

import javax.swing.*;

/**
 * 顾客消费，根据心情选择肯德基还是麦当劳
 * 不管选择哪个，顾客都能迟到鸡腿和汉堡，但是吃到的口味和热量不一样
 * @author huhaichao
 */
public class CustomerClient {
    public static void main(String[] args) {
        setUI();
        AbstractFactory factory;
        System.out.println("今天吃什么？");
        String chose = JOptionPane.showInputDialog("请选择吃什么：1肯德基，2麦当劳");
        if ("1".equals(chose )) {
            System.out.println("今天吃肯德基");
            factory = new KFCFactory();
        } else if ("2".equals(chose)) {
            System.out.println("今天吃麦当劳");
            factory = new MCDFactory();
        } else {
            System.out.println("今天减肥");
            return;
        }
        factory.createChicken().taste();
        factory.createHamburger().heat();
    }


    /**
     * 设置窗口外观
     */
    private static void setUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
