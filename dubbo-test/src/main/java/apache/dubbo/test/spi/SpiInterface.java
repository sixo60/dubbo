package apache.dubbo.test.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author liulin
 * @version $Id: SpiInterface.java, v0.1 2020/9/16 15:40 liulin Exp $$
 */
@SPI
public interface SpiInterface {
    void method();
}
