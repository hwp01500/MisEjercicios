package Ejercicios_unidad4;

public class Automovil {
    

    private String modelo;
    private float capacidadDeposito;
    private float litrosDeposito;
    private float consumo;
    private float kilometros;
    private float litros;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + Float.floatToIntBits(capacidadDeposito);
        result = prime * result + Float.floatToIntBits(litrosDeposito);
        result = prime * result + Float.floatToIntBits(consumo);
        result = prime * result + Float.floatToIntBits(kilometros);
        result = prime * result + Float.floatToIntBits(litros);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Automovil other = (Automovil) obj;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (Float.floatToIntBits(capacidadDeposito) != Float.floatToIntBits(other.capacidadDeposito))
            return false;
        if (Float.floatToIntBits(litrosDeposito) != Float.floatToIntBits(other.litrosDeposito))
            return false;
        if (Float.floatToIntBits(consumo) != Float.floatToIntBits(other.consumo))
            return false;
        if (Float.floatToIntBits(kilometros) != Float.floatToIntBits(other.kilometros))
            return false;
        if (Float.floatToIntBits(litros) != Float.floatToIntBits(other.litros))
            return false;
        return true;
    }
    public String getModelo() {
        return modelo;
    }
    public float getCapacidadDeposito() {
        return capacidadDeposito;
    }
    public float getLitrosDeposito() {
        return litrosDeposito;
    }
    public float getConsumo() {
        return consumo;
    }
    public float getKilometros() {
        return kilometros;
    }
    public float getLitros() {
        return litros;
    }
    public Automovil(String modelo, float capacidadDeposito, float litrosDeposito, float consumo, float kilometros,
            float litros) {
        this.modelo = modelo;
        this.capacidadDeposito = capacidadDeposito;
        this.litrosDeposito = litrosDeposito;
        this.consumo = consumo;
        this.kilometros = kilometros;
        this.litros = litros;
    }
    public Automovil(String modelo, float litrosDeposito, float consumo, float litros) {
        this.modelo = modelo;
        this.litrosDeposito = litrosDeposito;
        this.consumo = consumo;
    }

    public float llenarDeposito() {
        float restante = capacidadDeposito - litrosDeposito;
        //litrosDeposito = capacidadDeposito;
        litrosDeposito += restante;
        return restante;
    }

    public float llenarDeposito(float litros) {
        litrosDeposito += litros;
        if (litrosDeposito > capacidadDeposito) {
            float sobrante = litrosDeposito - capacidadDeposito;
            litrosDeposito = capacidadDeposito;
            return sobrante;
        }
        return 0;
    }
    
    public float desplazar(float kilometros) {
        float litrosNecesarios = kilometros * consumo;
        if (litrosDeposito < litrosNecesarios) {
            return 0;
        }
        litrosDeposito -= litrosNecesarios;
        litros += litrosNecesarios;
        this.kilometros += kilometros;
        return litrosNecesarios;
    }
}
