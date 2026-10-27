package abstractFactory;

public interface CloudProviderFactory {
    public ClientMessage createClientMessage();
    public ClientSecrets createClientSecrets();
    public ClientStockage createClientStockage();
}