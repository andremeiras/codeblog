package com.andremeiras.codeblog.utils;

import com.andremeiras.codeblog.model.Post;
import com.andremeiras.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts() {

        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("André Meira");
        post1.setDataCriacao(LocalDate.now());
        post1.setTitulo("Containeres Docker");
        post1.setTexto("Docker é um conjunto de produtos de plataforma como serviço que usam virtualização de nível de sistema operacional para entregar software em pacotes chamados contêineres. Os contêineres são isolados uns dos outros e agrupam seus próprios softwares, bibliotecas e arquivos de configuração. - Wikipedia");

        Post post2 = new Post();
        post2.setAutor("André Meira");
        post2.setDataCriacao(LocalDate.now());
        post2.setTitulo("Spring Boot");
        post2.setTexto("\n" +
                "\n" +
                "Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can \"just run\".\n" +
                "\n" +
                "We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need minimal Spring configuration.\n" +
                "\n" +
                "If you’re looking for information about a specific version, or instructions about how to upgrade from an earlier release, check out the project release notes section on our wiki.\n" +
                "Features\n" +
                "\n" +
                "    Create stand-alone Spring applications\n" +
                "\n" +
                "    Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)\n" +
                "\n" +
                "    Provide opinionated 'starter' dependencies to simplify your build configuration\n" +
                "\n" +
                "    Automatically configure Spring and 3rd party libraries whenever possible\n" +
                "\n" +
                "    Provide production-ready features such as metrics, health checks, and externalized configuration\n" +
                "\n" +
                "    Absolutely no code generation and no requirement for XML configuration\n" +
                "\n");

        postList.add(post1);
        postList.add(post2);

        for(Post post : postList) {
            Post postSaved = codeblogRepository.save(post);
            System.out.println("Post id: " + postSaved.getId());
        }
    }
}
