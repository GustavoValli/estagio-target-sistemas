package Q3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Questao03 {

    public static void main(String[] args) {

        JSONParser jsonParser = new JSONParser();
        ArrayList<Faturamento> faturamentos = new ArrayList<>();

        float valor = 0, media, faturamentoMin = 0, faturamentoMax = 0;
        int contador = 0;

        try {
            JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("dados.json"));

            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                Integer dia = Integer.valueOf(jsonObject.get("dia").toString());
                Float faturamento = Float.valueOf(jsonObject.get("valor").toString());
                faturamentos.add(new Faturamento(dia, faturamento));
            }

            for (Faturamento faturamento : faturamentos) {
                if (faturamento.getValor() != 0) {
                    valor += faturamento.getValor();
                    contador++;
                }

                if (faturamentoMin > faturamento.getValor()) {
                    faturamentoMin = faturamento.getValor();
                }

                if (faturamentoMax < faturamento.getValor()) {
                    faturamentoMax = faturamento.getValor();
                }
            }

            media = valor / (float) contador;
            System.out.printf("A media foi: R$%.2f\n", media);
            System.out.printf("O menor valor foi: R$%.2f\n", faturamentoMin);
            System.out.printf("O maior valor foi: R$%.2f", faturamentoMax);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
