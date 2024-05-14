package com.br.rp.escola;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DatabaseGenerator {
    public static void generateDatabase() {
        // Configurar o registro de serviço do Hibernate
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // Carrega a configuração do hibernate.cfg.xml
                .build();

        // Criar a fábrica de sessões do Hibernate
        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();

        // Fechar a fábrica de sessões do Hibernate ao finalizar
        sessionFactory.close();
    }
}
