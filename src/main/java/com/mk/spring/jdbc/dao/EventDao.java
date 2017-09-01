package com.mk.spring.jdbc.dao;

import com.mk.spring.jdbc.model.CatEventMessage;

public interface EventDao {

	public void createCatEvent(CatEventMessage event);
}
