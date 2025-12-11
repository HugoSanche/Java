public class PagoFactory {

    public Pago obtenerTipoPago(TipoDePago tipoDePago){
        return switch (tipoDePago) {
            case BITCOIN -> new PagoBitcoin();
            case EFECTIVO -> new PagoEfectivo();
            case PAYPAL -> new PagoPayPal();
            case TARJETA_CREDITO -> new PagoTarjetaCredito();
            case GOOGLE_PAY -> new PagoGooglePay();
            case APPLE_PAY -> new PagoApplePay();
            case TRANSFERENCIA_BANCARIA -> new PagoTransferenciaBancaria();
            case TARJETA_DEBITO -> new PagoTarjetaDebito();
        };
    }
}
