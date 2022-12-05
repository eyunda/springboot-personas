package com.tutoria1.demo.Modelo;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6548148699162610858L;
	private String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }

}