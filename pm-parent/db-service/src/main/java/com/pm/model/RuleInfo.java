/**
 * 
 */
package com.pm.model;

import java.util.Date;

/**
 * @author prasadj
 *
 */
public class RuleInfo {

	private Long id;
	
	private String name;
	
	private String description;
	
	private String params;
	
	private boolean state;
	
	private Date creationDate;
	
	private Date updatedDate;
	
	public RuleInfo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public RuleInfo clone() {
		RuleInfo ri = new RuleInfo();
		ri.setId(id);
		ri.setName(name);
		ri.setDescription(description);
		ri.setState(state);
		ri.setParams(params);
		ri.setCreationDate(creationDate);
		ri.setUpdatedDate(updatedDate);
		return ri;
	}
	
}