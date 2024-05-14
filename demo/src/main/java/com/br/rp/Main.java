package com.br.rp;

import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.br.rp.escola.DatabaseGenerator;

public class Main {
    public static void main(String[] args) {
        // Caminho para o arquivo do banco de dados
        String dbFilePath = "<completeocaminho>/escola2/demo/src/persistence/db";

        // Verificar se o banco de dados já existe
        File dbFile = new File(dbFilePath + ".h2.db");
        if (!dbFile.exists()) {
            // Se o banco de dados não existir, gerar as tabelas
            DatabaseGenerator.generateDatabase();
        }

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
