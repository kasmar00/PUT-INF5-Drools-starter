package com.drools.example;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
public class Runner {
    public static void main(String[] args) throws DroolsParserException,
            IOException {
        Runner runner = new Runner();
        runner.executeHelloWorldRules();
    }
    public void executeHelloWorldRules() throws IOException,
            DroolsParserException {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        Logger.getLogger(Runner.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");
//        session.insert(new Pomiar(1, 200));
        session.fireAllRules();
        session.insert(new Straz());
        session.fireAllRules();
    }
}