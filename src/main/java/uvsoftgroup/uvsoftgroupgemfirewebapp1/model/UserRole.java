/**
 * 
 */
package uvsoftgroup.uvsoftgroupgemfirewebapp1.model;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;


/**
 * @author A.Riaydh
 *
 */
@Region("userRole")
public class UserRole implements Serializable {
	private static AtomicLong COUNTER = new AtomicLong(0L);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private Long userRoleId;
	private String userRoleName;
	private String userRoleType;
	private Date userRoleDate;
	 
	@PersistenceConstructor
	 public UserRole() {
			this.id = COUNTER.incrementAndGet();
		}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
	public String getUserRoleType() {
		return userRoleType;
	}
	public void setUserRoleType(String userRoleType) {
		this.userRoleType = userRoleType;
	}
	public Date getUserRoleDate() {
		return userRoleDate;
	}
	public void setUserRoleDate(Date userRoleDate) {
		this.userRoleDate = userRoleDate;
	}
	@Override
	public String toString() {
		return "UserRole [id=" + id + ", userRoleId=" + userRoleId + ", userRoleName=" + userRoleName
				+ ", userRoleType=" + userRoleType + ", userRoleDate=" + userRoleDate + "]";
	}
	 
	 
	 
}
