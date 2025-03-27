package ufrn.br.ia.tecinfo;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
public class Main {
    public static void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kc = ks.getKieClasspathContainer();
            KieSession kSession = kc.newKieSession();

            Candidato c1 = new Candidato("Paulo Oliveira", 16);
            Candidato c2 = new Candidato("Ana Silva", 18);

            kSession.insert(c1);
            kSession.insert(c2);
            kSession.fireAllRules();

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}