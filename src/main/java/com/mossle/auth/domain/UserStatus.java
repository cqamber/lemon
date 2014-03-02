package com.mossle.auth.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * UserStatus .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "AUTH_USER_STATUS")
public class UserStatus implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String username;

    /** null. */
    private String password;

    /** null. */
    private Integer status;

    /** null. */
    private String ref;

    /** null. */
    private String userRepoRef;

    /** null. */
    private String scopeId;

    /** . */
    private Set<Role> roles = new HashSet<Role>(0);

    public UserStatus() {
    }

    public UserStatus(String username, String password, Integer status,
            String ref, String userRepoRef, String scopeId, Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.status = status;
        this.ref = ref;
        this.userRepoRef = userRepoRef;
        this.scopeId = scopeId;
        this.roles = roles;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "USERNAME", length = 50)
    public String getUsername() {
        return this.username;
    }

    /**
     * @param username
     *            null.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /** @return null. */
    @Column(name = "PASSWORD", length = 50)
    public String getPassword() {
        return this.password;
    }

    /**
     * @param password
     *            null.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** @return null. */
    @Column(name = "STATUS")
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "REF", length = 200)
    public String getRef() {
        return this.ref;
    }

    /**
     * @param ref
     *            null.
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /** @return null. */
    @Column(name = "USER_REPO_REF", length = 50)
    public String getUserRepoRef() {
        return this.userRepoRef;
    }

    /**
     * @param userRepoRef
     *            null.
     */
    public void setUserRepoRef(String userRepoRef) {
        this.userRepoRef = userRepoRef;
    }

    /** @return null. */
    @Column(name = "SCOPE_ID", length = 50)
    public String getScopeId() {
        return this.scopeId;
    }

    /**
     * @param scopeId
     *            null.
     */
    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    /** @return . */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "AUTH_USER_ROLE", joinColumns = { @JoinColumn(name = "USER_STATUS_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID", nullable = false, updatable = false) })
    public Set<Role> getRoles() {
        return this.roles;
    }

    /**
     * @param roles
     *            .
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
