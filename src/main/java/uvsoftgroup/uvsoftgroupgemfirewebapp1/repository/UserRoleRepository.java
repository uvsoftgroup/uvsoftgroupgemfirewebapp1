package uvsoftgroup.uvsoftgroupgemfirewebapp1.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uvsoftgroup.uvsoftgroupgemfirewebapp1.model.UserRole;

@RepositoryRestResource(collectionResourceRel ="userRole", path = "userRole")
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {

}
