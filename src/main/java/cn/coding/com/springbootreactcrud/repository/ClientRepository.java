package cn.coding.com.springbootreactcrud.repository;

import cn.coding.com.springbootreactcrud.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/*@Author JosephCrypto
 *@Create 2021-04-12/1/21 11:04 PM
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
}
