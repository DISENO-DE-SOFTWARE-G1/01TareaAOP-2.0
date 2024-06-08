package ec.edu.espol;

public aspect Adapter {
	private Server server;
	
	public Adapter() {
		this.server = new Servidor();
	}
	
	pointcut makeRequest(): execution(void Cliente.makeRequest());
	
	before(): makeRequest() {
		server.receiveRequest();
	}
}
