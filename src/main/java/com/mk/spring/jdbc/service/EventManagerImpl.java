package com.mk.spring.jdbc.service;

import org.springframework.transaction.annotation.Transactional;

import com.mk.spring.jdbc.dao.EventDao;
import com.mk.spring.jdbc.model.CatEventMessage;

public class EventManagerImpl implements EventManager{

	private EventDao eventDao;
	
	public void setEventDao(EventDao eventDao) {
		this.eventDao = eventDao;
	}

	@Override
	@Transactional
	public void createCatEvent(CatEventMessage event) {
		eventDao.createCatEvent(event);
	}

}
