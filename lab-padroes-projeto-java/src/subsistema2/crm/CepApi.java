package subsistema2.crm;

public class CepApi {
	
	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia(){
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Montes Claros";
	}
	public String recuperarEstado(String estado) {
		return "MG";
	}
	

}
