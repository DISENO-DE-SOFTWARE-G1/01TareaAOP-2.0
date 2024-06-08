package ec.edu.espol;

/**
 *
 */
interface Server {
    void receiveRequest();
}

class Servidor implements Server{

	@Override
	public void receiveRequest() {
        System.out.println("Server has received a request");
	}

}

interface Client {
    void makeRequest();
}

class Cliente implements Client{

	@Override
	public void makeRequest() {
        System.out.println("Client has made a request");
	}

}
