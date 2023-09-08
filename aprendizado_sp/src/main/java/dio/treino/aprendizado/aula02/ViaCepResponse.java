package dio.treino.aprendizado.aula02;

public class ViaCepResponse {
    private String cep;
    private String logadouro;
    private String localidade;

    public String getCep() {
        return cep;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public ViaCepResponse(){}

    public ViaCepResponse(String cep, String logadouro, String localidade){
        this.cep = cep;
        this.logadouro = logadouro;
        this.localidade = localidade;
    }

    @Override
    public String toString(){
        return String.format("{CEP: %s; LOGADOURO: %s; LOCALIDADE: %s}", cep, logadouro, localidade);
    }
}
