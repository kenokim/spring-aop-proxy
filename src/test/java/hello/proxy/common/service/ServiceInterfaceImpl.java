package hello.proxy.common.service;

public class ServiceInterfaceImpl implements ServiceInterface {
    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void find() {
        System.out.println("find");
    }
}
