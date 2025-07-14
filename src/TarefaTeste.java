import org.junit.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.Assert.*;

public class TarefaTeste {

    @Test
    public void testListaContemSomenteMulheres() {

        String entrada = "Ana-Feminino,Carlos-Masculino,Joana-Feminino,Marcos-Masculino";

        List<String> lista = Arrays.asList(entrada.split(","));


        List<String> mulheres = lista.stream()
                .filter(p -> p.toLowerCase().contains("-feminino"))
                .map(p -> p.split("-")[0])
                .toList();


        boolean todosSaoMulheres = mulheres.stream().allMatch(nome ->
                lista.stream().anyMatch(item ->
                        item.toLowerCase().equals(nome.toLowerCase() + "-feminino")));

        assertTrue("A lista deve conter apenas mulheres", todosSaoMulheres);
    }
}