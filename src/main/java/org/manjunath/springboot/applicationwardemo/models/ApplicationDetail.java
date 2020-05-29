package org.manjunath.springboot.applicationwardemo.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationDetail implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2954259256583583670L;

	@JsonProperty("app_name")
	private String _appName;
	
	@JsonProperty("version")
	private String _appVersion;
	
	@JsonProperty("description")
	private String _appDescription;
	
	public ApplicationDetail() {}

	public ApplicationDetail(String _appName, String _appVersion, String _appDescription) {
		this._appName = _appName;
		this._appVersion = _appVersion;
		this._appDescription = _appDescription;
	}

	public String get_appName() {
		return _appName;
	}

	public void set_appName(String _appName) {
		this._appName = _appName;
	}

	public String get_appVersion() {
		return _appVersion;
	}

	public void set_appVersion(String _appVersion) {
		this._appVersion = _appVersion;
	}

	public String get_appDescription() {
		return _appDescription;
	}

	public void set_appDescription(String _appDescription) {
		this._appDescription = _appDescription;
	}
}
