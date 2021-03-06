package com.vstu.service.interfaces;

import java.util.List;

import com.vstu.entity.GroupUnit;

public interface IGroupUnitService {
	List<GroupUnit> getAllGroupUnit();

	List<GroupUnit> getAllByGroupComponentId(Long id);

	GroupUnit getGroupUnitById(Long idGr);

	boolean addGroupUnit(GroupUnit g);

	void updateGroupUnit(GroupUnit g);

	void deleteGroupUnit(Long idGr);

	boolean existsGroupUnit(Long idGr);

}
