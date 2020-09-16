package apache.dubbo.test.spi;

/**
 * @author liulin
 * @version $Id: SpiInterfaceImpl.java, v0.1 2020/9/16 15:44 liulin Exp $$
 */
public class SpiInterfaceImpl implements SpiInterface {
    private SpiInterface spiIoc;
    @Override
    public void method() {
        System.out.println(this.getClass().getName());
    }

    public SpiInterface getSpiIoc() {
        return spiIoc;
    }

    public void setSpiIoc(SpiInterface spiIoc) {
        this.spiIoc = spiIoc;
    }
}
