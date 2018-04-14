package uvsoftgroup.uvsoftgroupgemfirewebapp1.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.uvsoftgroupgemfirewebapp1.model.UserRegistration;

@RepositoryRestResource(collectionResourceRel = "userRegistration", path = "userRegistration")
public interface UserRegistrationRepository extends CrudRepository<UserRegistration, Long> {

}
