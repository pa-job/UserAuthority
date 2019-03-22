package cn.soa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.soa.dao.EquipmentManagerMapper;
import cn.soa.entity.EquipmentInfo;
import cn.soa.entity.EquipmentType;
import cn.soa.service.inter.EquipmentManagerInter;
@Service
public class EquipmentManagerImpl  implements EquipmentManagerInter{
	@Autowired
	private  EquipmentManagerMapper EquipmentManagerDao;
	@Override
	public List<EquipmentType> queryAllTypeOfEqu() {
		// TODO Auto-generated method stub
		return EquipmentManagerDao.queryAllTypeOfEqu();
	}

	@Override
	public List<EquipmentInfo> queryAllEqusByCondition( Integer typeId, Integer equState, Integer page, Integer pageSize) {
		System.out.println("typeId"+typeId);
		return EquipmentManagerDao.queryAllEqusByCondition(typeId,equState,page,pageSize);
	}

	@Override
	public Integer QueryEquCount( Integer typeId, Integer equState) {
		// TODO Auto-generated method stub
		return EquipmentManagerDao.QueryEquCount(typeId,equState);
	}

	@Override
	public Integer updateEquBaseInfo(EquipmentInfo info) {
		// TODO Auto-generated method stub
		return EquipmentManagerDao.updateEquBaseInfo(info);
	}

	@Override
	public Integer insertEquBaseInfo(EquipmentInfo info) {
		// TODO Auto-generated method stub
		return EquipmentManagerDao.insertEquBaseInfo(info);
	}

	@Override
	public Integer deleteEquBaseInfo(int equId) {
		// TODO Auto-generated method stub
		return EquipmentManagerDao.deleteEquBaseInfo(equId);
	}

}