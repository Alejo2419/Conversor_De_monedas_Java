package conexion;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class ResuestaExch {
    @SerializedName("result")
    private String resultadoRes;

    @SerializedName ("base_code")
    private String codigo_base;

    @SerializedName("conversion_rates")
    private Map<String, Double> tasa_de_conversion;

    public String getResultadoRes() {
        return resultadoRes;
    }

    public String getCodigo_base() {
        return codigo_base;
    }

    public Map<String, Double> getTasa_de_conversion() {
        return tasa_de_conversion;
    }
}
