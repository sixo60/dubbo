package apache.dubbo.test.spi;

import org.apache.dubbo.common.extension.Adaptive;

/**
 * @author liulin
 * @version $Id: SpiIoc.java, v0.1 2020/9/16 16:47 liulin Exp $$
 */
@Adaptive
public class SpiIoc implements SpiInterface {
    @Override
    public void method() {
        System.out.println(getClass().getName());
    }
}
