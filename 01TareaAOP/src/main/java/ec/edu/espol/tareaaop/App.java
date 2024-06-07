/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tareaaop;

/**
 *
 * @author angelozurita
 */
public class App {

    public static void main(String[] args) {
        Service service = new Service();
        ClientInterface adapter = new Adapter(service);
        Client client = new Client(adapter);
        // El cliente usa el adaptador para comunicarse con el servicio
        client.doWork("Datos originales");
    }
}
