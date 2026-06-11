package com.mediconnect.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

/**
 * A tiny "is the server alive?" endpoint. Its only purpose in Stage 0 is to
 * prove the application starts and can answer HTTP requests.
 *
 * <p>Annotations to learn here:
 * <ul>
 *   <li>{@code @RestController} – tells Spring "this class handles web requests,
 *       and whatever my methods return should be sent back as the HTTP response
 *       body (converted to JSON automatically)". It combines {@code @Controller}
 *       + {@code @ResponseBody}.</li>
 *   <li>{@code @GetMapping("/api/health")} – "when an HTTP GET request hits the
 *       URL /api/health, call this method".</li>
 * </ul>
 *
 * <p>Because we return a {@code Map}, Spring (via the Jackson library) turns it
 * into JSON like: {@code {"status":"UP","service":"mediconnect-backend", ...}}
 */
@RestController
public class HealthController {

    @GetMapping("/api/health")
    public Map<String, Object> health() {
        return Map.of(
                "status", "UP",
                "service", "mediconnect-backend",
                "time", Instant.now().toString()
        );
    }
}
