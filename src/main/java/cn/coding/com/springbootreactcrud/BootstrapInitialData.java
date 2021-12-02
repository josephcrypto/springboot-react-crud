package cn.coding.com.springbootreactcrud;

import cn.coding.com.springbootreactcrud.domain.Client;
import cn.coding.com.springbootreactcrud.repository.ClientRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

/*@Author JosephCrypto
 *@Create 2021-14-12/1/21 11:14 PM
 */
@Component
public class BootstrapInitialData implements CommandLineRunner {

    private final ClientRepository clientRepository;
    private final Faker faker = new Faker(Locale.getDefault());

    public BootstrapInitialData(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10 ; i++){
            clientRepository.save(new Client(faker.name().fullName(), faker.internet().emailAddress()));
        }
    }
}
