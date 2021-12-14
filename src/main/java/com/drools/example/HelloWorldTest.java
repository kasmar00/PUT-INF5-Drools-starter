package com.drools.example;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import pl.poznan.put.cs.ai.drools.family.Osoba;
import pl.poznan.put.cs.ai.drools.family.Relacja;

public class HelloWorldTest {
    public static void main(String[] args) throws DroolsParserException,
            IOException {
        HelloWorldTest helloWorldTest = new HelloWorldTest();
        helloWorldTest.executeHelloWorldRules();
    }
    public void executeHelloWorldRules() throws IOException,
            DroolsParserException {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        Logger.getLogger(HelloWorldTest.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setPrintMessage("Hello World");

//        Osoba abacki = new Osoba("abacki");
//        Osoba cabacki = new Osoba("babacki");
//
//        Relacja relacja = new Relacja(abacki, cabacki, "rodzic");

//        System.out.println(relacja);


        session.insert(helloWorld);
        session.fireAllRules();
    }
}