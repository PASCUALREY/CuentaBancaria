package Objetos;

public class Cuenta {
    private float saldo;
    private int numeroConsignaciones;
    private int numeroDeRetiros;
    private float tasaAnual;
    private float comisionMensual;

    public Cuenta(float saldo, float tasaAnual) {
        numeroConsignaciones = 0;
        numeroDeRetiros = 0;
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void depositarDinero(float monto){
        saldo = saldo + monto;
        numeroConsignaciones++;
    }

    public void retirarDinero(float monto){
        if (monto <= saldo)
            saldo = saldo - monto;
        numeroDeRetiros++;
    }

    public void interesMensual(){
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo = saldo + interesMensual;
    }

    public void estractoMensual(){
        saldo = saldo - comisionMensual;
        interesMensual();
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", numeroConsignaciones=" + numeroConsignaciones +
                ", numeroDeRetiros=" + numeroDeRetiros +
                ", tasaAnual=" + tasaAnual +
                ", comisionMensual=" + comisionMensual +
                '}';
    }
}


