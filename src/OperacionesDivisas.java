public class OperacionesDivisas {

    public float CalcularConversion(String divisaBase, String divisaObjetivo, float cantidad){

        ConsultaDivisa consulta = new ConsultaDivisa();
        float valorDivisaB = consulta.consultarDivisa(divisaBase,divisaObjetivo);
        return valorDivisaB * cantidad;
    }

    public String mostrarConversion(){



        return "";
    }
}
