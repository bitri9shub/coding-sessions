package abstractFactory;

public class AWSFactory implements CloudProviderFactory {
    @Override 
    public ClientMessage createClientMessage(){
        System.out.println("Created an AWS client message");
        return new AWSClientMessage();
    }

    @Override 
    public ClientSecrets createClientSecrets(){
        System.out.println("Created an AWS client secrets");
        return new AWSClientSecrets();
    }

    @Override 
    public ClientStockage createClientStockage(){
        System.out.println("Created an AWS client stockage");
        return new AWSClientStockage();
    }
}