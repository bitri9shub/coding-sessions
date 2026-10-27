package abstractFactory;

public class GCPFactory implements CloudProviderFactory {
    @Override 
    public ClientMessage createClientMessage(){
        System.out.println("Created an GCP client message");
        return new GCPClientMessage();
    }

    @Override 
    public ClientSecrets createClientSecrets(){
        System.out.println("Created an GCP client secrets");
        return new GCPClientSecrets();
    }

    @Override 
    public ClientStockage createClientStockage(){
        System.out.println("Created an GCP client stockage");
        return new GCPClientStockage();
    }
}