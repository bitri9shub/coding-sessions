package abstractFactory;

public class AZUREFactory implements CloudProviderFactory {
    @Override 
    public ClientMessage createClientMessage(){
        System.out.println("Created an AZURE client message");
        return new AZUREClientMessage();
    }

    @Override 
    public ClientSecrets createClientSecrets(){
        System.out.println("Created an AZURE client secrets");
        return new AZUREClientSecrets();
    }

    @Override 
    public ClientStockage createClientStockage(){
        System.out.println("Created an AZURE client stockage");
        return new AZUREClientStockage();
    }
}