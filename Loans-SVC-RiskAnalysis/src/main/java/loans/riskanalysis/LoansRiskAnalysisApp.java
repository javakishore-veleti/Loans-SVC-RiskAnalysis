package loans.riskanalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoansRiskAnalysisApp {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(LoansRiskAnalysisApp.class);

		app.run(args);
	}
}
