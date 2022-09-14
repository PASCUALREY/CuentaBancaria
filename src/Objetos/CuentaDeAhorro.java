package Objetos;

public class CuentaDeAhorro extends Cuenta{
    private boolean estado;

    public CuentaDeAhorro(float saldo, float tasaAnual, boolean estado) {
        super(saldo, tasaAnual);
        if (saldo < 10000)
            this.estado = false;
        else
            this.estado = true;
    }

    public void depositarDinero(float monto){
        if (estado)
            super.depositarDinero(monto);
    }

    public void retirarDinero(float monto){
        if (estado)
            super.retirarDinero(monto);
    }

    public void extractoMensual() {
        if (getNumeroDeRetiros() > 4){
            float comisionMensual = getComisionMensual();
            setComisionMensual(comisionMensual);
        }
        super.extractoMensual();
        if (getSaldo() < 10000)
            estado = false;
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaDeAhorro{" +
                "estado=" + estado +
                '}';
    }
}
