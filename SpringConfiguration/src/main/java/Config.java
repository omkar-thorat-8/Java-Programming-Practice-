import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config{
	
	public Config() {
		super();
	}

	@Bean
	public Consultant createConsultant() {
		
		return new Consultant();
	}
	
}
