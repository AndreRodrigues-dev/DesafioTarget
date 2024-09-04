package desafios;

import com.sun.source.tree.DoWhileLoopTree;

import java.util.HashMap;
import java.util.Map;

public class desafioQuatro {
    public static void main(String[] args) {
        Map<String, Double> faturamentoPorEstado = new HashMap<String, Double>() {{
            put("SP", 67836.43);
            put("RJ", 36678.66);
            put("MG", 29229.88);
            put("ES", 27165.48);
            put("Outros", 19849.53);
        }};

        double valorTotal = 0.0;
        for(Double valor : faturamentoPorEstado.values()) {
            valorTotal += valor;
        }

        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            Double valor = entry.getValue();
            double percentual = (valor / valorTotal) * 100;
            System.out.println(estado + ": " + String.format("%.2f", percentual) + "%");
        }
    }
}
