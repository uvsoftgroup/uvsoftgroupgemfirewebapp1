/**
 * 
 */
package uvsoftgroup.uvsoftgroupgemfirewebapp1.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;


/**
 * @author A.Riaydh
 *
 */

@Region("userRegistration")
public class UserRegistration implements Serializable{
	private static final long serialVersionUID = 1L;
	private static AtomicLong COUNTER = new AtomicLong(0L);
	
	 @Id
	 private Long id;
	 
	public enum Gender { 
        MALE, FEMALE
    }
	private Gender gender;
	
	 private Long userRegistrationId;
	 private Long userAddressId;
	 private String userRegistrationFName;
	 private String userRegistrationMName;
	 private String userRegistrationLName;
	 private String userRegistrationName;
	 private String userRegistrationPassword;
	 private String userRegistrationfullName;
	 private Date   userRegistrationCrDate;
	 private Date userRegistrationLDate;
	 private List<UserRole> userRoles;

	 @PersistenceConstructor
	 public UserRegistration() {
			this.id = COUNTER.incrementAndGet();
		}
	 
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserRegistrationId() {
		return userRegistrationId;
	}

	public void setUserRegistrationId(Long userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
	}

	public Long getUserAddressId() {
		return userAddressId;
	}

	public void setUserAddressId(Long userAddressId) {
		this.userAddressId = userAddressId;
	}

	public String getUserRegistrationFName() {
		return userRegistrationFName;
	}

	public void setUserRegistrationFName(String userRegistrationFName) {
		this.userRegistrationFName = userRegistrationFName;
	}

	public String getUserRegistrationMName() {
		return userRegistrationMName;
	}

	public void setUserRegistrationMName(String userRegistrationMName) {
		this.userRegistrationMName = userRegistrationMName;
	}

	public String getUserRegistrationLName() {
		return userRegistrationLName;
	}

	public void setUserRegistrationLName(String userRegistrationLName) {
		this.userRegistrationLName = userRegistrationLName;
	}

	public String getUserRegistrationName() {
		return userRegistrationName;
	}

	public void setUserRegistrationName(String userRegistrationName) {
		this.userRegistrationName = userRegistrationName;
	}

	public String getUserRegistrationPassword() {
		return userRegistrationPassword;
	}

	public void setUserRegistrationPassword(String userRegistrationPassword) {
		this.userRegistrationPassword = userRegistrationPassword;
	}

	public String getUserRegistrationfullName() {
		return userRegistrationfullName;
	}

	public void setUserRegistrationfullName(String userRegistrationfullName) {
		this.userRegistrationfullName = userRegistrationfullName;
	}

	public Date getUserRegistrationCrDate() {
		return userRegistrationCrDate;
	}

	public void setUserRegistrationCrDate(Date userRegistrationCrDate) {
		this.userRegistrationCrDate = userRegistrationCrDate;
	}

	public Date getUserRegistrationLDate() {
		return userRegistrationLDate;
	}

	public void setUserRegistrationLDate(Date userRegistrationLDate) {
		this.userRegistrationLDate = userRegistrationLDate;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	@Override
	public String toString() {
		return "UserRegistration [gender=" + gender + ", id=" + id + ", userRegistrationId=" + userRegistrationId
				+ ", userAddressId=" + userAddressId + ", userRegistrationFName=" + userRegistrationFName
				+ ", userRegistrationMName=" + userRegistrationMName + ", userRegistrationLName="
				+ userRegistrationLName + ", userRegistrationName=" + userRegistrationName
				+ ", userRegistrationPassword=" + userRegistrationPassword + ", userRegistrationfullName="
				+ userRegistrationfullName + ", userRegistrationCrDate=" + userRegistrationCrDate
				+ ", userRegistrationLDate=" + userRegistrationLDate + ", userRoles=" + userRoles + "]";
	}

	
	 
	
}
