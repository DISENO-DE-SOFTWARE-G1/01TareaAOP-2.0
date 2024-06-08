/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tareaaop;

/**
 *
 *
 */


// https://refactoring.guru/design-patterns/adapter

interface ClientInterface {
    void method(String data);
}

// Servicio Final que es incompatible con el cliente
class Service {
    public void serviceMethod(String specialData) {
        System.out.println("Datos en Service: " + specialData);
    }
}

// Adapator entre cliente y servicio
class Adapter implements ClientInterface {
    private Service service;

    public Adapter(Service service) {
        this.service = service;
    }
    
    private String convertToServiceFormat(String data) {
        return "Datos-Adapter (" + data + ")";
    }
    
    @Override
    public void method(String data) {
        String specialData = convertToServiceFormat(data);
        service.serviceMethod(specialData);
    }

}

// Cliente 
class Client {
    private ClientInterface adapter;

    public Client(ClientInterface adapter) {
        this.adapter = adapter;
    }

    public void doWork(String data) {
        adapter.method(data);
    }
}
