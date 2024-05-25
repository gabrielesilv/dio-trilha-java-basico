package veículo;

//abstração
public abstract class MeioTransporte {
    private String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

   //abstração: todo mundo que tiver veículo e precisar ligar, precisará do método ligar
    public abstract void ligar();
}
