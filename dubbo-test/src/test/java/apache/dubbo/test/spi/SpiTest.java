package apache.dubbo.test.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author liulin
 * @version $Id: SpiTest.java, v0.1 2020/9/16 15:46 liulin Exp $$
 */
public class SpiTest {
    @BeforeClass
    public static void log(){
        System.setProperty("dubbo.application.logger","slf4j");
    }

    @Test
    public void spiTest(){
        ExtensionLoader<SpiInterface> extensionLoader = ExtensionLoader.getExtensionLoader(SpiInterface.class);
        SpiInterface spiInstance = extensionLoader.getExtension("my");
        spiInstance.method();
        ((SpiInterfaceImpl) spiInstance).getSpiIoc().method();
    }
}
