package com.zcurd.account.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysRoleDatarule<M extends BaseSysRoleDatarule<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public M setRoleId(java.lang.Integer roleId) {
		set("role_id", roleId);
		return (M)this;
	}

	public java.lang.Integer getRoleId() {
		return get("role_id");
	}

	public M setDataruleId(java.lang.Integer dataruleId) {
		set("datarule_id", dataruleId);
		return (M)this;
	}

	public java.lang.Integer getDataruleId() {
		return get("datarule_id");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
