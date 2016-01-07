package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.dto.constants.EnumConstants.SignupType;


/**
 * UserTO: Hoa Ho
 * Date: 2/19/13
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "appuser")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = Appuser.FIND_ALL, query = "SELECT a FROM Appuser a"),
        @NamedQuery(name = Appuser.FIND_BY_ID, query = "SELECT a FROM Appuser a WHERE a.id = :id"),
        @NamedQuery(name = Appuser.FIND_BY_SID, query = "SELECT a FROM Appuser a WHERE hex(a.sid) = :sid"),
        @NamedQuery(name = Appuser.FIND_BY_USER_NAME, query = "SELECT a FROM Appuser a WHERE a.username = :username"),
        @NamedQuery(name = Appuser.FIND_ID_BY_EMAIL, query = "SELECT a.id FROM Appuser a WHERE a.username = :email"),
        @NamedQuery(name = Appuser.FIND_PASSWORD_BY_USERNAME, query = "SELECT a.pass FROM Appuser a WHERE a.username = :username"),
        @NamedQuery(name = Appuser.FIND_TOKEN_BY_USERNAME, query = "SELECT a.token FROM Appuser a WHERE a.username = :username"),
        @NamedQuery(name = Appuser.FIND_BY_ACTIVATION_TOKEN, query = "select u from Appuser u where u.activationToken = :activationToken"),
        @NamedQuery(name = Appuser.UPDATE_BY_ACTIVATION_TOKEN, query = "UPDATE Appuser u set u.accountStatus = :accountStatus where u.activationToken = :activationToken"),
        @NamedQuery(name = Appuser.UPDATE_PASSWORD_TOKEN, query = "UPDATE Appuser u set u.passwordReset = :passwordReset," +
        		" u.activationTokenExpiresOn = :expirationDate, u.activationToken = :activationToken" +
        		" where u.username = :emailId"),
        @NamedQuery(name = Appuser.UPDATE_PASSWORD_BY_TOKEN, query = "UPDATE Appuser u set u.passwordReset = :passwordReset, u.pass = :password" +
                		" where u.activationToken = :activationToken"),
        @NamedQuery(name = Appuser.UPDATE_PASSWORD_BY_EMAIL, query = "UPDATE Appuser u set u.pass = :password where u.username = :emailId"),
        @NamedQuery(name = Appuser.FIND_ID_BY_SID, query = "select a.id from Appuser a where hex(a.sid) = :sid"),
        @NamedQuery(name = Appuser.FIND_USERNAME_BY_TOKEN, query = "select lower(a.username) from Appuser a where a.token = :TOKEN"),
        @NamedQuery(name = Appuser.VALIDATE_GOOGLE_ACCESS_TOKEN, query = "select lower(a.username) from Appuser a where a.googleAccessToken = :TOKEN"),
        @NamedQuery(name = Appuser.UPDATE_GOOGLE_TOKEN_BY_EMAIL, query = "UPDATE Appuser a set a.googleAccessToken = :TOKEN where a.username = :emailId")
     })
public class Appuser extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Appuser.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_SID = PREFIX + "findBySid";
    public static final String FIND_BY_USER_NAME = PREFIX + "findByUserName";
    public static final String FIND_PASSWORD_BY_USERNAME = PREFIX + "findPasswordByUserName";
    public static final String FIND_TOKEN_BY_USERNAME = PREFIX + "findTokenByUsername";
    public static final String FIND_BY_ACTIVATION_TOKEN = PREFIX + "findUserByActivationToken";
    public static final String UPDATE_BY_ACTIVATION_TOKEN = PREFIX + "updateByActivationToken";
    public static final String UPDATE_PASSWORD_TOKEN = PREFIX + "updatePasswordToken";
    public static final String UPDATE_PASSWORD_BY_TOKEN = PREFIX + "updatePasswordByToken";
    public static final String UPDATE_PASSWORD_BY_EMAIL = PREFIX + "updatePasswordByEmail";
    public static final String FIND_ID_BY_SID = PREFIX + "findIdBySid";
    public static final String FIND_USERNAME_BY_TOKEN = PREFIX + "findUserNameByToken";
    public static final String VALIDATE_GOOGLE_ACCESS_TOKEN = PREFIX + "validateGoogleAccessToken";
    public static final String UPDATE_GOOGLE_TOKEN_BY_EMAIL = PREFIX + "udpateGoogleTokenByEmail";
    public static final String FIND_ID_BY_EMAIL = PREFIX + "findIdByEmail";
    
	private static final long serialVersionUID = 1L;
	
	public static final String STATUS_LOCKED="LOCKED";
	public static final String STATUS_ACTIVE="ACTIVE";
	public static final String STATUS_INACTIVE="INACTIVE";
	public static final String STATUS_REOPEN="REOPEN";
	public static final String STATUS_CLOSED="CLOSED";
	public static String UPDATE_DONT_SHOW_STATUS="update appuser set dont_show=:status where username=:email";

	@Column(name="account_status")
	private String accountStatus;

	@Column(name="activation_token")
	private String activationToken;

	@Column(name="activation_token_expires_on")
	private Timestamp activationTokenExpiresOn;

	@Column(name="alternate_email_id")
	private String alternateEmailId;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	@Column(name="display_name")
	private String displayName;
	
	@Column(name="public_name")
	private String publicName;

    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 254)
	@Column(name="username")
	private String username;

	@Column(name="facebook_link")
	private String facebookLink;

	@Column(name="first_name")
	private String firstName;

	private String gender;

	@Column(name="last_name")
	private String lastName;

	@Column(name="linkedin_link")
	private String linkedinLink;

	@Column(name="member_since")
	private Timestamp memberSince;

    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 128)
	@Column(name = "pass")
	private String pass;

	@Column(name="password_reset")
	private Boolean passwordReset;

	@Column(name="reference_through")
	private String referenceThrough;

	@Column(name="twitter_link")
	private String twitterLink;
    @Column(name="primary_contact")
    private String primaryContact;
    
    @Column(name="mobile_number")
    private String mobileNumber;
    
    @Column(name="photo_url")
    private String photoUrl;
    
    private String hostname;
    
    private String token;
    
    @Column(name = "google_access_token")
    private String googleAccessToken;
    
    @Column(name = "recent_login")
    private Timestamp recentLogin;
    
    @Column(name="dont_show")
	private boolean isShow;
    
    @Enumerated(EnumType.STRING)
	@Column(name="signup_type")
	private SignupType signupType;

	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;

	//bi-directional many-to-one association to Timezone
	@ManyToOne
	@JoinColumn(name = "timezone_id")
	private Timezone timezone;

	//bi-directional many-to-one association to UserContact
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "user_id", nullable = false)
	private List<UserContact> userContacts;

	//bi-directional many-to-one association to UserHasAddress
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "user_id", nullable = false)
	private List<UserHasAddress> userHasAddresses;

    @OneToMany(mappedBy = "user")
    private List<VirtualAccount> virtualAccountList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appuser")
    private List<AppuserHasSkill> appuserHasSkillList;
    
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "appuser_id", nullable = false)
    private List<UserHasSocialNetwork> userHasSocialNetworks;
    
   /* @OneToMany
    @JoinColumn(name = "appuser_id", referencedColumnName = "id")
    private List<AppuserHasAppSetting> userHasAppSettings;*/
    
	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Appuser() {
	}

    public Appuser(Integer id) {
        this.id = id;
    }

    public Appuser(Integer id, String username, String pass) {
        this.id = id;
        this.username = username;
        this.pass = pass;
    }

	public String getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getActivationToken() {
		return this.activationToken;
	}

	public void setActivationToken(String activationToken) {
		this.activationToken = activationToken;
	}

	public Timestamp getActivationTokenExpiresOn() {
		return this.activationTokenExpiresOn;
	}

	public void setActivationTokenExpiresOn(Timestamp activationTokenExpiresOn) {
		this.activationTokenExpiresOn = activationTokenExpiresOn;
	}

	public String getAlternateEmailId() {
		return this.alternateEmailId;
	}

	public void setAlternateEmailId(String alternateEmailId) {
		this.alternateEmailId = alternateEmailId;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFacebookLink() {
		return this.facebookLink;
	}

	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLinkedinLink() {
		return this.linkedinLink;
	}

	public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}

	public Timestamp getMemberSince() {
		return this.memberSince;
	}

	public void setMemberSince(Timestamp memberSince) {
		this.memberSince = memberSince;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Boolean getPasswordReset() {
		return this.passwordReset;
	}

	public void setPasswordReset(Boolean passwordReset) {
		this.passwordReset = passwordReset;
	}

	public String getReferenceThrough() {
		return this.referenceThrough;
	}

	public void setReferenceThrough(String referenceThrough) {
		this.referenceThrough = referenceThrough;
	}

	public String getTwitterLink() {
		return this.twitterLink;
	}

	public void setTwitterLink(String twitterLink) {
		this.twitterLink = twitterLink;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Timezone getTimezone() {
		return this.timezone;
	}

	public void setTimezone(Timezone timezone) {
		this.timezone = timezone;
	}

	public List<UserContact> getUserContacts() {
		return this.userContacts;
	}

	public void setUserContacts(List<UserContact> userContacts) {
		this.userContacts = userContacts;
	}

	public List<UserHasAddress> getUserHasAddresses() {
		return this.userHasAddresses;
	}

	public void setUserHasAddresses(List<UserHasAddress> userHasAddresses) {
		this.userHasAddresses = userHasAddresses;
	}

    @XmlTransient
    public List<VirtualAccount> getVirtualAccountList() {
        return virtualAccountList;
    }

    public void setVirtualAccountList(List<VirtualAccount> virtualAccountList) {
        this.virtualAccountList = virtualAccountList;
    }

    @XmlTransient
    public List<AppuserHasSkill> getAppuserHasSkillList() {
        return appuserHasSkillList;
    }

    public void setAppuserHasSkillList(List<AppuserHasSkill> appuserHasSkillList) {
        this.appuserHasSkillList = appuserHasSkillList;
    }
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Appuser)) {
            return false;
        }
        Appuser other = (Appuser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.Appuser[ id=" + id + " ]";
    }

	public List<UserHasSocialNetwork> getUserHasSocialNetworks() {
		return userHasSocialNetworks;
	}

	public void setUserHasSocialNetworks(
			List<UserHasSocialNetwork> userHasSocialNetworks) {
		this.userHasSocialNetworks = userHasSocialNetworks;
	}

	public String getPublicName() {
		return publicName;
	}

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getGoogleAccessToken() {
		return googleAccessToken;
	}

	public void setGoogleAccessToken(String googleAccessToken) {
		this.googleAccessToken = googleAccessToken;
	}

	public Timestamp getRecentLogin() {
		return recentLogin;
	}

	public void setRecentLogin(Timestamp recentLogin) {
		this.recentLogin = recentLogin;
	}
	/*public List<AppuserHasAppSetting> getUserHasAppSettings() {
		return userHasAppSettings;
	}

	public void setUserHasAppSettings(List<AppuserHasAppSetting> userHasAppSettings) {
		this.userHasAppSettings = userHasAppSettings;
	}*/

	public SignupType getSignupType() {
		return signupType;
	}

	public void setSignupType(SignupType signupType) {
		this.signupType = signupType;
	}

}