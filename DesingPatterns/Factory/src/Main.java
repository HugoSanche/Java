public class Main {
    public static void main(String[] args) {
//        TipoDePago tipoDePago= TipoDePago.EFECTIVO;
//
//        if (tipoDePago==TipoDePago.APPLE_PAY){
//
//        } else if (tipoDePago==TipoDePago.BITCOIN) {
//
//        } else if (tipoDePago==TipoDePago.TARJETA_CREDITO) {
//
//        }

        PagoFactory pagoFactory=new PagoFactory();
        Pago pago=pagoFactory.obtenerTipoPago(TipoDePago.EFECTIVO);
        pago.crearPago();

    }
}
