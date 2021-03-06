package com.med.ods.entity;
// Generated Dec 19, 2016 4:16:39 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TaskServiceTbl generated by hbm2java
 */
@Entity
@Table(name = "TASK_SERVICE_TBL")
public class TaskServiceTbl implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2706249913814530862L;
	private Integer taskServiceId;
	private String taskServiceName;
	private String impmName;
	private Set<TaskEndpoint> taskEndpoints = new HashSet<TaskEndpoint>(0);

	public TaskServiceTbl() {
	}

	public TaskServiceTbl(String taskServiceName, String impmName, Set<TaskEndpoint> taskEndpoints) {
		this.taskServiceName = taskServiceName;
		this.impmName = impmName;
		this.taskEndpoints = taskEndpoints;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "TASK_SERVICE_ID", unique = true, nullable = false)
	public Integer getTaskServiceId() {
		return this.taskServiceId;
	}

	public void setTaskServiceId(Integer taskServiceId) {
		this.taskServiceId = taskServiceId;
	}

	@Column(name = "TASK_SERVICE_NAME", length = 30)
	public String getTaskServiceName() {
		return this.taskServiceName;
	}

	public void setTaskServiceName(String taskServiceName) {
		this.taskServiceName = taskServiceName;
	}

	@Column(name = "IMPM_NAME", length = 45)
	public String getImpmName() {
		return this.impmName;
	}

	public void setImpmName(String impmName) {
		this.impmName = impmName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taskServiceTbl")
	public Set<TaskEndpoint> getTaskEndpoints() {
		return this.taskEndpoints;
	}

	public void setTaskEndpoints(Set<TaskEndpoint> taskEndpoints) {
		this.taskEndpoints = taskEndpoints;
	}

}
