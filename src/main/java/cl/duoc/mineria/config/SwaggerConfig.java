package cl.duoc.mineria.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(){

        return new OpenAPI()
                .info(new Info()
                        .title("API Gateway - Sistema de Gestión Minera")
                        .version("1.0.0")
                        .description("Punto de entrada único para todos los microservicios del sistema. Este gateway enruta las peticiones a los servicios correspondientes y agrega una capa de seguridad y gestión.")
                    );

    }

}