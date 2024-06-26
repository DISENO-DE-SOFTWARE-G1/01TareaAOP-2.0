/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tareaaop;

/**
 *
 *
 */
public class App {

    public static void main(String[] args) {
        Service service = new Service();
        ClientInterface adapter = new Adapter(service);
        Client client = new Client(adapter);
        // Patron Adapter
        client.doWork("Datos originales");
        // Patron Singleton 
        Singleton singleton = Singleton.getInstance();
        singleton.method();
    }
}
