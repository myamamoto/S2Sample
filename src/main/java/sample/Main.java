package sample;

import org.seasar.example.s2container.helloworld.IMessageProvider;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {
    public static void main(String[] args) {
        SingletonS2ContainerFactory.init();
        
        // これでapp.diconが読み込まれる
        IMessageProvider messageProvider = SingletonS2Container.getComponent(IMessageProvider.class);
        
        System.out.println(messageProvider.getMessage());
        
        SingletonS2ContainerFactory.destroy();
    }
}
