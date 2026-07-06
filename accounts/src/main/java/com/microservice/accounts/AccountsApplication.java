package com.microservice.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Locale;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice REST API Documentation",
				description = "My Accounts Microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name="abhishek dwivedi",
						email = "abhishekdwivedi94443@gmail.com",
						url = "abhishekdwivedi-queries.com"

				),
				license = @License(
						name = "apache 2.0",
						url = "abhishekdwivedi-queries.com"

				)
//                termsOfService = @ExternalDocumentation(
//                        description = "EazyBank Accounts microservice REST API Documentation",
//                        url = "https://www.eazybytes.com/swagger-ui.html"
//                )

		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
