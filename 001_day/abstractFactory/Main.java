package abstractFactory;

public class Main {
    public static void main(String[] args) {
        CloudProviderFactory cloudProviderFactoryGCP = new GCPFactory();
        CloudProviderFactory cloudProviderFactoryAWS = new AWSFactory();
        CloudProviderFactory cloudProviderFactoryAZURE = new AZUREFactory();

        ClientMessage clientMessageGCP = cloudProviderFactoryGCP.createClientMessage();
        ClientSecrets clientSecretsAWS = cloudProviderFactoryAWS.createClientSecrets();
        ClientStockage clientStockageAZURE = cloudProviderFactoryAZURE.createClientStockage();

    }
}