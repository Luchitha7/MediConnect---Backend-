package com.mediconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point of the whole backend.
 *
 * <p>{@code @SpringBootApplication} is the most important annotation in a Spring
 * Boot app. It is actually three annotations rolled into one:
 * <ul>
 *   <li>{@code @Configuration} – this class can define Spring "beans" (objects
 *       Spring manages for us).</li>
 *   <li>{@code @EnableAutoConfiguration} – Spring looks at the libraries on the
 *       classpath and auto-configures sensible defaults. Because
 *       {@code spring-boot-starter-web} is present, it automatically starts a
 *       Tomcat web server, sets up JSON conversion, etc. This is the "magic"
 *       that lets us write almost no boilerplate.</li>
 *   <li>{@code @ComponentScan} – Spring scans THIS package and all sub-packages
 *       (everything under {@code com.mediconnect}) for our classes annotated
 *       with {@code @RestController}, {@code @Service}, {@code @Repository},
 *       etc., and wires them together for us.</li>
 * </ul>
 */
@SpringBootApplication
public class MediConnectApplication {

    public static void main(String[] args) {
        // This single line:
        //   1. Creates the Spring "application context" (a registry of all beans)
        //   2. Runs auto-configuration
        //   3. Starts the embedded Tomcat web server (default: the port we set
        //      in application.properties)
        SpringApplication.run(MediConnectApplication.class, args);
    }
}
