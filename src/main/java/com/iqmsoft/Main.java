package com.iqmsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iqmsoft.verticle.DeploymentManager;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Main {

    private final DeploymentManager deploymentManager;

    @Autowired
    Main(final DeploymentManager deploymentManager) {
        this.deploymentManager = deploymentManager;
    }

    public static void main(final String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @PostConstruct
    public void deployVerticles() {
        deploymentManager.deployVerticles();
    }

}
