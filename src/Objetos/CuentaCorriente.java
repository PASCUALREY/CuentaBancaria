package Objetos;

public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.sobregiro = 0;
    }

    public void retirarDinero(float monto){
        float saldo = getSaldo();
        if (monto > saldo)
            sobregiro = monto - saldo;
        saldo = saldo - monto;
        setSaldo(saldo);
    }

    public void depositarDinero(float monto){
        if (sobregiro > 0)
            sobregiro = sobregiro - monto;
        super.depositarDinero(monto);
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente{" +
                "sobregiro=" + sobregiro +
                '}';
    }
}
